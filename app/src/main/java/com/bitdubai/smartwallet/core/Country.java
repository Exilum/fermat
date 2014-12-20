package com.bitdubai.smartwallet.core;

/**
 * Created by ciencias on 20.12.14.
 */
public enum Country {
    UNITED_STATES_OF_AMERICA ("US", "United States"),
    CANADA   ("CA", "Canada"),
    ARGENTINA   ("AR","Argentina");

    private final String mCode;
    private final String mDisplayName;

    Country(String Code, String DisplayName) {
        this.mCode = Code;
        this.mDisplayName = DisplayName;
    }

    public String Code()   { return mCode; }
    public String Country() { return mDisplayName; }

}