package Strategy.Impl;

import Strategy.IStrategy;

public class AddIStrategy implements IStrategy {

    public AddIStrategy(){
        System.out.println("Selected Add Strategy");
    }

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
