package Decorator;

import Decorator.Impl.AuthoriseDecorator;
import Decorator.Impl.DataSourceDecorator;
import Decorator.Impl.EncryptionDecorator;
import Decorator.Impl.FileDataSource;
import DesignPattens.IDesignPattern;

public class DecoratorSample implements IDesignPattern {
    public void run(){
        String fileName = "out/OutputDemo.txt";
        String curUser = "Shiv";

        DataSourceDecorator dataSourceDecorator =
            new AuthoriseDecorator(
                new EncryptionDecorator(
                    new FileDataSource(fileName)
            ), curUser);

        dataSourceDecorator.writeData("Hi There");
        String data = dataSourceDecorator.readData();
        System.out.println(data);
    }
}
