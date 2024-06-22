package State.Impl;

import State.IPackageState;
import State.PackageContext;

public class OrderState implements IPackageState {
    @Override
    public void next(PackageContext pkg) {
        pkg.setPackageState(new DeliveredState());
    }

    @Override
    public void pre(PackageContext pkg) {
        System.out.println("Pre is not possible, Pack is in root state");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}
