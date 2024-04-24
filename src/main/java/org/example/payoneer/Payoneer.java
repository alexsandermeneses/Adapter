package org.example.payoneer;

import org.example.utils.Token;

public class Payoneer implements IPayoneerPayments {
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        this.authToken();
        System.out.println("Enviando pagamentos via Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Payoneer");
    }
}
