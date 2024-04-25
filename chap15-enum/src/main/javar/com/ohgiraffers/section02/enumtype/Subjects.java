package main.javar.com.ohgiraffers.section02.enumtype;

public enum Subjects {

    JAVA(0),
    ORACLE(1),
    JDBC(2),
    HTML(3),
    CSS(4),
    JAVASCRIPT(5);

    private int value;

    Subjects(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "value=" + value +
                '}';
    }
}
