package LoggingFramework;

import DesignPattens.IDesignPattern;
import LoggingFramework.Singleton.Logger;

public class LogFrameworkSample implements IDesignPattern {
    @Override
    public void run() {
        Logger logger = Logger.getInstance();
        logger.error("Hi There");
    }
}
