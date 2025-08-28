package com.designPattern.Decorator.CombinationHard;

public class RetryDecorator extends NotificationDecorator{
    public RetryDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        try{
            notification.send();
        }catch(Exception e){
            System.out.println("[RETRY] Retrying send to:"+notification.getRecipient());
            notification.send();
        }
    }
}
