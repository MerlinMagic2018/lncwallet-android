package com.lncwallet.core.wallet.families.bitcoin;

import com.lncwallet.core.network.AddressStatus;
import com.lncwallet.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
