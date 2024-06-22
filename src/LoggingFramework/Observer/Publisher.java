package LoggingFramework.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher {

    Map<Integer, List<ILogObserver>> publisher = new HashMap<>();

    public void subscribe(int level, ILogObserver ILogObserver){
        List<ILogObserver> ILogObservers = publisher.getOrDefault(level, new ArrayList<>());
        ILogObservers.add(ILogObserver);
        publisher.put(level, ILogObservers);
    }

    public void notify(int level, String message){
        List<ILogObserver> ILogObservers = publisher.getOrDefault(level, new ArrayList<>());
        for(ILogObserver observer: ILogObservers){
            observer.log(message);
        }
    }
}
