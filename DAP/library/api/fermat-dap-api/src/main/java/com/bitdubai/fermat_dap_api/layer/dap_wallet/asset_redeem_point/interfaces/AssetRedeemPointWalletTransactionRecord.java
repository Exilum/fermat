package com.bitdubai.fermat_dap_api.layer.dap_wallet.asset_redeem_point.interfaces;

import com.bitdubai.fermat_api.layer.all_definition.enums.Actors;
import com.bitdubai.fermat_api.layer.all_definition.money.CryptoAddress;
import com.bitdubai.fermat_dap_api.layer.all_definition.digital_asset.DigitalAsset;

import java.util.UUID;

/**
 * Created by franklin on 14/10/15.
 */
public interface AssetRedeemPointWalletTransactionRecord {
    //TODO: Definir bien las propiedades
    DigitalAsset getDigitalAsset();
    String getDigitalAssetPublicKey();
    String getName();
    String getDescription();

    CryptoAddress getAddressFrom();
    String getActorFromPublicKey();
    Actors getActorFromType();

    CryptoAddress getAddressTo();
    String getActorToPublicKey();
    Actors getActorToType();

    String getIdTransaction();

    long getAmount();

    long getTimestamp();

    String getMemo();

    String getDigitalAssetMetadataHash();
}
