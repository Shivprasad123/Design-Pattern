package LoggingFramework.Observer;

public class ConsoleLogger implements ILogObserver {
    @Override
    public void log(String message) {
        System.out.println("Console: "+message);
    }
}
