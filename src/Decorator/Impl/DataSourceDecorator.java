package Decorator.Impl;

import Decorator.IDataSource;

public class DataSourceDecorator implements IDataSource {

    private IDataSource wrapper;

    public DataSourceDecorator(IDataSource wrapper){
        this.wrapper = wrapper;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
