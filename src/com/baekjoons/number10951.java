package com.baekjoons;
import java.util.*;

public class number10951 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //s.hasNextInt는 더 받을 것이 있는지 확인
        while(s.hasNextInt()){
            int A = s.nextInt();
            int B = s.nextInt();
            System.out.println(A+B);
        }
    }
}
