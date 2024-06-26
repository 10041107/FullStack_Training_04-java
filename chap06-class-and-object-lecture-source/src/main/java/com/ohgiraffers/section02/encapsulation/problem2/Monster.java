package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {

//    String kind;
    int hp;
    String name;

    public void setHp(int hp){
        if(hp > 0){
            /*
            * this는 인스턴스가 생성되었을 때 자신의 주소를 저장한느 레퍼런스 변수이다.
            * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근하기 때문에
            * 전역변수에 접근하기 위해서는 this.을 명시해야한다.
            * */
            System.out.println("양수값이 입력되어 몬스터의 체역을 입력한 값으로 변경합니다.");
            this.hp = hp; // monster2의 경우 this == 1239731077.hp =
        }else{
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 설정합니다.");
            this.hp = 0;
        }
    }


    public void setName(String name){
        this.name = name;
    }
}
