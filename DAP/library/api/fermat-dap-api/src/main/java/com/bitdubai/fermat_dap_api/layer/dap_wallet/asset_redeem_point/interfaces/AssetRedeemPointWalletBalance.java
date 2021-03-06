package com.bitdubai.fermat_dap_api.layer.dap_wallet.asset_redeem_point.interfaces;

import com.bitdubai.fermat_dap_api.layer.dap_wallet.asset_issuer_wallet.exceptions.CantCalculateBalanceException;
import com.bitdubai.fermat_dap_api.layer.dap_wallet.asset_issuer_wallet.exceptions.CantRegisterCreditException;
import com.bitdubai.fermat_dap_api.layer.dap_wallet.asset_issuer_wallet.exceptions.CantRegisterDebitException;
import com.bitdubai.fermat_dap_api.layer.dap_wallet.common.enums.BalanceType;

import java.util.List;

/**
 * Created by franklin on 14/10/15.
 */
public interface AssetRedeemPointWalletBalance {
    //TODO: Documentar
    long getBalance()  throws CantCalculateBalanceException;

    List<AssetRedeemPointWalletList> getAssetIssuerWalletBalancesAvailable() throws CantCalculateBalanceException;

    List<AssetRedeemPointWalletList> getAssetIssuerWalletBalancesBook() throws CantCalculateBalanceException;

    void debit(AssetRedeemPointWalletTransactionRecord assetRedeemPointWalletTransactionRecord, BalanceType balanceType) throws CantRegisterDebitException; //TODO: Debemos de definir la estructura de la transaccion

    void credit(AssetRedeemPointWalletTransactionRecord assetRedeemPointWalletTransactionRecord, BalanceType balanceType)  throws CantRegisterCreditException; //TODO: Debemos de definir la estructura de la transaccion

}
