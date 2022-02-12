package com.baekjoons;
import java.util.*;
public class number11720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String b = s.next();

        int sum = 0;
        for(int i =0; i <a;i++){
            char c = b.charAt(i);
            sum += c-'0';
        }
        System.out.println(sum);
    }
}
