package org.example.payoneer;

import org.example.utils.Token;

public interface IPayonnerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();

}
