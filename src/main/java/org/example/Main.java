package org.example;

import org.example.adapters.MercadoPagoAdapter;
import org.example.adapters.PayoneerAdapter;
import org.example.mercadoPago.MercadoPago;
import org.example.payoneer.Payoneer;
import org.example.paypal.IPaypalPayments;
import org.example.paypal.Paypal;

public class Main {
    public static void main(String[] args) {
        IPaypalPayments payments = new MercadoPagoAdapter(new MercadoPago());

        payments.paypalPayment();
        payments.paypalReceive();
    }
}