package com.baekjoons;
import java.util.*;
public class number1330 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int A = i.nextInt();
        int B = i.nextInt();
        if(A>B){
            System.out.println('>');
        }else if(A<B) {
            System.out.println('<');

        }else if(A==B){
            System.out.println("==");
        }
    }
}
