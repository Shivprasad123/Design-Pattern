package Factory;

import Factory.Impl.EmailNotification;
import Factory.Impl.PushNotification;
import Factory.Impl.SMSNotification;

public class NotificationFactory {
    public INotification createNotification(Channel channel){
        switch (channel){
            case EMAIL:
                return new EmailNotification();
            case PUSH:
                return new PushNotification();
            default:
                return new SMSNotification();
        }
    }
}
