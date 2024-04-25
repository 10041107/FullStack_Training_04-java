package main.java.com.ohgiraffers.section06.singleton;

public class LazySingleton {
    private static LazySingleton lazy;

    private LazySingleton(){
        System.out.println("lazy 생성 됨 ");
    }

    public static LazySingleton getInstance(){

        if(lazy == null){
            try {
                Thread.sleep(3000);
                System.out.println("lazy 가 null 인상태");
                lazy = new LazySingleton();
                return lazy;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("lazy가 널이 아닌 상태");
        return lazy;
    }
}
