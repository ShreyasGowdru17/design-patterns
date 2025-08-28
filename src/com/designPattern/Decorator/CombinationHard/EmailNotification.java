package com.designPattern.Decorator.CombinationHard;

import java.util.Map;

public class EmailNotification implements Notification{
    private final String recipient;
    private final String subject;
    private final String body;
    private EmailNotification(Builder builder) {
        this.recipient=builder.recipient;
        this.subject= builder.subject;
        this.body= builder.body;
    }

    @Override
    public String getMessage() {
        return subject+'-'+body;
    }
    @Override
    public String getRecipient() {
        return recipient;
    }
    @Override
    public void send() {
        System.out.println("Sending Mail to"+recipient+":"+getMessage());
    }
    public static class Builder{
        private  String recipient;
        private  String subject;
        private  String body;

        public Builder recipient(String recipient){
            this.recipient=recipient;
            return this;
        }
        public Builder subject(String subject){
            this.subject=subject;
            return this;
        }
        public Builder body(String body){
            this.body=body;
            return this;
        }
        public EmailNotification build(){
            return new EmailNotification(this);
        }
    }
}
