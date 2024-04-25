package main.java.com.ohgiraffers.dto;

public class Application {

    public static  void main(String[] args){

        UserService userService = new UserService();

        String userId ="testId";
        String pwd = "1234";
        String name = "길동";
        userService.userMethod(name, userId,pwd);

        TestDTO test = new TestDTO(userId,pwd,name);
        userService.userDTOtest(test);
    }
}
