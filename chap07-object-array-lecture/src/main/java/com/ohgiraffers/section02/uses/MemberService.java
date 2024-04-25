package main.java.com.ohgiraffers.section02.uses;

import java.awt.*;

public class MemberService {
    public void singUpMembers(){ // ((no==1) - 2)
        // Member[] 배열의 size를 5로 만들어줌
        Member[] members = new Member[5];
        // Member 배열에 Member 클래스를 생성하여 값을 넣어줌
        members[0] = new Member(1,"user01","pass","홍길동", 20, '남');
        members[1] = new Member(2,"user02","pass","유관순", 16, '여');
        members[2] = new Member(3,"user03","pass","이순신", 40, '남');
        members[3] = new Member(4,"user04","pass","신사임당", 36, '여');
        members[4] = new Member(5,"user05","pass","윤봉길", 22, '남');
        // ((no==1) - 3) memberRegister를 생성함
        MemberRegister memberRegister = new MemberRegister();
        //((no==1) - 4) memberRegist.regist()메서드에 Member[]을 매개변수로 전달하여 해당 메서드를 호출함
        memberRegister.regist(members);

        return;
    }

    public void showAllMembers(){
        MemberFinder finder = new MemberFinder();

        System.out.println("---- 가입된 회원 목록 ------");
        for (Member member : finder.findAllMemembers()){
            if(member != null){
                System.out.println(member.getInfo());
            }
        }
        System.out.println(" -------- 회원 조회 완료 ---------");
    }
}
