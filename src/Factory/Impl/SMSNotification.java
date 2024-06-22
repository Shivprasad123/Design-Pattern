package Factory.Impl;

import Factory.INotification;

public class SMSNotification implements INotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}
