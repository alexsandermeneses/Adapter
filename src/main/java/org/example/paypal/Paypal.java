package org.example.paypal;

import org.example.utils.Token;

public class Paypal implements IPaypalPayments{
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos com paypal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamentos via paypal");
    }
}
