package Factory.Impl;

import Factory.INotification;

public class PushNotification implements INotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}
