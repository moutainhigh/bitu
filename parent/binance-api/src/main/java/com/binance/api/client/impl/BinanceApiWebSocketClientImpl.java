package com.binance.api.client.impl;

import com.binance.api.client.BinanceApiCallback;
import com.binance.api.client.BinanceApiWebSocketClient;
import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.event.*;
import com.binance.api.client.domain.market.CandlestickInterval;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;

import java.io.Closeable;
import java.util.List;

/**
 * Binance API WebSocket client implementation using OkHttp.
 */
public class BinanceApiWebSocketClientImpl implements BinanceApiWebSocketClient, Closeable {

    private OkHttpClient client;

    public BinanceApiWebSocketClientImpl() {
        Dispatcher d = new Dispatcher();
        d.setMaxRequestsPerHost(1000);
        this.client = new OkHttpClient.Builder().dispatcher(d).build();
    }

    public Closeable onDepthEvent(String symbol, BinanceApiCallback<DepthEvent> callback) {
        final String channel = String.format("%s@depth", symbol);
        return createNewWebSocket(channel, new ApiWebSocketListener<>(callback, DepthEvent.class));
    }

    public Closeable onDepthEvent(String symbol,Integer level, BinanceApiCallback<OrderBookEvent> callback) {
        final String channel = String.format("%s@depth%s", symbol,level);
        return createNewWebSocket(channel, new ApiWebSocketListener<>(callback, OrderBookEvent.class));
    }

    @Override
    public Closeable onCandlestickEvent(String symbol, CandlestickInterval interval, BinanceApiCallback<CandlestickEvent> callback) {
        final String channel = String.format("%s@kline_%s", symbol, interval.getIntervalId());
        return createNewWebSocket(channel, new ApiWebSocketListener<>(callback, CandlestickEvent.class));
    }

    public Closeable onAggTradeEvent(String symbol, BinanceApiCallback<AggTradeEvent> callback) {
        final String channel = String.format("%s@aggTrade", symbol);
        return createNewWebSocket(channel, new ApiWebSocketListener<>(callback, AggTradeEvent.class));
    }

    public Closeable onTradeEvent(String symbol, BinanceApiCallback<TradeEvent> callback) {
        final String channel = String.format("%s@trade", symbol);
        return createNewWebSocket(channel, new ApiWebSocketListener<>(callback, TradeEvent.class));
    }

    public Closeable onUserDataUpdateEvent(String listenKey, BinanceApiCallback<UserDataUpdateEvent> callback) {
        return createNewWebSocket(listenKey, new ApiWebSocketListener<>(callback, UserDataUpdateEvent.class));
    }

    public Closeable onAllMarketTickersEvent(BinanceApiCallback<List<AllMarketTickersEvent>> callback) {
        final String channel = "!ticker@arr";
        return createNewWebSocket(channel, new ApiWebSocketListener<List<AllMarketTickersEvent>>(callback));
    }

    @Override
    public void close() {
        client.dispatcher().executorService().shutdown();
    }

    private Closeable createNewWebSocket(String channel, ApiWebSocketListener<?> listener) {
        String streamingUrl = String.format("%s/%s", BinanceApiConstants.WS_API_BASE_URL, channel);
        Request request = new Request.Builder().url(streamingUrl).build();
        final WebSocket webSocket = client.newWebSocket(request, listener);
        return () -> {
            final int code = 1000;
            listener.onClosing(webSocket, code, null);
            webSocket.close(code, null);
            listener.onClosed(webSocket, code, null);
        };
    }
}
