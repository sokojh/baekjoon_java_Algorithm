package com.baekjoons;
import java.util.*;
public class number2739 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int N = i.nextInt();
        for(int j = 1;j < 10; j++){
            System.out.println(N+" * "+j+" = "+ N*j);
        }
    }
}
