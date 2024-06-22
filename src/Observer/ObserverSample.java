package Observer;

import DesignPattens.IDesignPattern;
import Observer.Impl.EmailNotify;
import Observer.Impl.SMSNotify;

public class ObserverSample  implements IDesignPattern {
    public void run() {
        AmazonNotification amazonNotification = new AmazonNotification();

        amazonNotification.subscribe(new SMSNotify("7204762966"));
        amazonNotification.subscribe(new SMSNotify("9104762966"));
        amazonNotification.subscribe(new EmailNotify("shivaprasad.n@zee.com"));

        amazonNotification.itemAdded();
    }
}
