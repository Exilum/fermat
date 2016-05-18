package org.fermat.fermat_dap_api.layer.dap_sub_app_module.asset_issuer_identity;

import com.bitdubai.fermat_api.layer.modules.interfaces.FermatSettings;

import java.io.Serializable;

/**
 * Created by Nerio on 21/01/16.
 */
public class IssuerIdentitySettings implements FermatSettings, Serializable {

    private boolean isPresentationHelpEnabled;

    public IssuerIdentitySettings() {

    }

    public boolean isPresentationHelpEnabled() {
        return isPresentationHelpEnabled;
    }

    @Override
    public void setIsPresentationHelpEnabled(boolean isPresentationHelpEnabled) {
        this.isPresentationHelpEnabled = isPresentationHelpEnabled;
    }
}
