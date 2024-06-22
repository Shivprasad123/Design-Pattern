package Singleton;

import DesignPattens.IDesignPattern;

/**
 *  Helpful for managing resources such as database connections, logging systems, or configuration settings.
 * */
public class SingletonSample implements IDesignPattern {
    @Override
    public void run() {
        Singleton.getInstance();
        Singleton.getInstance();
        Singleton.getInstance();
    }
}
