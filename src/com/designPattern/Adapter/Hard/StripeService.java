package com.designPattern.Adapter.Hard;

public class StripeService implements Stripe {

    @Override
    public boolean makeCharge(double money) {
        return true;
    }
}
