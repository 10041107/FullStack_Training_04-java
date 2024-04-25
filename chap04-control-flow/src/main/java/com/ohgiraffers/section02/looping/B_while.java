package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {
    public void testSimpleWhileStatement(){
        /*
        * [while 표현식]
        * while(조건식){
        *
        * }
        * */
//
        Scanner scanner = new Scanner(System.in);
//        String value = scanner.nextLine();
//        int i = 0;
//
//        while (i < value.length()){
//            i++;
//
//            if(i%2 == 0){
//                continue;
//            } else if (i == 11) {
//                break;
//            }
//            System.out.println(i);
//        }

        boolean isTrue = false;

        /*
        * do while[표현식]
        * do{
        *
        * }while(조건식);
        * */
        do{
            System.out.println("메뚜기 월드 게임");
            System.out.println("시작을 원하면 true, 시작을 원하지 않으면 false를 입력해주세요");
            isTrue = scanner.nextBoolean();
        }while(isTrue);


        System.out.println("메뚜기 월드 게임");
        System.out.println("시작을 원하면 true, 시작을 원하지 않으면 false를 입력해주세요");
        isTrue = scanner.nextBoolean();

        while(isTrue){
            System.out.println("종료를 원하면 false");
            isTrue = scanner.nextBoolean();
        }
    }

    public void gugudanMethod(){
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        do{
            System.out.println("구구단 프로그램 입니다.");
            System.out.println("1단 부터 입력하신 단까지의 값을 출력하겠습니다.  \n 값을 입력해주세요");

            int num = scanner.nextInt();

            for (int i = 1; i <= num; i++) {
                if(i >= 10){
                    System.out.println("10 이상의 단은 지원하지 않습니다.");
                    break;
                }

                if(i%2 == 0){
                    continue;
                }

                for (int j = 1; j <= 9; j++) {
                    System.out.println(i +" * " + j + " = " + (i*j));
                }
            }

            System.out.println("출력이 완료 되었습니다. \n 다른 단을 확인하려면 true 아니면 종료를 희망하시면 false를 입력해주세요 ");
            isTrue = scanner.nextBoolean();

        }while(isTrue);
    }
}
