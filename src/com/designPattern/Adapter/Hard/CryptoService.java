package com.designPattern.Adapter.Hard;

public class CryptoService implements Crypto {
    @Override
    public boolean transferFunds(double value) {
        return true;
    }
}
