package Composite.Impl;

import Composite.IFileSystem;

public class File implements IFileSystem {

    private String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("FileName: "+name);
    }
}
