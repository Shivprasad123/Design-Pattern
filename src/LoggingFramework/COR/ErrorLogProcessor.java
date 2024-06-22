package LoggingFramework.COR;

import LoggingFramework.Observer.ILogObserver;
import LoggingFramework.Observer.Publisher;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(int level){
        this.level = level;
    }

    @Override
    public void display(String message, Publisher publisher) {
        publisher.notify(3, message);
    }
}
