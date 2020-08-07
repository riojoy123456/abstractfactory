package com.company;

public class ChatProducer {

    public AbstractChatFactory getFactory(boolean isAuthorized) {

        if (isAuthorized) {

            return new AuthorizedChatFactory();
        }
        else {

            return new ChatFactory();
        }
    }
}
