package Strategy;

import DesignPattens.IDesignPattern;
import Strategy.Impl.AddIStrategy;
import Strategy.Impl.MulIStrategy;

/**
 *
 * A factory pattern is a creational pattern. A strategy pattern is an operational pattern.
 * Put another way, a factory pattern is used to create objects of a specific type.
 * A strategy pattern is use to perform an operation (or set of operations) in a particular manner.
 * In the classic example, a factory might create different types of Animals: Dog, Cat, Tiger,
 * while a strategy pattern would perform particular actions,
 * for example, Move; using Run, Walk, or Lope strategies.
 *
 * In fact the two can be used together. For example, you may have a factory that creates your business objects.
 * It may use different strategies based on the persistence medium.
 * If your data is stored locally in XML it would use one strategy.
 * If the data were remote in a different database, it would use another.
 *
 * */

public class StrategySample implements IDesignPattern {

    public void run() {
        Context context;
        String action = "add";
        if(action.equals("add")){
            context = new Context(new AddIStrategy());
        }else{
            context = new Context(new MulIStrategy());
        }

        System.out.println("Output: "+context.execute(5, 3));
    }
}
