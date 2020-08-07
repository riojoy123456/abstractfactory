package com.company;

public class AuthorizedChatFactory implements AbstractChatFactory {

    public Chat createChat(String intent) {

        if (intent == null) {
            return null;
        }
        if (intent.equalsIgnoreCase("halo")) {
            return new AuthorizedWelcomeChat();
        }
        if (intent.equalsIgnoreCase("product")) {
            return new AuthorizedProductChat();
        }
        if (intent.equalsIgnoreCase("payment")) {
            return new AuthorizedPaymentConfirmationChat();
        }

        return null;
    }
}
