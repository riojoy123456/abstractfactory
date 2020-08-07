package com.company;

public interface AbstractChatFactory {
    public static Chat createChat(String intent) {
        if (intent == null) {
            return null;
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
        if (intent.equalsIgnoreCase("Halo")) {
            return new AuthorizedWelcomeChat();
        }
        if (intent.equalsIgnoreCase("Product")) {
            return new AuthorizedProductChat();
        }
        if (intent.equalsIgnoreCase("Payment")) {
            return new AuthorizedPaymentConfirmationChat();
        }

        return null;
    };
}
