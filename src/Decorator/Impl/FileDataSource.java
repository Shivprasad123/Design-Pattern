package Decorator.Impl;

import Decorator.IDataSource;

import java.io.*;

public class FileDataSource implements IDataSource {

    String fName;

    public FileDataSource(String name){
        this.fName = name;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing Data to file");
        File file = new File(fName);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        System.out.println("Reading Data from file");
        char[] buffer = null;
        File file = new File(fName);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
