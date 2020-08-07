package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AbstractChatFactoryDemo {


    public static void main(String[] args) throws IOException {
	// write your code here

        ChatFactory factory = new ChatFactory();

        System.out.print("say: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        Chat chat = factory.createChat(text);

        List<String> features = new ArrayList<>();
        features.add("entertainment");
        features.add("fashion");
        features.add("information");

        try {

            if (chat instanceof ProductChat) {

                ((ProductChat) chat).setProducts(features);
            }
            else if (chat instanceof PaymentConfirmationChat) {

                ((PaymentConfirmationChat) chat).setOrderNum("\nYour Payment Number is 0001");
            }

            System.out.println(chat.getResponseText());
        }
        catch (Exception e) {

            System.out.println("I don't understand " + e);
        }
    }
}
