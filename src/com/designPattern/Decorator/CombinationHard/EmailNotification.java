package com.raksh.Decorator.CombinationHard;

import java.util.Map;

public class EmailNotification extends Notification{
    private String recipient;
    private String subject;
    private String body;
    private boolean highPriority;
    private Map<String,String> metaData;

    private EmailNotification(Builder builder){
        this.recipient=builder.recipient;
        this.subject=builder.subject;
        this.body=builder.body;
        this.highPriority=builder.highPriority;
        this.metaData=builder.metaData;
    }
    @Override
    public String getRecipient() {
        return recipient;
    }
    @Override
    public String getSubject() {
        return subject;
    }
    @Override
    public String getBody() {
        return body;
    }
    @Override
    public boolean isHighPriority() {
        return highPriority;
    }
    @Override
    public Map<String, String> getMetaData() {
        return metaData;
    }
    static class Builder extends NotificationBuilder{
        private String recipient;
        private String subject;
        private String body;
        private boolean highPriority;
        private Map<String,String> metaData;
        @Override
        public NotificationBuilder recipient(String recipient) {
            this.recipient=recipient;
            return this;
        }
        @Override
        public NotificationBuilder subject(String subject) {
            this.subject=subject;
            return this;
        }
        @Override
        public NotificationBuilder body(String body) {
            this.body=body;
            return this;
        }
        @Override
        public NotificationBuilder highPriority(boolean highPriority) {
            this.highPriority=highPriority;
            return this;
        }
        @Override
        public NotificationBuilder metaData(Map<String, String> metaData) {
            this.metaData=metaData;
            return this;
        }
        @Override
        public Notification build() {
            return new EmailNotification(this);
        }
    }
}
