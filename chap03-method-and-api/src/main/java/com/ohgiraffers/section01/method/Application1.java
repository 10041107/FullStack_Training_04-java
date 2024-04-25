package main.java.com.ohgiraffers.section01.method;

import java.awt.image.RasterOp;

public class Application1 {
    public static void main(String[] args) {

        /*
         *  메소드란?
         * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
         * */
        System.out.println("main()메서드 시작됨...");

        //새로운 함수를 만든다.
        Application1 app1;
        app1= new Application1();

        app1.methodA();

//        System.out.println("hashCode : " + app1.hashCode());

    }
    
    public void methodA() {
        System.out.println("methodA() 호출....");

        methodB();

        System.out.println("methodA() 종료..");
    }
    
    public void methodB(){
        System.out.println("method B  호출");
        
        methodC();
        System.out.println("method B 종료..");
    }
    
    public void methodC(){
        System.out.println("methodC 호출");
        System.out.println("methodC 종료");
    }

}

