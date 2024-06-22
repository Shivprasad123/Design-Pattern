package Factory.Impl;

import Factory.INotification;

public class EmailNotification implements INotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}
