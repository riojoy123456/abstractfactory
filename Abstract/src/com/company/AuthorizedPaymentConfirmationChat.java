package com.company;

public class AuthorizedPaymentConfirmationChat implements Chat {

    private String orderNum;

    public void setOrderNum(String orderNum){
        this.orderNum = orderNum;
    }

    @Override
    public String getResponseText() {
        return orderNum;
    }
}
