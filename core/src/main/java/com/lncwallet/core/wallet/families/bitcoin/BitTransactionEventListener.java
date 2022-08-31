package com.lncwallet.core.wallet.families.bitcoin;

import com.lncwallet.core.network.AddressStatus;
import com.lncwallet.core.network.ServerClient.UnspentTx;
import com.lncwallet.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
