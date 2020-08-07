package com.company;

import java.util.List;

public class ProductChat implements Chat {
    private List<String> products;

    public void setProducts(List<String> products){
        this.products = products;
    }

    public String getResponseText(){
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < products.size(); i++){
            response.append("\n").append(i + 1).append(" ").append(products.get(i));
        }
        return response.toString();
    }
}
