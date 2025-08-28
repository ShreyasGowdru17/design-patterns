package com.designPattern.Decorator.CombinationHard;

public class LoggingDecorator extends NotificationDecorator{

    public LoggingDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("[LOG] Sending Notification to:"+notification.getRecipient());
        super.send();
    }
}
