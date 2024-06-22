package Adapter.Example1Incomplete.Adaptee;

public class RoundHole {

    int redis;

    public RoundHole(int r){
        this.redis = r;
    }

    public int getRedis(){
        return this.redis;
    }

    public boolean fits(RoundPeg peg){
        return getRedis() >= peg.getRedis();
    }
}
