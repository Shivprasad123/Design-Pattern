package Factory;

import DesignPattens.IDesignPattern;

public class FactorySample implements IDesignPattern {
    @Override
    public void run() {

        //Read this https://www.baeldung.com/java-factory-pattern

        NotificationFactory factory = new NotificationFactory();
        INotification notification = factory.createNotification(Channel.EMAIL);
        notification.notifyUser();
    }
}
