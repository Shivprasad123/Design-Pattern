package LoggingFramework.COR;

import LoggingFramework.Observer.ConsoleLogger;
import LoggingFramework.Observer.FileLogger;
import LoggingFramework.Observer.Publisher;

public class LogManager {
    public static LogProcessor buildLogProcessor(){
        LogProcessor infoLogProcessor = new InfoLogProcessor(1);
        LogProcessor debugLogProcessor = new DebugLogProcessor(2);
        LogProcessor errorLogProcessor = new ErrorLogProcessor(3);
        infoLogProcessor.setNextProcessor(debugLogProcessor);
        debugLogProcessor.setNextProcessor(errorLogProcessor);
        return infoLogProcessor;
    }

    public static Publisher addObserver(){
        Publisher publisher = new Publisher();
        publisher.subscribe(1, new ConsoleLogger());
        publisher.subscribe(1, new FileLogger());
        publisher.subscribe(2, new FileLogger());
        return publisher;
    }

}
