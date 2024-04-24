package org.example.adapters;

import org.example.mercadoPago.MercadoPago;
import org.example.paypal.IPaypalPayments;
import org.example.utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {
    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o MercadoPago utilizando os métodos padrões do Paypal");
    }
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receivePayment();
    }
}