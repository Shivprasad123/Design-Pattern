package Observer.Impl;

import Observer.INotify;

public class EmailNotify implements INotify {

    private String email;

    public EmailNotify(String email){
        this.email = email;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Email Notification: "+ email);
    }
}
