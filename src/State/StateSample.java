package State;

import DesignPattens.IDesignPattern;

/**
 * In state pattern, the behavior of class might change completely, based on actual state.
 * In strategy, the client has to be aware of the possible
 * strategies to use and change them explicitly.
 * */
public class StateSample implements IDesignPattern {
    @Override
    public void run() {
        PackageContext context = new PackageContext();
        context.printStatus();
        context.nextState();
        context.printStatus();
        context.nextState();
        context.printStatus();
        context.preState();
        context.printStatus();
    }
}
