package Strategy;

public class Context implements IStrategy {

    IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    @Override
    public int execute(int a, int b) {
        return strategy.execute(a, b);
    }
}
