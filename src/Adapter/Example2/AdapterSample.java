package Adapter.Example2;

import Adapter.Example2.Adaptee.WeightMachineForBabies;
import Adapter.Example2.Adapter.WeightMachineAdapter;
import Adapter.Example2.Adapter.WeightMachineAdapterImpl;
import DesignPattens.IDesignPattern;

public class AdapterSample implements IDesignPattern {
    @Override
    public void run() {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(
                new WeightMachineForBabies()
        );
        double weightInKg = weightMachineAdapter.getWeightInKg();
        System.out.println("Weight in KG: " + weightInKg);
    }
}
