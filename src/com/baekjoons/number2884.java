package com.baekjoons;
//이 문제의 중요성은 24시간 60분을 어떻게 잘 변환하냐 인것 같다.
import java.util.*;
public class number2884 {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        int H = i.nextInt();
        int M = i.nextInt();
       M = M-45;
        if(M<0){
            M = 60 + M;
            H -=1;
            if(H<0){
                H=23;
            }

        }


        System.out.printf("%d %d",H,M);
    }
}
