package Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    List<INotify> subscribers;

    public Publisher(){
        subscribers = new ArrayList<>();
    }

    public void subscribe(INotify notify){
        subscribers.add(notify);
    }

    public void unSubscribe(INotify notify){
        subscribers.remove(notify);
    }

    public void notifySub(){
        for(INotify sub: subscribers){
            sub.sendNotification();
        }
    }
}
