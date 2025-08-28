package com.designPattern.Decorator.CombinationHard;

public class EncryptionDecorator extends NotificationDecorator{
    public EncryptionDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getMessage() {
        return "ENCRYPTED ("+notification.getMessage()+")";
    }
}
