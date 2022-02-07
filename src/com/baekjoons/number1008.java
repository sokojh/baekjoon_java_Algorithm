package com.baekjoons;

import java.util.Scanner;

public class number1008 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Double A = i.nextDouble();
        Double B = i.nextDouble();
        //소수점이 나와야되니 Double로 받는다.
        System.out.println(A/B);

        i.close();


    }
}
