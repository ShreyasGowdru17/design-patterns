package com.designPattern.Adapter.Hard;

public class AdapterDirector {

    public static boolean Direct(String serviceType,Double amount){
        if(serviceType.equalsIgnoreCase("paypal")){
            return new PayPalAdapter(new PayPalService()).pay(amount);
        } else if (serviceType.equalsIgnoreCase("crypto")) {
            return new CryptoAdapter(new CryptoService()).pay(amount);
        }
        return new StripeAdapter(new StripeService()).pay(amount);
    }
}
