package com.raksh.Adapter.Hard;

public class CryptoAdapter implements PaymentProcessor {

    private CryptoService cryptoService;
    public CryptoAdapter(CryptoService cryptoService) {
        this.cryptoService=cryptoService;
    }
    @Override
    public boolean pay(double amount) {
        return cryptoService.transferFunds(amount);
    }
}
