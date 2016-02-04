package com.bitdubai.fermat_api.layer.all_definition.navigation_structure.enums;

import com.bitdubai.fermat_api.layer.all_definition.enums.interfaces.FermatEnum;
import com.bitdubai.fermat_api.layer.all_definition.exceptions.InvalidParameterException;

/**
 * Created by rodrigo on 2015.07.20..
 */
public enum Activities implements FermatEnum {

    CWP_SHELL_LOGIN("CSL"),
    CWP_SHOP_MANAGER_MAIN("CSMM"),
    CWP_WALLET_MANAGER_MAIN("CWMM"),
    CWP_WALLET_RUNTIME_WALLET_AGE_KIDS_ALL_BITDUBAI_VERSION_1_MAIN("CWRWAKAB1M"),

    /**
     * Reference wallet
     */
    CWP_WALLET_RUNTIME_WALLET_BASIC_WALLET_BITDUBAI_VERSION_1_MAIN("CWRWBWBV1M"),
    CWP_WALLET_RUNTIME_WALLET_BASIC_WALLET_BITDUBAI_VERSION_1_TRANSACTIONS("CWRWBWBV1T"),
    CWP_WALLET_RUNTIME_WALLET_BASIC_WALLET_BITDUBAI_VERSION_1_PAYMENT_REQUEST("CWRWBWBV1PR"),
    CWP_WALLET_RUNTIME_WALLET_BASIC_WALLET_BITDUBAI_VERSION_1_CONTACTS("CWRWBWBV1C"),
    CWP_WALLET_RUNTIME_WALLET_BASIC_WALLET_BITDUBAI_VERSION_1_SETTINGS("CWRWBWBV1S"),

    CCP_BITCOIN_WALLET_SEND_FORM_ACTIVITY("CCPBWSFA"),
    CCP_BITCOIN_WALLET_REQUEST_FORM_ACTIVITY("CCPBWRFA"),
    CCP_BITCOIN_WALLET_CONTACT_DETAIL_ACTIVITY("CCPBWCDA"),
    CCP_BITCOIN_WALLET_SETTINGS_ACTIVITY("CCPBWSA"),
    CCP_BITCOIN_WALLET_SETTINGS_ACTIVITY_NOTIFICATIONS("CCPBWSAN"),
    CCP_BITCOIN_WALLET_SETTINGS_ACTIVITY_MAIN_NETWORK("CCPBWSAMN"),
    CCP_BITCOIN_WALLET_ADD_CONNECTION_ACTIVITY("CCPBWACA"),
    CCP_BITCOIN_WALLET_NO_IDENTITY_ACTIVITY("CCPBWNIA"),

    /**
     * Intra user
     */
    CWP_INTRA_USER_ACTIVITY("CIUA"),
    CWP_INTRA_USER_CREATE_ACTIVITY("CIUCA"),
    CWP_INTRA_USER_CONNECTION_REQUEST_ACTIVITY("CIUCRA"),
    CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTIONS("CSAIUCC"),

    //Wallet store
    CWP_WALLET_STORE_MAIN_ACTIVITY("CWPWSMA"),
    CWP_WALLET_STORE_DETAIL_ACTIVITY("CWPWSDA"),
    CWP_WALLET_STORE_MORE_DETAIL_ACTIVITY("CWPWSMDA"),


    CWP_WALLET_ADULTS_ALL_MAIN("CWAAM"),
    CWP_WALLET_BASIC_ALL_MAIN("CWBAM"),
    CWP_WALLET_RUNTIME_BITCOIN_ALL_AVAILABLE_BALANCE("CWRBTCAAB"),
    CWP_WALLET_RUNTIME_BITCOIN_ALL_TRANSACTIONS("CWRBTCAT"),
    CWP_WALLET_RUNTIME_BITCOIN_ALL_CONTACTS("CWRBTCAC"),


