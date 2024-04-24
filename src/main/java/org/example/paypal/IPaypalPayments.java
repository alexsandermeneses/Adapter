package org.example.paypal;

import org.example.utils.Token;

public interface IPaypalPayments {
    Token authToken();
    void paypalPayment();
    void paypalReceive();


}
