package com.baekjoons;

import java.util.Scanner;

public class number1008 {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();//코드 실행전에 시간 받아오기.
        Scanner i = new Scanner(System.in);
        Double A = i.nextDouble();
        Double B = i.nextDouble();
        //소수점이 나와야되니 Double로 받는다.
        System.out.println(A/B);

        i.close();
        long afterTime = System.currentTimeMillis();
        long secDiffertime = (afterTime-beforeTime);
        System.out.println("시간차이(m) :"+secDiffertime);

    }
}
