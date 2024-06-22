package Strategy.Impl;

import Strategy.IStrategy;

public class MulIStrategy implements IStrategy {

    public MulIStrategy(){
        System.out.println("Selected Mul Strategy");
    }

    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
