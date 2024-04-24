package org.example.payoneer;

import org.example.utils.Token;

public interface IPayoneerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();

}
