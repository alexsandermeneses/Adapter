package org.example.mercadoPago;

import org.example.utils.Token;

public interface IMercadoPago {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
