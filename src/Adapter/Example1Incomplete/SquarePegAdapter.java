package Adapter.Example1Incomplete;

import Adapter.Example1Incomplete.Adaptee.RoundPeg;

public class SquarePegAdapter extends RoundPeg {

    SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        //Incomplete
        super(5);
        this.peg = peg;
    }


}
