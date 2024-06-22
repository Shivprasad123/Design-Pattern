package Observer.Impl;

import Observer.INotify;

public class SMSNotify implements INotify {

    private String mobile;

    public SMSNotify(String mobile){
        this.mobile = mobile;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS Notification: "+ mobile);
    }
}