    CWP_WALLET_RUNTIME_STORE_MAIN("CWRSM"),
    CWP_WALLET_RUNTIME_WALLET_AGE_ADULTS_ALL_BITDUBAI_VERSION_1_MAIN("CWRWAAAB1M"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_MAIN("CWRAAM"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_ACCOUNTS("CWRAAA"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_AVAILABLE_BALANCE("CWRAAAB"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_ACCOUNT_DETAIL("CWRAAAD"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_BANKS("CWRAABK"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_COUPONS("CWRAAC"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_DISCOUNTS("CWRAAD"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_VOUCHERS("CWRAAV"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_GIFT_CARDS("CWRAAGC"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_CLONES("CWRAACS"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_CHILDS("CWRAACH"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS("CWRAACT"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS_CHAT("CWRAACC"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS_SEND("CWRAACSN"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS_NEW_SEND("CWRAACNS"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS_RECEIVE("CWRAACR"),
    CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS_NEW_RECEIVE("CWRAACNR"),
    CWP_WALLET_ADULTS_ALL_SHOPS("CWRAAS"),
    CWP_WALLET_ADULTS_ALL_REFFILS("CWRAAR"),
    CWP_WALLET_ADULTS_ALL_REQUESTS_RECEIVED("CWRAARR"),
    CWP_WALLET_ADULTS_ALL_REQUESTS_RECEIVED_CHAT("CWRAARRC"),
    CWP_WALLET_ADULTS_ALL_REQUESTS_RECEIVED_HISTORY("CWRAARRH"),
    CWP_WALLET_ADULTS_ALL_REQUEST_SEND("CWRAARS"),
    CWP_WALLET_ADULTS_ALL_SEND_HISTORY("CWRAASH"),
    CWP_WALLET_ADULTS_ALL_CHAT_TRX("CWRAACTX"),
    CWP_WALLET_ADULTS_ALL_DAILY_DISCOUNT("CWRAADD"),
    CWP_WALLET_ADULTS_ALL_WEEKLY_DISCOUNT("CWRAAWD"),
    CWP_WALLET_ADULTS_ALL_MONTHLY_DISCOUNT("CWRAAMD"),
    CWP_SUB_APP_ALL_DEVELOPER("CSAAD"),
    CWP_WALLET_DEVELOPER_TOOL_DATABASE("CWDTD"),
    CWP_WALLET_DEVELOPER_TOOL_DATABASE_TABLE_LIST("CWDTDTL"),
    CWP_WALLET_DEVELOPER_TOOL_DATABASE_TABLE_RECORD_LIST("CWDTDTR"),
    CWP_WALLET_FACTORY_MAIN("CWFM"),
    CWP_WALLET_FACTORY_EDIT_WALLET("CWFEW"),
    CWP_WALLET_PUBLISHER_MAIN("CWPM"),

    // DAP
    DAP_SUB_APP_ASSET_FACTORY_MAIN("DSAAFM"),
    DAP_ASSET_EDITOR_ACTIVITY("DAEA"),
    DAP_SUB_APP_ASSET_FACTORY_SETTINGS("DSAAFS"),
    DAP_SUB_APP_ASSET_FACTORY_SETTINGS_NETWORK_MAIN("DSAAFSNM"),
    DAP_SUB_APP_ASSET_FACTORY_SETTINGS_NOTIFICATIONS("DSAAFN"),

    DAP_ASSET_ISSUER_WALLET_ASSET_DETAIL("DAIWAD"),
    DAP_WALLET_ASSET_ISSUER_MAIN_ACTIVITY("DWAIMA"),
    DAP_WALLET_ASSET_ISSUER_MAIN_SETTINGS_ACTIVITY("DWAIMSA"),
    DAP_WALLET_ASSET_ISSUER_SETTINGS_MAIN_NETWORK_ACTIVITY("DWAISMNA"),
    DAP_WALLET_ASSET_ISSUER_SETTINGS_NOTIFICATIONS_ACTIVITY("DWAISNA"),
//    DAP_WALLET_ASSET_ISSUER_HISTORY_ACTIVITY("DWAIHA"),
//    DAP_WALLET_ASSET_ISSUER_STADISTICS_ACTIVITY("DWAISA"),
    DAP_WALLET_ASSET_ISSUER_USER_DELIVERY_LIST("DWAIUDL"),
    DAP_WALLET_ASSET_ISSUER_ASSET_DELIVERY("DWAIADL"),
    DAP_WALLET_ASSET_ISSUER_ASSET_DELIVERY_SELECT_USERS_GROUPS("DWAIADSUG"),
    DAP_WALLET_ASSET_ISSUER_USER_APPROPIATE_LIST("DWAIUAL"),
    DAP_WALLET_ASSET_ISSUER_USER_REDEEMED_LIST("DWAIURL"),

    DAP_WALLET_ASSET_USER_MAIN_ACTIVITY("DWUIMA"),
    DAP_WALLET_ASSET_USER_HISTORY_ACTIVITY("DWAUHA"),
    DAP_WALLET_ASSET_USER_ASSET_DETAIL("DWAUAD"),
    DAP_WALLET_ASSET_USER_ASSET_REDEEM("DWAUAR"),
    DAP_WALLET_ASSET_USER_ASSET_REDEEM_SELECT_REDEEMPOINTS("DWAUARSRP"),
    DAP_WALLET_ASSET_USER_SETTINGS_ACTIVITY("DWAUSA"),
    DAP_WALLET_ASSET_USER_SETTINGS_MAIN_NETWORK("DWAUSMN"),
    DAP_WALLET_ASSET_USER_SETTINGS_NOTIFICATIONS("DWAUSN"),

    DAP_WALLET_REDEEM_POINT_MAIN_ACTIVITY("DWRPMA"),
    DAP_WALLET_REDEEM_POINT_HISTORY_ACTIVITY("DWRPHA"),
    DAP_WALLET_REDEEM_POINT_STADISTICS_ACTIVITY("DWRPSA"),
    DAP_WALLET_REDEEM_POINT_DETAILS_ACTIVITY("DWRPD"),
    DAP_WALLET_REDEEM_POINT_SETTINGS_MAIN_NETWORK("DWRPSMN"),
    DAP_WALLET_REDEEM_POINT_ASSET_SETTINGS_ACTIVITY("DWRPASA"),
    DAP_WALLET_REDEEM_POINT_ASSET_SETTINGS_NOTIFICATIONS("DWRPASN"),

    //Desktop
    CCP_DESKTOP("CCPD"),
    DAP_DESKTOP("DAPD"),
    CBP_DESKTOP("CBPD"),
    DAP_MAIN("DAPM"),

    DAP_ASSET_USER_COMMUNITY_ACTIVITY_MAIN("DAPAUCAM"),
    DAP_ASSET_USER_COMMUNITY_ACTIVITY_ADMINISTRATIVE_GROUP_MAIN("DAPAUCAAGM"),
    DAP_ASSET_USER_COMMUNITY_ACTIVITY_ADMINISTRATIVE_GROUP_USERS_FRAGMENT("DAUCAAGUF"),
    DAP_ASSET_USER_COMMUNITY_ACTIVITY_ADMINISTRATIVE_USERS("DAUCAAU"),

    DAP_ASSET_ISSUER_COMMUNITY_ACTIVITY_MAIN("DAPAICAM"),
    DAP_ASSET_REDEEM_POINT_COMMUNITY_ACTIVITY_MAIN("DAPARPCAM"),

    // Crypto Broker Wallet
    CBP_CRYPTO_BROKER_WALLET_HOME("CBPCBWH"),
    CBP_CRYPTO_BROKER_WALLET_CONTRACTS_HISTORY("CBPCBCH"),
    CBP_CRYPTO_BROKER_WALLET_EARNINGS("CBPCBWE"),
    CBP_CRYPTO_BROKER_WALLET_SETTINGS("CBPCBWS"),
    CBP_CRYPTO_BROKER_WALLET_OPEN_NEGOTIATION_DETAILS("CBPCBWOND"),
    CBP_CRYPTO_BROKER_WALLET_CLOSE_NEGOTIATION_DETAILS_OPEN_CONTRACT("CBPCBWCNDOC"),
    CBP_CRYPTO_BROKER_WALLET_CLOSE_NEGOTIATION_DETAILS_CLOSE_CONTRACT("CBPCBWCNDCC"),
    CBP_CRYPTO_BROKER_WALLET_OPEN_CONTRACT_DETAILS("CBPCBWOCD"),
    CBP_CRYPTO_BROKER_WALLET_CLOSE_CONTRACT_DETAILS("CBPCBWCCD"),
    CBP_CRYPTO_BROKER_WALLET_SET_IDENTITY("CBPCBWSI"),
    CBP_CRYPTO_BROKER_WALLET_SET_MERCHANDISES("CBPCBWSM"),
    CBP_CRYPTO_BROKER_WALLET_SET_EARNINGS("CBPCBWSE"),
    CBP_CRYPTO_BROKER_WALLET_SET_PROVIDERS("CBPCBWSP"),
    CBP_CRYPTO_BROKER_WALLET_SET_LOCATIONS("CBPCBWSL"),
    CBP_CRYPTO_BROKER_WALLET_SET_BANK_ACCOUNT("CBPCBWSBA"),
    CBP_CRYPTO_BROKER_WALLET_CREATE_NEW_LOCATION_IN_WIZARD("CBPCBWCNLIW"),
    CBP_CRYPTO_BROKER_WALLET_SETTINGS_MY_LOCATIONS("CBPCBWSML"),
    CBP_CRYPTO_BROKER_WALLET_CREATE_NEW_LOCATION_IN_SETTINGS("CBPCBWCNLIS"),
    CBP_CRYPTO_BROKER_WALLET_SETTINGS_BANK_ACCOUNT("CBPCBWSSBA"),
    CBP_CRYPTO_BROKER_WALLET_SETTINGS_STOCK_MERCHANDISES("CBPCBWSSM"),
    CBP_CRYPTO_BROKER_WALLET_OTHER_SETTINGS("CBPCBWOS"),

    // Crypto Customer Wallet
    CBP_CRYPTO_CUSTOMER_WALLET_HOME("CBPCCWH"),
    CBP_CRYPTO_CUSTOMER_WALLET_CONTRACTS_HISTORY("CBPCCWCH"),
    CBP_CRYPTO_CUSTOMER_WALLET_BROKER_LIST("CBPCCWBL"),
    CBP_CRYPTO_CUSTOMER_WALLET_SETTINGS("CBPCCWS"),
    CBP_CRYPTO_CUSTOMER_WALLET_START_NEGOTIATION("CBPCCWSN"),
    CBP_CRYPTO_CUSTOMER_WALLET_OPEN_NEGOTIATION_DETAILS("CBPCCWOND"),
    CBP_CRYPTO_CUSTOMER_WALLET_OPEN_NEGOTIATION_ADD_NOTE("CBPCCWONAN"),
    CBP_CRYPTO_CUSTOMER_WALLET_CLOSE_NEGOTIATION_DETAILS_OPEN_CONTRACT("CBPCCWCNDOC"),
    CBP_CRYPTO_CUSTOMER_WALLET_CLOSE_NEGOTIATION_DETAILS_CLOSE_CONTRACT("CBPCCWCNDCC"),
    CBP_CRYPTO_CUSTOMER_WALLET_OPEN_CONTRACT_DETAILS("CBPCCWOCD"),
    CBP_CRYPTO_CUSTOMER_WALLET_CLOSE_CONTRACT_DETAILS("CBPCCWCCD"),
    CBP_CRYPTO_CUSTOMER_WALLET_SET_IDENTITY("CBPCCWSI"),
    CBP_CRYPTO_CUSTOMER_WALLET_SET_BITCOIN_WALLET_AND_PROVIDERS("CBPCCWSBWP"),
    CBP_CRYPTO_CUSTOMER_WALLET_SET_LOCATIONS("CBPCCWSL"),
    CBP_CRYPTO_CUSTOMER_WALLET_SET_BANK_ACCOUNT("CBPCCWSBA"),
    CBP_CRYPTO_CUSTOMER_WALLET_CREATE_NEW_LOCATION_IN_WIZARD("CBPCCWCNLW"),
    CBP_CRYPTO_CUSTOMER_WALLET_CREATE_NEW_BANK_ACCOUNT_IN_WIZARD("CBPCCWCNBAW"),
    CBP_CRYPTO_CUSTOMER_WALLET_SETTINGS_MY_LOCATIONS("CBPCCWSML"),
    CBP_CRYPTO_CUSTOMER_WALLET_CREATE_NEW_LOCATION_IN_SETTINGS("CBPCCWCNLIS"),
    CBP_CRYPTO_CUSTOMER_WALLET_CONTRACT_DETAILS("CBPCCWCD"),


    // Bank Money Wallet
    BNK_BANK_MONEY_WALLET_HOME("BNKBMWH"),
    BNK_BANK_MONEY_WALLET_SETUP("BNKBMWS"),
    BNK_BANK_MONEY_WALLET_ACCOUNT_DETAILS("BNKBMWAD"),
    BNK_BANK_MONEY_WALLET_ADD_ACCOUNT("BNKBMWAA"),
    BNK_BANK_MONEY_WALLET_UPDATE_RECORD("BNKBMWU"),

    // Cash Money Wallet
    CSH_CASH_MONEY_WALLET_HOME("CSHCMWH"),
    CSH_CASH_MONEY_WALLET_TRANSACTION_DETAIL("CSHCMWTD"),
    CSH_CASH_MONEY_WALLET_SETUP("CSHCMWS"),

    // Crypto Broker Identity
    CBP_SUB_APP_CRYPTO_BROKER_IDENTITY("CBPSACBI"),
    CBP_SUB_APP_CRYPTO_BROKER_IDENTITY_CREATE_IDENTITY("CBPSACBICI"),
    CBP_SUB_APP_CRYPTO_BROKER_IDENTITY_EDIT_IDENTITY("CBPSACBIEI"),

    // Crypto Customer Identity
    CBP_SUB_APP_CRYPTO_CUSTOMER_IDENTITY("CBPSACCI"),
    CBP_SUB_APP_CRYPTO_CUSTOMER_IDENTITY_CREATE_IDENTITY("CBPSACCICI"),
    CBP_SUB_APP_CRYPTO_CUSTOMER_IDENTITY_EDIT_IDENTITY("CBPSACCIEI"),

    // Crypto Broker Community
    CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTIONS("CBPSACBCCF"),
    CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTION_DETAIL("CBPSACBCCDF"),
    CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTION_NOTIFICATIONS("CBPSACBCCNF"),
    CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTION_OTHER_PROFILE("CBPSACBCCOPF"),
    CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTION_WORLD("CBPSACBCCWF"),
    CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTION_FRIEND_LIST("CBPSACBCCFLF"),

    // Crypto Customer Community
    CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTIONS("CBPSACCCCF"),
    CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTION_DETAIL("CBPSACCCCDF"),
    CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTION_NOTIFICATIONS("CBPSACCCCNF"),
    CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTION_OTHER_PROFILE("CBPSACCCCOPF"),
    CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTION_WORLD("CBPSACCCCWF"),
    CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTION_FRIEND_LIST("CBPSACCCCFLF"),

    // CCP Comunity
    CCP_SUB_APP_INTRA_USER_COMMUNITY_REQUEST("CCPSAIUCR"),
    CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTION_DETAIL("CCPSAIUCCD"),
    CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTION_NOTIFICATIONS("CCPSAIUCCN"),
    CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTION_OTHER_PROFILE("CCPSAIUCCOP"),
    CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTION_WORLD("CCPSAIUCCW"),
    CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTION_FRIEND_LIST("CCPSAIUCCFL"),
    CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTION_SETTINGS("CCPSAIUCCS"),

    // CCP Identity
    CCP_SUB_APP_INTRA_USER_IDENTITY("CCPSAISI"),
    CCP_SUB_APP_INTRA_IDENTITY_CREATE_IDENTITY("CCPSAIICI"),
    // DAP ISSUER IDENTITY
    DAP_SUB_APP_ASSET_ISSUER_IDENTITY("DAPSAAII"),
    DAP_SUB_APP_ASSET_ISSUER_IDENTITY_CREATE_IDENTITY("DAPSAAIICI"),
    // DAP USER IDENTITY
    DAP_SUB_APP_ASSET_USER_IDENTITY("DAPSAAUI"),
    DAP_SUB_APP_ASSET_USER_IDENTITY_CREATE_IDENTITY("DAPSAAUICI"),
    // DAP REDEEM POINT IDENTITY
    DAP_SUB_APP_REDEEM_POINT_IDENTITY("DAPSARPI"),
    DAP_SUB_APP_REDEEM_POINT_IDENTITY_CREATE_IDENTITY("DAPSARPICI"),
    // end of dap identities
    DEVELOP_MODE("develop_mode"),

    //CONNECTIONS ACTIVITY
    BITCOIN_WALLET_CALL_INTRA_USER_COMMUNITY("BWCIUC"),

    /**
     * Chat
     */
    CHT_CHAT_OPEN_CHATLIST("CHTOCHL"),
    CHT_CHAT_OPEN_CONTACTLIST("CHTOCONTL"),
    CHT_CHAT_OPEN_MESSAGE_LIST("CHTOML"),
    CHT_CHAT_OPEN_CONTACT_DETAIL("CHTOCOD"),
    CHT_CHAT_EDIT_CONTACT("CHTEDCO"),
    CHT_CHAT_OPEN_CONNECTIONLIST("CHTOCONNLT"),


    WPD_DESKTOP("WPD"),;

    private String code;

    Activities(String code) {
        this.code = code;
    }

    public static Activities getValueFromString(String code) throws InvalidParameterException {
        //for (Activities activities : Activities.values()) {
        //    if (activities.key.equals(name)) {
        //        return activities;
        //    }
        //}
        switch (code) {
            case "DAPSARPI":
                return Activities.DAP_SUB_APP_REDEEM_POINT_IDENTITY;
            case "DAPSARPICI":
                return Activities.DAP_SUB_APP_REDEEM_POINT_IDENTITY_CREATE_IDENTITY;
            case "DAPSAAUI":
                return Activities.DAP_SUB_APP_ASSET_USER_IDENTITY;
            case "DAPSAAUICI":
                return Activities.DAP_SUB_APP_ASSET_USER_IDENTITY_CREATE_IDENTITY;
            case "DAPSAAII":
                return Activities.DAP_SUB_APP_ASSET_ISSUER_IDENTITY;
            case "DAPSAAIICI":
                return Activities.DAP_SUB_APP_ASSET_ISSUER_IDENTITY_CREATE_IDENTITY;
            case "CSL":
                return Activities.CWP_SHELL_LOGIN;
            case "CSMM":
                return Activities.CWP_SHOP_MANAGER_MAIN;
            case "CWMM":
                return Activities.CWP_WALLET_MANAGER_MAIN;
            case "CWRWAKAB1M":
                return Activities.CWP_WALLET_RUNTIME_WALLET_AGE_KIDS_ALL_BITDUBAI_VERSION_1_MAIN;
            case "CWRWBWBV1T":
                return Activities.CWP_WALLET_RUNTIME_WALLET_BASIC_WALLET_BITDUBAI_VERSION_1_TRANSACTIONS;
            case "CWPWSMA":
                return Activities.CWP_WALLET_STORE_MAIN_ACTIVITY;
            case "CWPWSDA":
                return Activities.CWP_WALLET_STORE_DETAIL_ACTIVITY;
            case "CWPWSMDA":
                return Activities.CWP_WALLET_STORE_MORE_DETAIL_ACTIVITY;
            case "CWAAM":
                return Activities.CWP_WALLET_ADULTS_ALL_MAIN;
            case "CWBAM":
                return Activities.CWP_WALLET_BASIC_ALL_MAIN;
            case "CWRBTCAAB":
                return Activities.CWP_WALLET_RUNTIME_BITCOIN_ALL_AVAILABLE_BALANCE;
            case "CWRBTCAT":
                return Activities.CWP_WALLET_RUNTIME_BITCOIN_ALL_TRANSACTIONS;
            case "CWRBTCAC":
                return Activities.CWP_WALLET_RUNTIME_BITCOIN_ALL_CONTACTS;
            case "CWRSM":
                return Activities.CWP_WALLET_RUNTIME_STORE_MAIN;
            case "CWRWAAAB1M":
                return Activities.CWP_WALLET_RUNTIME_WALLET_AGE_ADULTS_ALL_BITDUBAI_VERSION_1_MAIN;
            case "CWRAAM":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_MAIN;
            case "CWRAAA":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_ACCOUNTS;
            case "CWRAAAB":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_AVAILABLE_BALANCE;
            case "CWRAAAD":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_ACCOUNT_DETAIL;
            case "CWRAABK":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_BANKS;
            case "CWRAAC":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_COUPONS;
            case "CWRAAD":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_DISCOUNTS;
            case "CWRAAV":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_VOUCHERS;
            case "CWRAAGC":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_GIFT_CARDS;
            case "CWRAACS":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_CLONES;
            case "CWRAACH":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_CHILDS;
            case "CWRAACT":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS;
            case "CWRAACC":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS_CHAT;
            case "CWRAACSN":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS_SEND;
            case "CWRAACNS":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS_NEW_SEND;
            case "CWRAACR":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS_RECEIVE;
            case "CWRAACNR":
                return Activities.CWP_WALLET_RUNTIME_ADULTS_ALL_CONTACTS_NEW_RECEIVE;
            case "CWRAAS":
                return Activities.CWP_WALLET_ADULTS_ALL_SHOPS;
            case "CWRAAR":
                return Activities.CWP_WALLET_ADULTS_ALL_REFFILS;
            case "CWRAARR":
                return Activities.CWP_WALLET_ADULTS_ALL_REQUESTS_RECEIVED;
            case "CWRAARRC":
                return Activities.CWP_WALLET_ADULTS_ALL_REQUESTS_RECEIVED_CHAT;
            case "CWRAARRH":
                return Activities.CWP_WALLET_ADULTS_ALL_REQUESTS_RECEIVED_HISTORY;
            case "CWRAARS":
                return Activities.CWP_WALLET_ADULTS_ALL_REQUEST_SEND;
            case "CWRAASH":
                return Activities.CWP_WALLET_ADULTS_ALL_SEND_HISTORY;
            case "CWRAACTX":
                return Activities.CWP_WALLET_ADULTS_ALL_CHAT_TRX;
            case "CWRAADD":
                return Activities.CWP_WALLET_ADULTS_ALL_DAILY_DISCOUNT;
            case "CWRAAWD":
                return Activities.CWP_WALLET_ADULTS_ALL_WEEKLY_DISCOUNT;
            case "CWRAAMD":
                return Activities.CWP_WALLET_ADULTS_ALL_MONTHLY_DISCOUNT;
            case "CSAAD":
                return Activities.CWP_SUB_APP_ALL_DEVELOPER;
            case "CWDTD":
                return Activities.CWP_WALLET_DEVELOPER_TOOL_DATABASE;
            case "CWDTDTL":
                return Activities.CWP_WALLET_DEVELOPER_TOOL_DATABASE_TABLE_LIST;
            case "CWDTDTR":
                return Activities.CWP_WALLET_DEVELOPER_TOOL_DATABASE_TABLE_RECORD_LIST;
            case "CWFM":
                return Activities.CWP_WALLET_FACTORY_MAIN;
            case "CWFEW":
                return Activities.CWP_WALLET_FACTORY_EDIT_WALLET;
            case "CWPM":
                return Activities.CWP_WALLET_PUBLISHER_MAIN;
            case "DSAAFM":
                return Activities.DAP_SUB_APP_ASSET_FACTORY_MAIN;
            case "CIUA":
                return Activities.CWP_INTRA_USER_ACTIVITY;
            case "CIUCA":
                return Activities.CWP_INTRA_USER_CREATE_ACTIVITY;
            case "CWRWBWBV1PR":
                return Activities.CWP_WALLET_RUNTIME_WALLET_BASIC_WALLET_BITDUBAI_VERSION_1_PAYMENT_REQUEST;
            case "CWRWBWBV1S":
                return Activities.CWP_WALLET_RUNTIME_WALLET_BASIC_WALLET_BITDUBAI_VERSION_1_SETTINGS;
            case "CCPD":
                return Activities.CCP_DESKTOP;
            case "DAPD":
                return Activities.DAP_DESKTOP;
            case "CBPD":
                return Activities.CBP_DESKTOP;
            case "DAEA":
                return Activities.DAP_ASSET_EDITOR_ACTIVITY;
            case "DAPM":
                return Activities.DAP_MAIN;
            case "DSAAFS":
                return DAP_SUB_APP_ASSET_FACTORY_SETTINGS;
            case "DSAAFSNM":
                return DAP_SUB_APP_ASSET_FACTORY_SETTINGS_NETWORK_MAIN;
            case "DSAAFN":
                return DAP_SUB_APP_ASSET_FACTORY_SETTINGS_NOTIFICATIONS;
            case "CWRWBWBV1C":
                return CWP_WALLET_RUNTIME_WALLET_BASIC_WALLET_BITDUBAI_VERSION_1_CONTACTS;
            case "CWRWBWBV1M":
                return CWP_WALLET_RUNTIME_WALLET_BASIC_WALLET_BITDUBAI_VERSION_1_MAIN;
            case "DAUCAM":
                return DAP_ASSET_USER_COMMUNITY_ACTIVITY_MAIN;
            case "CBPCBWH":
                return CBP_CRYPTO_BROKER_WALLET_HOME;
            case "CBPCBCH":
                return CBP_CRYPTO_BROKER_WALLET_CONTRACTS_HISTORY;
            case "CBPCBWE":
                return CBP_CRYPTO_BROKER_WALLET_EARNINGS;
            case "CBPCBWS":
                return CBP_CRYPTO_BROKER_WALLET_SETTINGS;
            case "CBPCBWOND":
                return CBP_CRYPTO_BROKER_WALLET_OPEN_NEGOTIATION_DETAILS;
            case "CBPCBWCNDOC":
                return CBP_CRYPTO_BROKER_WALLET_CLOSE_NEGOTIATION_DETAILS_OPEN_CONTRACT;
            case "CBPCBWCNDCC":
                return CBP_CRYPTO_BROKER_WALLET_CLOSE_NEGOTIATION_DETAILS_CLOSE_CONTRACT;
            case "CBPCBWOCD":
                return CBP_CRYPTO_BROKER_WALLET_OPEN_CONTRACT_DETAILS;
            case "CBPCBWCCD":
                return CBP_CRYPTO_BROKER_WALLET_CLOSE_CONTRACT_DETAILS;
            case "CBPCBWSI":
                return CBP_CRYPTO_BROKER_WALLET_SET_IDENTITY;
            case "CBPCBWSM":
                return CBP_CRYPTO_BROKER_WALLET_SET_MERCHANDISES;
            case "CBPCBWSE":
                return CBP_CRYPTO_BROKER_WALLET_SET_EARNINGS;
            case "CBPCBWSP":
                return CBP_CRYPTO_BROKER_WALLET_SET_PROVIDERS;
            case "CBPCBWSL":
                return CBP_CRYPTO_BROKER_WALLET_SET_LOCATIONS;
            case "CBPCBWSBA":
                return CBP_CRYPTO_BROKER_WALLET_SET_BANK_ACCOUNT;
            case "CBPCBWCNLIW":
                return CBP_CRYPTO_BROKER_WALLET_CREATE_NEW_LOCATION_IN_WIZARD;
            case "CBPCBWSML":
                return CBP_CRYPTO_BROKER_WALLET_SETTINGS_MY_LOCATIONS;
            case "CBPCBWCNLIS":
                return CBP_CRYPTO_BROKER_WALLET_CREATE_NEW_LOCATION_IN_SETTINGS;
            case "CBPCBWSSM":
                return CBP_CRYPTO_BROKER_WALLET_SETTINGS_STOCK_MERCHANDISES;
            case "CBPCCWH":
                return CBP_CRYPTO_CUSTOMER_WALLET_HOME;
            case "CBPCCWCH":
                return CBP_CRYPTO_CUSTOMER_WALLET_CONTRACTS_HISTORY;
            case "CBPCCWBL":
                return CBP_CRYPTO_CUSTOMER_WALLET_BROKER_LIST;
            case "CBPCCWS":
                return CBP_CRYPTO_CUSTOMER_WALLET_SETTINGS;
            case "CBPCCWSN":
                return CBP_CRYPTO_CUSTOMER_WALLET_START_NEGOTIATION;
            case "CBPCCWOND":
                return CBP_CRYPTO_CUSTOMER_WALLET_OPEN_NEGOTIATION_DETAILS;
            case "CBPCCWONAN":
                return CBP_CRYPTO_CUSTOMER_WALLET_OPEN_NEGOTIATION_ADD_NOTE;
            case "CBPCCWCNDOC":
                return CBP_CRYPTO_CUSTOMER_WALLET_CLOSE_NEGOTIATION_DETAILS_OPEN_CONTRACT;
            case "CBPCCWCNDCC":
                return CBP_CRYPTO_CUSTOMER_WALLET_CLOSE_NEGOTIATION_DETAILS_CLOSE_CONTRACT;
            case "CBPCCWOCD":
                return CBP_CRYPTO_CUSTOMER_WALLET_OPEN_CONTRACT_DETAILS;
            case "CBPCCWCCD":
                return CBP_CRYPTO_CUSTOMER_WALLET_CLOSE_CONTRACT_DETAILS;
            case "CBPCCWSI":
                return CBP_CRYPTO_CUSTOMER_WALLET_SET_IDENTITY;
            case "CBPCCWSBWP":
                return CBP_CRYPTO_CUSTOMER_WALLET_SET_BITCOIN_WALLET_AND_PROVIDERS;
            case "CBPCCWSL":
                return CBP_CRYPTO_CUSTOMER_WALLET_SET_LOCATIONS;
            case "CBPCCWSBA":
                return CBP_CRYPTO_CUSTOMER_WALLET_SET_BANK_ACCOUNT;
            case "CBPCCWCNLW":
                return CBP_CRYPTO_CUSTOMER_WALLET_CREATE_NEW_LOCATION_IN_WIZARD;
            case "CBPCCWCNBAW":
                return CBP_CRYPTO_CUSTOMER_WALLET_CREATE_NEW_BANK_ACCOUNT_IN_WIZARD;
            case "CBPCCWSML":
                return CBP_CRYPTO_CUSTOMER_WALLET_SETTINGS_MY_LOCATIONS;
            case "CBPCCWCNLIS":
                return CBP_CRYPTO_CUSTOMER_WALLET_CREATE_NEW_LOCATION_IN_SETTINGS;
            case "CBPCBWSSBA":
                return CBP_CRYPTO_BROKER_WALLET_SETTINGS_BANK_ACCOUNT;
            case "CBPCCWCD":
                return CBP_CRYPTO_CUSTOMER_WALLET_CONTRACT_DETAILS;
            case "DAPAUCAM":
                return Activities.DAP_ASSET_USER_COMMUNITY_ACTIVITY_MAIN;
            case "DAPAUCAAGM":
                return Activities.DAP_ASSET_USER_COMMUNITY_ACTIVITY_ADMINISTRATIVE_GROUP_MAIN;
            case "DAPAICAM":
                return Activities.DAP_ASSET_ISSUER_COMMUNITY_ACTIVITY_MAIN;
            case "DAPARPCAM":
                return Activities.DAP_ASSET_REDEEM_POINT_COMMUNITY_ACTIVITY_MAIN;
            case "CBPSACBI":
                return Activities.CBP_SUB_APP_CRYPTO_BROKER_IDENTITY;
            case "CBPSACBICI":
                return Activities.CBP_SUB_APP_CRYPTO_BROKER_IDENTITY_CREATE_IDENTITY;
            case "CBPSACBIEI":
                return Activities.CBP_SUB_APP_CRYPTO_BROKER_IDENTITY_EDIT_IDENTITY;
            case "CBPSACCI":
                return Activities.CBP_SUB_APP_CRYPTO_CUSTOMER_IDENTITY;
            case "CBPSACCICI":
                return CBP_SUB_APP_CRYPTO_CUSTOMER_IDENTITY_CREATE_IDENTITY;
            case "CBPSACCIEI":
                return CBP_SUB_APP_CRYPTO_CUSTOMER_IDENTITY_EDIT_IDENTITY;

            case "CBPSACBCCF":
                return CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTIONS;
            case "CBPSACBCCDF":
                return CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTION_DETAIL;
            case "CBPSACBCCNF":
                return CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTION_NOTIFICATIONS;
            case "CBPSACBCCOPF":
                return CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTION_OTHER_PROFILE;
            case "CBPSACBCCWF":
                return CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTION_WORLD;
            case "CBPSACBCCFLF":
                return CBP_SUB_APP_CRYPTO_BROKER_COMMUNITY_CONNECTION_FRIEND_LIST;

            case "CBPSACCCCF":
                return CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTIONS;
            case "CBPSACCCCDF":
                return CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTION_DETAIL;
            case "CBPSACCCCNF":
                return CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTION_NOTIFICATIONS;
            case "CBPSACCCCOPF":
                return CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTION_OTHER_PROFILE;
            case "CBPSACCCCWF":
                return CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTION_WORLD;
            case "CBPSACCCCFLF":
                return CBP_SUB_APP_CRYPTO_CUSTOMER_COMMUNITY_CONNECTION_FRIEND_LIST;

            case "CCPSAISI":
                return Activities.CCP_SUB_APP_INTRA_USER_IDENTITY;
            case "CCPSAIICI":
                return Activities.CCP_SUB_APP_INTRA_IDENTITY_CREATE_IDENTITY;
            case "CCPSAIUCR":
                return Activities.CCP_SUB_APP_INTRA_USER_COMMUNITY_REQUEST;
            case "CSAIUCC":
                return CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTIONS;
            case "develop_mode":
                return DEVELOP_MODE;
            case "WPD":
                return WPD_DESKTOP;
            case "CCPBWSFA":
                return CCP_BITCOIN_WALLET_SEND_FORM_ACTIVITY;
            case "CCPBWCDA":
                return CCP_BITCOIN_WALLET_CONTACT_DETAIL_ACTIVITY;
            case "CCPBWRFA":
                return CCP_BITCOIN_WALLET_REQUEST_FORM_ACTIVITY;
            case "CCPBWSA":
                return CCP_BITCOIN_WALLET_SETTINGS_ACTIVITY;
            case "CCPBWSAMN":
                return CCP_BITCOIN_WALLET_SETTINGS_ACTIVITY_MAIN_NETWORK;
            case "CCPBWSAN":
                return CCP_BITCOIN_WALLET_SETTINGS_ACTIVITY_NOTIFICATIONS;
            case "CCPBWACA":
                return CCP_BITCOIN_WALLET_ADD_CONNECTION_ACTIVITY;
            case "BWCIUC":
                return BITCOIN_WALLET_CALL_INTRA_USER_COMMUNITY;
            case "CCPSAIUCCD":
                return CCP_BITCOIN_WALLET_CONTACT_DETAIL_ACTIVITY;
            case "CCPBWNIA":
                return CCP_BITCOIN_WALLET_NO_IDENTITY_ACTIVITY;
            case "CCPSAIUCCFL":
                return CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTION_FRIEND_LIST;
            case "CCPSAIUCCW":
                return Activities.CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTION_WORLD;
            case "CCPSAIUCCOP":
                return CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTION_OTHER_PROFILE;
            case "CCPSAIUCCN":
                return CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTION_NOTIFICATIONS;
            case "CCPSAIUCCS":
                return CCP_SUB_APP_INTRA_USER_COMMUNITY_CONNECTION_SETTINGS;
            case "BNKBMWH":
                return BNK_BANK_MONEY_WALLET_HOME;
            case "BNKBMWS":
                return BNK_BANK_MONEY_WALLET_SETUP;
            case "CSHCMWH":
                return CSH_CASH_MONEY_WALLET_HOME;
            case "CSHCMWTD":
                return CSH_CASH_MONEY_WALLET_TRANSACTION_DETAIL;
            case "CSHCMWS":
                return CSH_CASH_MONEY_WALLET_SETUP;
            case "BNKBMWAD":
                return BNK_BANK_MONEY_WALLET_ACCOUNT_DETAILS;
            case "DWAIMA":
                return DAP_WALLET_ASSET_ISSUER_MAIN_ACTIVITY;
            case "DWAIMSA":
                return DAP_WALLET_ASSET_ISSUER_MAIN_SETTINGS_ACTIVITY;
            case "DWAISMNA":
                return DAP_WALLET_ASSET_ISSUER_SETTINGS_MAIN_NETWORK_ACTIVITY;
            case "DWAISNA":
                return DAP_WALLET_ASSET_ISSUER_SETTINGS_NOTIFICATIONS_ACTIVITY;
//            case "DWAIHA":
//                return DAP_WALLET_ASSET_ISSUER_HISTORY_ACTIVITY;
//            case "DWAISA":
//                return DAP_WALLET_ASSET_ISSUER_STADISTICS_ACTIVITY;
            case "DWUIMA":
                return DAP_WALLET_ASSET_USER_MAIN_ACTIVITY;
            case "DWAUHA":
                return DAP_WALLET_ASSET_USER_HISTORY_ACTIVITY;
            case "DWAUAD":
                return DAP_WALLET_ASSET_USER_ASSET_DETAIL;
            case "DWAUAR":
                return DAP_WALLET_ASSET_USER_ASSET_REDEEM;
            case "DWAUARSRP":
                return DAP_WALLET_ASSET_USER_ASSET_REDEEM_SELECT_REDEEMPOINTS;
            case "DWAUSA":
                return DAP_WALLET_ASSET_USER_SETTINGS_ACTIVITY;
            case  "DWAUSMN":
                return  DAP_WALLET_ASSET_USER_SETTINGS_MAIN_NETWORK;
            case "DWAUSN":
                return DAP_WALLET_ASSET_USER_SETTINGS_NOTIFICATIONS;
            case "DWRPMA":
                return DAP_WALLET_REDEEM_POINT_MAIN_ACTIVITY;
            case "DWRPHA":
                return DAP_WALLET_REDEEM_POINT_HISTORY_ACTIVITY;
            case "DWRPSA":
                return DAP_WALLET_REDEEM_POINT_STADISTICS_ACTIVITY;
            case "DAIWAD":
                return DAP_ASSET_ISSUER_WALLET_ASSET_DETAIL;
            case "DWAIUDL":
                return DAP_WALLET_ASSET_ISSUER_USER_DELIVERY_LIST;
            case "DWAIADL":
                return DAP_WALLET_ASSET_ISSUER_ASSET_DELIVERY;
            case "DWAIADSUG":
                return DAP_WALLET_ASSET_ISSUER_ASSET_DELIVERY_SELECT_USERS_GROUPS;
            /* CHAT */
            case "CHTOCHL":
                return Activities.CHT_CHAT_OPEN_CHATLIST;
            case "CHTOCONTL":
                return Activities.CHT_CHAT_OPEN_CONTACTLIST;
            case "CHTOML":
                return Activities.CHT_CHAT_OPEN_MESSAGE_LIST;
            case "CHTOCOD":
                return Activities.CHT_CHAT_OPEN_CONTACT_DETAIL;
            case "CHTEDCO":
                return Activities.CHT_CHAT_EDIT_CONTACT;
            case "CHTOCONNLT":
                return Activities.CHT_CHAT_OPEN_CONNECTIONLIST;

            case "BNKBMWAA":
                return BNK_BANK_MONEY_WALLET_ADD_ACCOUNT;
            case "BNKBMWU":
                return BNK_BANK_MONEY_WALLET_UPDATE_RECORD;
            case "DWAIUAL":
                return DAP_WALLET_ASSET_ISSUER_USER_APPROPIATE_LIST;

            case "DWAIURL":
                return DAP_WALLET_ASSET_ISSUER_USER_REDEEMED_LIST;

            case "DAUCAAGUF":
                return DAP_ASSET_USER_COMMUNITY_ACTIVITY_ADMINISTRATIVE_GROUP_USERS_FRAGMENT;
            case "DAUCAAU":
                return DAP_ASSET_USER_COMMUNITY_ACTIVITY_ADMINISTRATIVE_USERS;
            case "DWRPD":
                return DAP_WALLET_REDEEM_POINT_DETAILS_ACTIVITY;
            case "DWRPSMN":
                return DAP_WALLET_REDEEM_POINT_SETTINGS_MAIN_NETWORK;
            case "DWRPASA":
                return DAP_WALLET_REDEEM_POINT_ASSET_SETTINGS_ACTIVITY;
            case"DWRPASN":
                return DAP_WALLET_REDEEM_POINT_ASSET_SETTINGS_NOTIFICATIONS;
            default:
                throw new InvalidParameterException(
                        "Code Received: " + code,
                        "This code is not valid for the Activities enum"
                );
        }

    }

    @Override
    public String getCode() {
        return this.code;
    }

    public String toString() {
        return code;
    }

}
