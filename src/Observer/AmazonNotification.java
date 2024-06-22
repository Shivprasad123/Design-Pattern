package Observer;

public class AmazonNotification {
    public Publisher publisher;

    public AmazonNotification(){
         publisher = new Publisher();
    }

    public void itemAdded(){
        publisher.notifySub();
    }

    public void subscribe(INotify notify){
        publisher.subscribe(notify);
    }

    public void unSubscribe(INotify notify){
        publisher.unSubscribe(notify);
    }
}