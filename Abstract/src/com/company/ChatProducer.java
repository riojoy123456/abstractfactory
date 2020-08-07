package com.company;

public class ChatProducer {

    public static final String PILIH_CHAT = "Memilih Chat";
    public static final String PILIH_AuthCHAT = "Memilih Authorized Chat";

    public static AbstractChatFactory getFactory(String isAuthorized) {
        if (isAuthorized.equals(PILIH_CHAT)){

            return new ChatFactory();
        }
        else if (isAuthorized.equals(PILIH_AuthCHAT)){
            return new AuthorizedChatFactory();
        }

        return null;
    }
}
