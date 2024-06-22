package Decorator.Impl;

import Decorator.IDataSource;

import java.util.Arrays;

public class AuthoriseDecorator extends DataSourceDecorator{

    String username;

    String[] readAccess = {"Shiv", "SP"};

    String[] writeAccess = {"SP"};

    public AuthoriseDecorator(IDataSource wrapper, String username) {
        super(wrapper);
        this.username = username;
    }

    @Override
    public void writeData(String data) {
        if(!Arrays.stream(writeAccess).anyMatch(username::equals)){
            System.out.println("User Not Authorised to Write");
        }else{
            System.out.println("User Authorised to Write");
            super.writeData(data);
        }
    }

    @Override
    public String readData() {
        if(!Arrays.stream(readAccess).anyMatch(username::equals)){
            System.out.println("User Not Authorised to Read");
            return "";
        }else{
            System.out.println("User Authorised to Read");
            return super.readData();
        }
    }
}
