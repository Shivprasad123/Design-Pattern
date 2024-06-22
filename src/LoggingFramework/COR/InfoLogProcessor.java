package LoggingFramework.COR;

import LoggingFramework.Observer.ILogObserver;
import LoggingFramework.Observer.Publisher;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(int level){
        this.level = level;
    }

    @Override
    public void display(String message, Publisher publisher) {
        publisher.notify(1, message);
    }
}
