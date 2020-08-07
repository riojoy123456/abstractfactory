package com.company;

public class ChatFactory implements AbstractChatFactory {

    public Chat createChat(String intent) {

        if (intent == null) {
            return null;
        }
        if (intent.equalsIgnoreCase("halo")) {
            return new WelcomeChat();
        }
        if (intent.equalsIgnoreCase("product")) {
            return new ProductChat();
        }
        if (intent.equalsIgnoreCase("payment")) {
            return new PaymentConfirmationChat();
        }

        return null;
    }
}
