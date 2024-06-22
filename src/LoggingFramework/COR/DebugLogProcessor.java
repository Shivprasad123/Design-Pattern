package LoggingFramework.COR;

import LoggingFramework.Observer.ILogObserver;
import LoggingFramework.Observer.Publisher;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(int level){
        this.level = level;
    }

    @Override
    public void display(String message, Publisher publisher) {
        publisher.notify(2, message);
    }
}
