package State;

import State.Impl.OrderState;

public class PackageContext {
    private IPackageState packageState;

    public void setPackageState(IPackageState state) {
        this.packageState = state;
    }

    public PackageContext(){
        packageState = new OrderState();
    }

    public void preState(){
        packageState.pre(this);
    }

    public void nextState(){
        packageState.next(this);
    }

    public void printStatus(){
        packageState.printStatus();
    }
}
