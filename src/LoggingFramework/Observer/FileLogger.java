package LoggingFramework.Observer;

public class FileLogger implements ILogObserver {
    @Override
    public void log(String message) {
        System.out.println("File: "+message);
    }
}