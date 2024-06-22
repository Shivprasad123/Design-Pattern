package Strategy.Impl;

import Strategy.IStrategy;

public class SubIStrategy implements IStrategy {

    public SubIStrategy(){
        System.out.println("Selected Sub Strategy");
    }

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
