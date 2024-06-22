package LoggingFramework.COR;

import LoggingFramework.Observer.ILogObserver;
import LoggingFramework.Observer.Publisher;

public abstract class LogProcessor {
    int level;
    private LogProcessor nextProcessor;

    public void setNextProcessor(LogProcessor logProcessor){
        this.nextProcessor = logProcessor;
    }

    public void log(int level, String message, Publisher publisher){
        if(this.level <= level){
            display(message, publisher);
        }
        if(this.nextProcessor != null){
            this.nextProcessor.log(level, message, publisher);
        }
    }

    public abstract void display(String message, Publisher publisher);
}
