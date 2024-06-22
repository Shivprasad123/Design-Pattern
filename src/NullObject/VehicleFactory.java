package NullObject;

import NullObject.Impl.VehicleCar;
import NullObject.Impl.VehicleNull;

public class VehicleFactory {
    public static IVehicle createVehicle(String vehicle){
        switch (vehicle){
            case "Car":
                return new VehicleCar();
            default:
                return new VehicleNull();
        }
    }
}
