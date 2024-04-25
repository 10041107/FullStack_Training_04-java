package main.java.com.ohgiraffers.section02.uses;

public class MemberFinder {

    public Member[] findAllMemembers(){

        return MemberRepository.findAllMembers();
    }
}
