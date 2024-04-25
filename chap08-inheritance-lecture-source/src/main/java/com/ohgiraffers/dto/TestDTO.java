package main.java.com.ohgiraffers.dto;

public class TestDTO {

    private String userId;
    private String pwd;
    private String userName;

    public TestDTO(String userId, String pwd, String userName) {
        this.userId = userId;
        this.pwd = pwd;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "userId='" + userId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
