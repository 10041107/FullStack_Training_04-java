package main.java.com.ohgiraffers.section03.copy;

public class Application02 {
    public static void main(String[] args){

        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names의 hashcode : " + names.hashCode());

        // 매개변수
        // 함수를 호출할 때 값을 전달하기 위해서 사용하는 변수이다..
        print(names);

        for (String x:names) {
            System.out.println("print 이후 x의 값 " + x);
        }
        System.out.println();


        String[] animals = getAnimals();
        System.out.println("리턴 받은 animals의 hashcode : " + animals.hashCode());

        for (String x: animals) {
            System.out.println("print 전  = " + x);
        }
        print(animals);
        for (String x : animals){
            System.out.println("print 이후 = " + x);
        }
    }

    public static void print(String[] test){

        System.out.println("args의 hashcode : " + test.hashCode());

        for (int i = 0; i < test.length; i++) {
            test[i] = test[i]+"1";
        }
        System.out.println();
    }

    public static String[] getAnimals(){
        String[] animals = {"낙타", "호랑이" , "나무늘보"};
        System.out.println("getAnimals의 hash code " + animals.hashCode());

        return animals; // 940060004
    }
}
