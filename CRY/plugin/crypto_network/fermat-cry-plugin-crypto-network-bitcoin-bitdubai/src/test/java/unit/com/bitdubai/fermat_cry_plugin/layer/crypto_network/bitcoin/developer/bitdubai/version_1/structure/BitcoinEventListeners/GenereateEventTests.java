package unit.com.bitdubai.fermat_cry_plugin.layer.crypto_network.bitcoin.developer.bitdubai.version_1.structure.BitcoinEventListeners;

import com.bitdubai.fermat_api.layer.osa_android.logger_system.LogManager;
import com.bitdubai.fermat_cry_plugin.layer.crypto_network.bitcoin.developer.bitdubai.version_1.structure.BitcoinEventListeners;

import org.bitcoinj.core.AbstractBlockChain;
import org.bitcoinj.core.AbstractBlockChain.NewBlockType;
import org.bitcoinj.core.Peer;
import org.bitcoinj.core.StoredBlock;
import org.bitcoinj.core.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by rodrigo on 2015.07.15..
 */
@RunWith(MockitoJUnitRunner.class)
public class GenereateEventTests {

    @Mock
    Transaction tx;
    @Mock
    StoredBlock storedBlock;

    NewBlockType newBlockType;
    @Mock
    LogManager logManager;
    @Mock
    Peer peer;


    @Test
    public void testReceiveFromBlock(){
        BitcoinEventListeners bitcoinEventListeners = new BitcoinEventListeners();
        bitcoinEventListeners.setLogManager(logManager);
        newBlockType = NewBlockType.BEST_CHAIN;

        bitcoinEventListeners.receiveFromBlock(tx, storedBlock, newBlockType, 1);
    }

    @Test
    public void testOnChainDownloadStart(){
        BitcoinEventListeners bitcoinEventListeners = new BitcoinEventListeners();
        bitcoinEventListeners.setLogManager(logManager);


        bitcoinEventListeners.onChainDownloadStarted(peer, 2);
    }

    @Test
    public void testOnPeerDisconected(){
        BitcoinEventListeners bitcoinEventListeners = new BitcoinEventListeners();
        bitcoinEventListeners.setLogManager(logManager);


        bitcoinEventListeners.onPeerDisconnected(peer,2);
    }
}
