package NullObject;

import DesignPattens.IDesignPattern;

public class NullObjectSample implements IDesignPattern {
    @Override
    public void run() {
        IVehicle vehicle = VehicleFactory.createVehicle("Bike");
        printVehicle(vehicle);
    }

    public void printVehicle(IVehicle vehicle){
        System.out.println("Seating Capacity is " + vehicle.getSeatingCapacity());
    }
}
