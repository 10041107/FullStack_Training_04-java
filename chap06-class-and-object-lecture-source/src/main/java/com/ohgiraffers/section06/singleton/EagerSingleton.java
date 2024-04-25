package main.java.com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager= new EagerSingleton();
    public EagerSingleton(){

        System.out.println("생성중~~");
        try {
            Thread.sleep(3000);
            System.out.println(" eager 실행됨");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static EagerSingleton getInstance(){

        return eager;
    }
}
