package Adapter.Example2.Adapter;

import Adapter.Example2.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    public WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPound();

        double weightInKg = weightInPound * 0.45;

        return weightInKg;
    }
}
