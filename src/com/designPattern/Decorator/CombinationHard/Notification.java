package com.raksh.Decorator.CombinationHard;

import java.util.Map;

public abstract class Notification {
    public abstract String getRecipient();
    public abstract String getSubject();
    public abstract String getBody();
    public abstract boolean isHighPriority();
    public abstract Map<String,String> getMetaData();
    static abstract class NotificationBuilder {
        public abstract NotificationBuilder recipient(String recipient);
        public abstract NotificationBuilder subject(String subject);
        public abstract NotificationBuilder body(String body);
        public abstract NotificationBuilder highPriority(boolean highPriority);
        public abstract NotificationBuilder metaData(Map<String,String> metaData);
        public abstract Notification build();
    }
}
