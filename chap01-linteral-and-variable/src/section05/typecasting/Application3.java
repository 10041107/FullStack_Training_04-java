package section05.typecasting;

public class Application3 {
    public static void main(String[] args){
        /* 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 후 연산처리 된다.
        * */

        int inum = 10;
        long lnum = 10L;

        /* 자바에서는 같은 자료형 끼리만 연산이 가능하다
        * 따라서 서로 자료형이 다른 두 자료를 연산 할 때 자료형이 같아지도록 형 변환을 해주어야 한다. */
        int isum = inum + (int)lnum;
        // 1번 10 + (int) 10;
        isum = (int)(isum + lnum);
        // 10L + 10L = (int)20

        byte bnum = 1;
        short snum = 2;
        short snum2 = 3;
        short snum3 = 3;

        short result1 = (short)(bnum + snum2);
        int result2 = (int)(snum2 + bnum);
        int result3 = (int)bnum + result1;


    }
}
