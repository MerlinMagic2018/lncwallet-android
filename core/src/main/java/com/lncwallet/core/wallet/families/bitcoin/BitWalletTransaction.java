package com.lncwallet.core.wallet.families.bitcoin;

import com.lncwallet.core.wallet.WalletTransaction;

/**
 * @author John L. Jegutanis
 */
public class BitWalletTransaction extends WalletTransaction<BitTransaction> {
    public BitWalletTransaction(Pool pool, BitTransaction transaction) {
        super(pool, transaction);
    }
}
