package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args){
        /*
        * java.util.Scanner
        * 콘솔 화면에 값을 입력 받아 기능을 제공한다.
        *
        * 1-1 Scanner는 객체를 만들어서 사용한다.
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력해주세요 : ");

        String name = sc.nextLine();

        System.out.println("안녕하세요 " +name +"님!!");

        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age +"세가  맞나요?");


        Long lnum = sc.nextLong();
        System.out.println("입력한 LONG : " + lnum);

        boolean isTrue = sc.nextBoolean();
        if(isTrue){
            System.out.println("참이다..");
        }else{
            System.out.println("거짓");
        }
        sc.nextLine();

        char charValue = sc.nextLine().charAt(1);
        System.out.println(charValue);

    }

}
