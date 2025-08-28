package com.designPattern.Decorator.CombinationHard;

public class NotificationManager {
    private static NotificationManager notificationManager;

    private NotificationManager() {
    }
    public static NotificationManager getInstance(){
        if(notificationManager==null){
            synchronized (NotificationManager.class){
                if(notificationManager==null){
                    notificationManager=new NotificationManager();
                }
            }
        }
        return notificationManager;
    }

    public void dispatch(Notification notification){
        System.out.println(notification.getRecipient());
        System.out.print(notification.getMessage());
        notification.send();
    }
}
