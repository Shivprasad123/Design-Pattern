package LoggingFramework.Singleton;

import LoggingFramework.COR.LogManager;
import LoggingFramework.COR.LogProcessor;
import LoggingFramework.Observer.Publisher;

public class Logger {
    private static volatile Logger logger;
    private static volatile LogProcessor logProcessor;
    private static volatile Publisher publisher;

    public Logger(){
        if(logger != null){
            throw new RuntimeException("Instance already created");
        }
    }

    public static Logger getInstance(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    logger = new Logger();
                    logProcessor = LogManager.buildLogProcessor();
                    publisher = LogManager.addObserver();
                }
            }
        }
        return logger;
    }

    public void info(String message){
        logProcessor.log(1, message, publisher);
    }

    public void debug(String message){
        logProcessor.log(2, message, publisher);
    }

    public void error(String message){
        logProcessor.log(3, message, publisher);
    }

}
