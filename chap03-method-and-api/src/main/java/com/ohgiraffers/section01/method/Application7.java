package main.java.com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args){
        /*
        * 두 수를 매개변수로 받아 더한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 함수
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 나눈 값을 반환하는 함수
        *
        * 메서드에서 반환한 값을 받아서 화면에 출력해주세요
        * */
        int first = 20;
        int second = 10;
        int result = 0;
        Application7 app7 = new Application7();

        result = app7.plusTwoNumbers(first, second);
        System.out.println("두 수를 더한 결과 : " + result);

        result = app7.minusTwoNumbers(first, second);
        System.out.println("두 수를 뺀 결과 : " + result);

        result = app7.multipleTwoNumbers(first, second);
        System.out.println("두 수를 곱한 결과 : " + result);

        result = app7.divideTwoNumbers(first, second);
        System.out.println("두 수를 나눈 결과 : " + result);
    }


    public int plusTwoNumbers(int first, int second) {

        return  (first + second);
    }

    public int minusTwoNumbers(int first, int second) {

        return first - second;
    }

    public int multipleTwoNumbers(int first, int second) {

        return first * second;
    }

    public int divideTwoNumbers(int first, int second) {

        return first / second;
    }
}
