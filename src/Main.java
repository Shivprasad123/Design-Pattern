import Adapter.Example2.AdapterSample;
import Composite.CompositeSample;
import DesignPattens.IDesignPattern;
import Factory.FactorySample;
import LoggingFramework.LogFrameworkSample;
import NullObject.NullObjectSample;
import Proxy.ProxySample;
import Singleton.SingletonSample;
import State.StateSample;
import Strategy.StrategySample;


public class Main {
    public static void main(String arg[]) throws InterruptedException {
        IDesignPattern dp = new LogFrameworkSample();
        dp.run();
    }
}

//TODO
//Code Solid Principals
//Check strategy and factory diff and when to use wch one