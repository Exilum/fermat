package com.bitdubai.reference_niche_wallet.bitcoin_wallet.fragments.wallet_final_version;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bitdubai.android_fermat_ccp_wallet_bitcoin.R;
import com.bitdubai.fermat_android_api.ui.adapters.FermatAdapter;
import com.bitdubai.fermat_android_api.ui.enums.FermatRefreshTypes;
import com.bitdubai.fermat_android_api.ui.fragments.FermatWalletListFragment;
import com.bitdubai.fermat_android_api.ui.interfaces.FermatListItemListeners;
import com.bitdubai.fermat_api.layer.all_definition.navigation_structure.enums.Wallets;
import com.bitdubai.fermat_api.layer.dmp_basic_wallet.common.enums.BalanceType;
import com.bitdubai.fermat_api.layer.dmp_basic_wallet.common.enums.TransactionType;
import com.bitdubai.fermat_api.layer.dmp_wallet_module.crypto_wallet.exceptions.CantGetAllWalletContactsException;
import com.bitdubai.fermat_api.layer.dmp_wallet_module.crypto_wallet.interfaces.CryptoWallet;
import com.bitdubai.fermat_api.layer.dmp_wallet_module.crypto_wallet.interfaces.CryptoWalletTransaction;
import com.bitdubai.fermat_api.layer.dmp_wallet_module.crypto_wallet.interfaces.CryptoWalletWalletContact;
import com.bitdubai.fermat_pip_api.layer.pip_platform_service.error_manager.UnexpectedWalletExceptionSeverity;
import com.bitdubai.reference_niche_wallet.bitcoin_wallet.common.adapters.TransactionHistoryAdapter;
import com.bitdubai.reference_niche_wallet.bitcoin_wallet.common.bar_code_scanner.IntentIntegrator;
import com.bitdubai.reference_niche_wallet.bitcoin_wallet.common.contacts_list_adapter.WalletContact;
import com.bitdubai.reference_niche_wallet.bitcoin_wallet.common.contacts_list_adapter.WalletContactListAdapter;
import com.bitdubai.reference_niche_wallet.bitcoin_wallet.common.custom_anim.Fx;
import com.bitdubai.reference_niche_wallet.bitcoin_wallet.session.ReferenceWalletSession;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

import static com.bitdubai.reference_niche_wallet.bitcoin_wallet.common.utils.WalletUtils.showMessage;

/**
 * Created by mati on 2015.09.28..
 */
public class TransactionsSendHistory extends FermatWalletListFragment<CryptoWalletTransaction> implements FermatListItemListeners<CryptoWalletTransaction> {


    /**
     * MANAGERS
     */
    private CryptoWallet cryptoWallet;

    /**
     * Session
     */
    ReferenceWalletSession referenceWalletSession;

    /**
     * DATA
     */
    private List<CryptoWalletTransaction> lstCryptoWalletTransactions;
    private CryptoWalletTransaction selectedItem;

    /**
     * Executor Service
     */
    private ExecutorService executor;

    private int MAX_TRANSACTIONS = 20;
    private int offset = 0;





    /**
     * Create a new instance of this fragment
     *
     * @return InstalledFragment instance object
     */
    public static TransactionsSendHistory newInstance() {
        TransactionsSendHistory requestPaymentFragment = new TransactionsSendHistory();
        return new TransactionsSendHistory();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        referenceWalletSession = (ReferenceWalletSession)walletSession;

        super.onCreate(savedInstanceState);
        try {
            cryptoWallet = referenceWalletSession.getCryptoWalletManager().getCryptoWallet();

            lstCryptoWalletTransactions = getMoreDataAsync(FermatRefreshTypes.NEW, 0); // get init data
        } catch (Exception ex) {
            //CommonLogger.exception(TAG, ex.getMessage(), ex);
        }
    }



    @Override
    protected boolean hasMenu() {
        return false;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.transaction_main_fragment;
    }

    @Override
    protected int getSwipeRefreshLayoutId() {
        return R.id.swipe_refresh;
    }

    @Override
    protected int getRecyclerLayoutId() {
        return R.id.transactions_recycler_view;
    }

    @Override
    protected boolean recyclerHasFixedSize() {
        return true;
    }


    @Override
    @SuppressWarnings("unchecked")
    public FermatAdapter getAdapter() {
        if (adapter == null) {
            //WalletStoreItemPopupMenuListener listener = getWalletStoreItemPopupMenuListener();
            adapter = new TransactionHistoryAdapter(getActivity(), lstCryptoWalletTransactions,cryptoWallet,referenceWalletSession);
            adapter.setFermatListEventListener(this); // setting up event listeners
        }
        return adapter;
    }

    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        if (layoutManager == null) {
            layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        }
        return layoutManager;
    }

    @Override
    public List<CryptoWalletTransaction> getMoreDataAsync(FermatRefreshTypes refreshType, int pos) {
        List<CryptoWalletTransaction> lstTransactions  = null;

        try {
            lstTransactions = cryptoWallet.getTransactions(BalanceType.AVAILABLE,TransactionType.DEBIT,referenceWalletSession.getWalletSessionType().getWalletPublicKey(), MAX_TRANSACTIONS, offset);
            offset += MAX_TRANSACTIONS;
        } catch (Exception e) {
//            referenceWalletSession.getErrorManager().reportUnexpectedWalletException(e,
//                    UnexpectedSubAppExceptionSeverity.DISABLES_SOME_FUNCTIONALITY_WITHIN_THIS_FRAGMENT, e);
            e.printStackTrace();
            // data = RequestPaymentListItem.getTestData(getResources());
        }

        return lstTransactions;
    }

    @Override
    public void onItemClickListener(CryptoWalletTransaction item, int position) {
        selectedItem = item;
        //showDetailsActivityFragment(selectedItem);
    }

    /**
     * On Long item Click Listener
     *
     * @param data
     * @param position
     */
    @Override
    public void onLongItemClickListener(CryptoWalletTransaction data, int position) {

    }


    @Override
    public void onPostExecute(Object... result) {
        isRefreshing = false;
        if (isAttached) {
            swipeRefreshLayout.setRefreshing(false);
            if (result != null && result.length > 0) {
                lstCryptoWalletTransactions = (ArrayList) result[0];
                if (adapter != null)
                    adapter.changeDataSet(lstCryptoWalletTransactions);
            }
        }
    }

    @Override
    public void onErrorOccurred(Exception ex) {
        isRefreshing = false;
        if (isAttached) {
            swipeRefreshLayout.setRefreshing(false);
            //CommonLogger.exception(TAG, ex.getMessage(), ex);
        }
    }



    public void setReferenceWalletSession(ReferenceWalletSession referenceWalletSession) {
        this.referenceWalletSession = referenceWalletSession;
    }




}
