package com.designPattern.Adapter.Hard;

public class PayPalAdapter implements PaymentProcessor {

    private PayPalService payPalService;
    public PayPalAdapter(PayPalService payPalService) {
        this.payPalService=payPalService;
    }

    @Override
    public boolean pay(double amount) {
        return payPalService.doPayment(amount);
    }
}
