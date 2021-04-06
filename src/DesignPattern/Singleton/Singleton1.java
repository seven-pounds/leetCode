package DesignPattern.Singleton;

public class Singleton1 {//饿汉模式
    private static Singleton1 instance=new Singleton1();
    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        return instance;
    }
}
