package com.baekjoons;
import java.util.*;
public class number2588 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int A = i.nextInt();
        String B = i.next();
        System.out.println(A*(B.charAt(2)-'0')); // charAt이라는 메소드로 385를 각 숫자 3,8,5로 나눠준다.
        System.out.println(A*(B.charAt(1)-'0')); //여기서 '0'을 빼주는 이유는 문자열 '8'을 숫자로 만들어주는 Parse방법
        System.out.println(A*(B.charAt(0)-'0'));
        System.out.println(A*Integer.parseInt(B));  //문자열을 계산해줄수없으니 ParseInt 메소드로 변환

        i.close();
    }
}
