package com.raksh.Adapter.Hard;

public class StripeAdapter implements PaymentProcessor {
    private StripeService stripeService;
    public StripeAdapter(StripeService stripeService) {
        this.stripeService=stripeService;
    }
    @Override
    public boolean pay(double amount) {
        return stripeService.makeCharge(amount);
    }
}
