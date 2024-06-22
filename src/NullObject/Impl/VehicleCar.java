package NullObject.Impl;

import NullObject.IVehicle;

public class VehicleCar implements IVehicle {
    @Override
    public int getSeatingCapacity() {
        return 10;
    }
}
