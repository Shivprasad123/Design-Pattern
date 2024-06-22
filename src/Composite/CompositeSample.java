package Composite;

import Composite.Impl.Directory;
import Composite.Impl.File;
import DesignPattens.IDesignPattern;

public class CompositeSample implements IDesignPattern {
    @Override
    public void run() {
        Directory root = new Directory("Root");
        File fLevel1 = new File("level1");
        Directory dLevel1 = new Directory("Level1");

        root.add(fLevel1);
        root.add(dLevel1);

        File fLevel2 = new File("level2");
        dLevel1.add(fLevel2);

        root.ls();
    }
}
