package Decorator.Impl;

import Decorator.IDataSource;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator{

    public EncryptionDecorator(IDataSource wrapper) {
        super(wrapper);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        String encData = Base64.getEncoder().encodeToString(result);
        System.out.println("Encrypted Data: "+ encData);
        return encData;
    }

    private String decode(String data) {

        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        String decData = new String(result);
        System.out.println("Decrypted Data: "+ decData);

        return decData;
    }
}
