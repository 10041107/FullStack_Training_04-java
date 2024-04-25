package main.java.com.ohgiraffers.section01.exception;

public class Application02 {

    public static void main(String[] args){
        ExceptionText et = new ExceptionText();


        try{
            et.checkEnoughMoney(100000, 100);
            et.checkEnoughMoney(5000, 10000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}
