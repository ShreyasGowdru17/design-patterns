package com.designPattern.Decorator.CombinationHard;

public abstract class NotificationDecorator implements Notification{
    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String getMessage() {
        return notification.getMessage();
    }
    @Override
    public String getRecipient() {
        return notification.getRecipient();
    }
    @Override
    public void send() {
        notification.send();
    }
}
