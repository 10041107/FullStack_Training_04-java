package com.ohgiraffers.section03.increment;

public class Application {
    public static void main(String[] args){
        
        // 증감연산자에 대하여 공부하자
        /*
        * ++X / X++ : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 증가시킨다. 
        * --X / X-- : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 1뺀1다1.
        * */

        int num =10;
        int num2 = 20;
        int result =1;

        result = result * ++num;
        System.out.println(result);
        System.out.println(num);

        result = 1;
        result = result * num++;
        System.out.println(result);
        System.out.println(num);

    }
}
