package com.designPattern.Builder.Hard;

public class Payment {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    private Payment(PaymentBuilder paymentBuilder){
            this.cardNumber=paymentBuilder.cardNumber;
            this.cardHolderName=paymentBuilder.cardHolderName;
            this.expiryDate= paymentBuilder.expiryDate;
            this.cvv= paymentBuilder.cvv;

    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }

    public String getCardHolderName() {
        return cardHolderName;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public String getCvv() {
        return cvv;
    }

    public static class PaymentBuilder{
        private String cardNumber;
        private String cardHolderName;
        private String expiryDate;
        private String cvv;

        public PaymentBuilder cardNumber(String cardNumber){
            if(!cardNumber.matches("\\d{4} \\d{4} \\d{4} \\d{4}")){
                throw new IllegalArgumentException("Card Number must be in format XXXX XXXX XXXX XXXX");
            }
            this.cardNumber=cardNumber;
            return this;
        }
        public PaymentBuilder cardHolderName(String cardHolderName){
            this.cardHolderName=cardHolderName;
            return this;
        }
        public PaymentBuilder expiryDate(String expiryDate){
            if(!expiryDate.matches("(0[1-9]|1[0-2])/\\d{2}")){
                throw new IllegalArgumentException("ExpiryDate must be in format MM/YY");
            }
            this.expiryDate=expiryDate;
            return this;
        }
        public PaymentBuilder cvv(String cvv){
            if(!cvv.matches("\\d{3}")){
                throw new IllegalArgumentException("CVV mut be in format XXX");
            }
            this.cvv=cvv;
            return this;
        }
        public Payment build(){
            if(cardNumber==null|| cardHolderName==null || expiryDate==null || cvv==null){
                throw new IllegalArgumentException("All fields are mandatory");
            }
            return new Payment(this);
        }

    }
}
