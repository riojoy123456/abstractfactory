package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AbstractChatFactoryDemo {


    public static void main(String[] args) throws IOException {
	// write your code here

        ChatProducer producer = new ChatProducer();

        List<String> features = new ArrayList<>();
        features.add("entertainment");
        features.add("fashion");
        features.add("information");

        System.out.print("mau chat authorized? (ya/tidak) > ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        try {

            if (text.equalsIgnoreCase("ya")) {

                features.add("saloon");
                features.add("news");
                features.add("weather");

                System.out.print("selamat datang di authorized chat, mau liat apa kak? ");
                String choose = reader.readLine();

                AbstractChatFactory factory = producer.getFactory(true);
                Chat chat = factory.createChat(choose);

                if (chat instanceof AuthorizedProductChat) {

                    ((AuthorizedProductChat) chat).setProducts(features);
                }
                else if (chat instanceof AuthorizedPaymentConfirmationChat) {

                    ((AuthorizedPaymentConfirmationChat) chat).setOrderNum("\npembayaran authorize kamu adalah 0001xx-authorize");
                }

                System.out.println(chat.getResponseText());
            }
            else if (text.equalsIgnoreCase("tidak")) {

                producer.getFactory(false);

                System.out.print("selamat datang, mau liat apa kak? ");
                String choose = reader.readLine();

                AbstractChatFactory factory = producer.getFactory(false);
                Chat chat = factory.createChat(choose);

                if (chat instanceof ProductChat) {

                    ((ProductChat) chat).setProducts(features);
                }
                else if (chat instanceof PaymentConfirmationChat) {

                    ((PaymentConfirmationChat) chat).setOrderNum("\npembayaran kamu adalah 0001xx");
                }

                System.out.println(chat.getResponseText());
            }
        }
        catch (Exception e) {

            System.out.println("Error " + e);
        }
    }
}
