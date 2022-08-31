package com.lncwallet.core.coins;

import com.lncwallet.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class LightningcashMain extends BitFamily {
    private LightningcashMain() {
        id = "lightningcash.main";

        addressHeader = 28;
        p2shHeader = 50;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 125;
        dumpedPrivateKeyHeader = 176;

        name = "Lightningcash";
        symbol = "LNC";
        uriScheme = "lightningcash";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 LNC mininput
        softDustLimit = value(100000); // 0.001 LNC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Lightning Signed Message:\n");
    }

    private static LightningcashMain instance = new LightningcashMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
