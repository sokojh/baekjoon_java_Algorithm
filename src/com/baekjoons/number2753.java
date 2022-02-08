package com.baekjoons;
import java.util.*;
public class number2753 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int A = i.nextInt();
        if(A % 4 ==0 && A % 100 != 0 || A % 400 ==0){
            System.out.println(1);
        }else{
            System.out.println(0);

        }
    }
}
