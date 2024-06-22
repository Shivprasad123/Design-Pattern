package Singleton;

public final class Singleton {

    private static volatile Singleton instance;

    private Singleton(){
        if(instance != null){
            throw new RuntimeException("Instance already created...");
        }
        System.out.println("Instance created.....");
    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null) {
                    instance = new Singleton();
                }else {
                    System.out.println("Using Existing instance.....");
                }
            }
        }else{
            System.out.println("Using Existing instance.....");
        }
        return instance;
    }
}
