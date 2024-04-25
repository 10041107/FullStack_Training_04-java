package main.java.com.ohgiraffers.section06.singleton;

public class Ttest {

    public Ttest() {
        try {
            Thread.sleep(3000);
            System.out.println("생성됨");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
