package com.lncwallet.core.coins;

import com.lncwallet.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class LightningcashrMain extends BitFamily {
    private LightningcashrMain() {
        id = "lightningcashr.main";

        addressHeader = 28;
        p2shHeader = 50;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 125;
        dumpedPrivateKeyHeader = 176;

        name = "Lightningcashr";
        symbol = "LNCR";
        uriScheme = "lightningcashr";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 LNC mininput
        softDustLimit = value(100000); // 0.001 LNC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Lightning Signed Message:\n");
    }

    private static LightningcashrMain instance = new LightningcashrMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
