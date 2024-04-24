package org.example.mercadoPago;

import org.example.utils.Token;

public class MercadoPago implements IMercadoPago{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        this.authToken();
        System.out.println("Enviando pagamentos via MercadoPago");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via MercadoPago");
    }
}
