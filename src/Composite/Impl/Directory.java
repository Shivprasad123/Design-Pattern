package Composite.Impl;

import Composite.IFileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystem {

    private List<IFileSystem> files;

    private String name;

    public Directory(String name){
        this.name = name;
        files = new ArrayList<>();
    }

    public void add(IFileSystem file){
        files.add(file);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name: "+name);
        for(IFileSystem file: files){
            file.ls();
        }
    }
}
