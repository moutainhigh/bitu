package com.bitm.model.constants;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: jinxian.dou
 * @CreateDate: 2018/5/24 13:53
 */
public class CommonConstants {
    public static final Integer ORDER_BOOK_LEVEL = 5; //查询买一到买五，卖一到卖五book
    public static final String ALL_SYMBOLS = "ETHBTC,LTCBTC,BNBBTC,NEOBTC,QTUMETH,EOSETH,SNTETH,BNTETH,BCCBTC,GASBTC,BNBETH,BTCUSDT,ETHUSDT,HSRBTC,OAXETH,DNTETH,MCOETH,ICNETH,MCOBTC,WTCBTC,WTCETH,LRCBTC,LRCETH,QTUMBTC,YOYOBTC,OMGBTC,OMGETH,ZRXBTC,ZRXETH,STRATBTC,STRATETH,SNGLSBTC,SNGLSETH,BQXBTC,BQXETH,KNCBTC,KNCETH,FUNBTC,FUNETH,SNMBTC,SNMETH,NEOETH,IOTABTC,IOTAETH,LINKBTC,LINKETH,XVGBTC,XVGETH,SALTBTC,SALTETH,MDABTC,MDAETH,MTLBTC,MTLETH,SUBBTC,SUBETH,EOSBTC,SNTBTC,ETCETH,ETCBTC,MTHBTC,MTHETH,ENGBTC,ENGETH,DNTBTC,ZECBTC,ZECETH,BNTBTC,ASTBTC,ASTETH,DASHBTC,DASHETH,OAXBTC,ICNBTC,BTGBTC,BTGETH,EVXBTC,EVXETH,REQBTC,REQETH,VIBBTC,VIBETH,HSRETH,TRXBTC,TRXETH,POWRBTC,POWRETH,ARKBTC,ARKETH,YOYOETH,XRPBTC,XRPETH,MODBTC,MODETH,ENJBTC,ENJETH,STORJBTC,STORJETH,BNBUSDT,VENBNB,YOYOBNB,POWRBNB,VENBTC,VENETH,KMDBTC,KMDETH,NULSBNB,RCNBTC,RCNETH,RCNBNB,NULSBTC,NULSETH,RDNBTC,RDNETH,RDNBNB,XMRBTC,XMRETH,DLTBNB,WTCBNB,DLTBTC,DLTETH,AMBBTC,AMBETH,AMBBNB,BCCETH,BCCUSDT,BCCBNB,BATBTC,BATETH,BATBNB,BCPTBTC,BCPTETH,BCPTBNB,ARNBTC,ARNETH,GVTBTC,GVTETH,CDTBTC,CDTETH,GXSBTC,GXSETH,NEOUSDT,NEOBNB,POEBTC,POEETH,QSPBTC,QSPETH,QSPBNB,BTSBTC,BTSETH,BTSBNB,XZCBTC,XZCETH,XZCBNB,LSKBTC,LSKETH,LSKBNB,TNTBTC,TNTETH,FUELBTC,FUELETH,MANABTC,MANAETH,BCDBTC,BCDETH,DGDBTC,DGDETH,IOTABNB,ADXBTC,ADXETH,ADXBNB,ADABTC,ADAETH,PPTBTC,PPTETH,CMTBTC,CMTETH,CMTBNB,XLMBTC,XLMETH,XLMBNB,CNDBTC,CNDETH,CNDBNB,LENDBTC,LENDETH,WABIBTC,WABIETH,WABIBNB,LTCETH,LTCUSDT,LTCBNB,TNBBTC,TNBETH,WAVESBTC,WAVESETH,WAVESBNB,GTOBTC,GTOETH,GTOBNB,ICXBTC,ICXETH,ICXBNB,OSTBTC,OSTETH,OSTBNB,ELFBTC,ELFETH,AIONBTC,AIONETH,AIONBNB,NEBLBTC,NEBLETH,NEBLBNB,BRDBTC,BRDETH,BRDBNB,MCOBNB,EDOBTC,EDOETH,WINGSBTC,WINGSETH,NAVBTC,NAVETH,NAVBNB,LUNBTC,LUNETH,TRIGBTC,TRIGETH,TRIGBNB,APPCBTC,APPCETH,APPCBNB,VIBEBTC,VIBEETH,RLCBTC,RLCETH,RLCBNB,INSBTC,INSETH,PIVXBTC,PIVXETH,PIVXBNB,IOSTBTC,IOSTETH,CHATBTC,CHATETH,STEEMBTC,STEEMETH,STEEMBNB,NANOBTC,NANOETH,NANOBNB,VIABTC,VIAETH,VIABNB,BLZBTC,BLZETH,BLZBNB,AEBTC,AEETH,AEBNB,RPXBTC,RPXETH,RPXBNB,NCASHBTC,NCASHETH,NCASHBNB,POABTC,POAETH,POABNB,ZILBTC,ZILETH,ZILBNB,ONTBTC,ONTETH,ONTBNB,STORMBTC,STORMETH,STORMBNB,QTUMBNB,QTUMUSDT,XEMBTC,XEMETH,XEMBNB,WANBTC,WANETH,WANBNB,WPRBTC,WPRETH,QLCBTC,QLCETH,SYSBTC,SYSETH,SYSBNB,QLCBNB,GRSBTC,GRSETH,ADAUSDT,ADABNB,CLOAKBTC,CLOAKETH,GNTBTC,GNTETH,GNTBNB,LOOMBTC,LOOMETH,LOOMBNB,XRPUSDT,BCNBTC,BCNETH,BCNBNB,REPBTC,REPETH,REPBNB,TUSDBTC,TUSDETH,TUSDBNB";

    public static final List TRIANGLE_SYMBOLS_BTC = Arrays.asList("BTCUSDT,ETHUSDT,ETHBTC".split(","));
    public static final List TRIANGLE_SYMBOLS_BNB = Arrays.asList("ETHBTC,BNBBTC,BNBETH".split(","));

    public static volatile List triangleSymbols = TRIANGLE_SYMBOLS_BNB;

    public static final Integer PLATFORM_BINANCE = 1; //平台 1：币安
    public static final Integer PLATFORM_FCOIN = 2; //平台 2:fcoin

    public static volatile boolean openTrade = false;
    public static volatile boolean realTrade = false;

    public static List getTriangleSymbols() {
        return triangleSymbols;
    }

    public static void setTriangleSymbols(List triangleSymbols) {
        CommonConstants.triangleSymbols = triangleSymbols;
    }

    public static boolean isOpenTrade() {
        return openTrade;
    }

    public static void setOpenTrade(boolean openTrade) {
        CommonConstants.openTrade = openTrade;
    }

    public static boolean isRealTrade() {
        return realTrade;
    }

    public static void setRealTrade(boolean realTrade) {
        CommonConstants.realTrade = realTrade;
    }

/*public static void main(String[] args) {
        String[] symbols = new String[]{"BTC", "ETH", "USDT", "BNB"};
        StringBuilder sb = new StringBuilder();
        for (String symbol : ALL_SYMBOLS.split(",")) {
            int count = 0;
            for (String n : symbols) {
                if (symbol.contains(n)) {
                    count++;
                }
            }
            if (count == 2) {
                sb.append(symbol).append(",");
            }
        }
        System.out.println(sb.toString());
    }*/
}
