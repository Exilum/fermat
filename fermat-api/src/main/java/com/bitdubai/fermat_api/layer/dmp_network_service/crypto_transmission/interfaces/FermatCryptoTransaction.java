package com.bitdubai.fermat_api.layer.dmp_network_service.crypto_transmission.interfaces;

import java.util.UUID;

/**
 * The interface <code>com.bitdubai.fermat_api.layer.dmp_network_service.crypto_transmission.interfaces.FermatCryptoTransaction</code>
 * provides the methods to obtain the meta data associated to a crypto transaction.
 *
 * @author Ezequiel Postan
 */
public interface FermatCryptoTransaction {

    /**
     *
     * @return true if it is the transaction generated by a payment request. Otherwise returns false
     */
    boolean isAnswerToAPaymentRequest();

    /**
     *
     * @return the identifier of the payment request (if any)
     */
    UUID getRequestId();

    /**
     *
     * @return the public key of the identity sending the payment
     */
    String getSenderPublicKey();

    /**
     *
     * @return the public key of the identity receiving the payment
     */
    String getDestinationPublicKey();

    /**
     *
     * @return the hash of the crypto transaction that carries the actual value of this transaction
     */
    String getAssociatedCryptoTransactionHash();

    /**
     *
     * @return a description of the transaction
     */
    String getPaymentDescription();
}
