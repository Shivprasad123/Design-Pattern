package State.Impl;

import State.IPackageState;
import State.PackageContext;

public class DeliveredState implements IPackageState {
    @Override
    public void next(PackageContext pkg) {
        pkg.setPackageState(new ReceivedState());
    }

    @Override
    public void pre(PackageContext pkg) {
        pkg.setPackageState(new OrderState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}
