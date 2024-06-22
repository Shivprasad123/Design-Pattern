package State.Impl;

import State.IPackageState;
import State.PackageContext;

public class ReceivedState implements IPackageState {
    @Override
    public void next(PackageContext pkg) {
        System.out.println("No next, package already received");
    }

    @Override
    public void pre(PackageContext pkg) {
        pkg.setPackageState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package received");
    }
}
