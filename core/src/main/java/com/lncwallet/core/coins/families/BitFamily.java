package com.lncwallet.core.coins.families;

import com.lncwallet.core.coins.CoinType;
import com.lncwallet.core.wallet.AbstractAddress;
import com.lncwallet.core.exceptions.AddressMalformedException;
import com.lncwallet.core.wallet.families.bitcoin.BitAddress;

import org.bitcoinj.core.AddressFormatException;

/**
 * @author John L. Jegutanis
 *
 * This is the classical Bitcoin family that includes Litecoin, Dogecoin, Dash, etc
 */
public abstract class BitFamily extends CoinType {
    {
        family = Families.BITCOIN;
    }

    @Override
    public BitAddress newAddress(String addressStr) throws AddressMalformedException {
        return BitAddress.from(this, addressStr);
    }
}
