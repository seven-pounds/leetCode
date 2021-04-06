package DesignPattern.Singleton;
//强烈推荐，静态内部类，通过JVM保证线程安全
public class Singleton5 {
    private Singleton5(){ }
    private static class SingleHelper{
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    public static Singleton5 getInstance(){
        return SingleHelper.INSTANCE;
    }
}
