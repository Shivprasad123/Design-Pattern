package NullObject.Impl;

import NullObject.IVehicle;

public class VehicleNull implements IVehicle {
    @Override
    public int getSeatingCapacity() {
        //Providing default behaviour for null object
        return 0;
    }
}
