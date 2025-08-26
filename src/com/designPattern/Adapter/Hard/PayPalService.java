package com.raksh.Adapter.Hard;

public class PayPalService implements PayPal {
    @Override
    public boolean doPayment(double amt) {
        return true;
    }
}
