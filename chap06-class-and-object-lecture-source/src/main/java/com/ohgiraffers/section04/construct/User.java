package main.java.com.ohgiraffers.section04.construct;

import javax.print.MultiDocPrintService;
import java.util.Date;

public class User {
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /*
    * 생성자의 작성 위치
    * 작성 위치는 문법상으로 클래스 내부에 작성하게되며
    * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례적이다.
    *
    * 생성자의 사용목적
    * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
    * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용된다.
    * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다.
    *     따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 있다.
    *
    * 생성자의 작성방법
    * 접근한자 클래스명(매개변수){
    *   인스턴스 생성 시점에 수행할 명령 기술(주로 필드 초기화)
    *   this.필드명 = 매개변수;
    * }
    *
    * 생성자 작성 시 주의할 점
    * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다.
    * 2. 생성자 메소드는 반환형을 작성하지 않는다.
    *
    * 생성자의 종류
    * 1. 기본생성자(매개변수 없는 생성자)
    * 2. 매개변수가 있는 생성자
    * 기본생성자는 자바 Compiler가 자동으로 추가해주는 구문이지만 명시적으로 작성할 수 있다.
    * 매개변수가 있는 생성자가 한 개라도 존재하는 경우 기본생성자를 자동으로 추가해주지 않기 때문에
    * 기본생성자가 필요한 경우에는 반드시 명시적으로 작성해주어야 한다.
    *
    *
    * */


    // 기본생성자
    public User(){

    }

    // 모든 필드를 초기화하는 생성자
    public User(String id,String pwd,String name,Date enrollDate){
        this.id= id;
        // 패스워드 규칙 1번째 대문자 10자리 이상 마지막 특수문자
        this.pwd =pwd;
        this.name =name;
        this.enrollDate = enrollDate;
    }

    // 2개의 필드를 초기화 하는 생성자
    public User(String id,String pwd){
        this.id= id;
        // 패스워드 규칙 1번째 대문자 10자리 이상 마지막 특수문자
        this.pwd =pwd;
    }

    // 1개의 필드를 초기화 하는 생성자
    public User(String id){
        this.id= id;
    }
    // 4개의 메서드가 각각 같은 이름으로 사용될 수 있도록 하는 기술을 0000이라고 합니다.. 0000은 무엇인가요?
    // 오버로딩


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {

        // 패스워드 규칙 1번째 대문자 10자리 이상 마지막 특수문자
        this.pwd = pwd;
    }



}
