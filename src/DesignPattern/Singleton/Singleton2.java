package DesignPattern.Singleton;

public class Singleton2 {//懒汉模式，线程不安全
    private static Singleton2 instance=null;
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        if(instance==null) return new Singleton2();
        return instance;
    }
}
