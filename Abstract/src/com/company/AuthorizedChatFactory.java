package com.company;

public class AuthorizedChatFactory implements AbstractChatFactory {
    public Chat createChat(String intent) {
        if (intent == null) {
            return null;
        }
        if (intent.equalsIgnoreCase("Halo")) {
            return new AuthorizedWelcomeChat();
        }
        if (intent.equalsIgnoreCase("Product")) {
            return new AuthorizedProductChat();
        }
        if (intent.equalsIgnoreCase("Payment")) {
            return new AuthorizedPaymentConfirmationChat();
        }
        if (intent.equalsIgnoreCase("Halo")) {
            return new WelcomeChat();
        }
        if (intent.equalsIgnoreCase("Product")) {
            return new ProductChat();
        }
        if (intent.equalsIgnoreCase("Payment")) {
            return new PaymentConfirmationChat();
        }

        return null;
    };
}
