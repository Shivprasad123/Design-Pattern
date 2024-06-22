package Adapter.Example1Incomplete;

import Adapter.Example1Incomplete.Adaptee.RoundHole;
import Adapter.Example1Incomplete.Adaptee.RoundPeg;
import DesignPattens.IDesignPattern;


/**
 * Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 * */
public class AdapterSample implements IDesignPattern {
    @Override
    public void run() {
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(4);
        System.out.println("Fits: " + hole.fits(peg));


    }
}
