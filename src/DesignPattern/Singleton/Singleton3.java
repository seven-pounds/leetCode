package DesignPattern.Singleton;

public class Singleton3 {//懒汉模式线程安全
    private static Singleton3 instance;
    private Singleton3(){

    }
    public  static synchronized Singleton3 getInstance(){
        if(instance==null) return new Singleton3();
        return instance;
    }
}
