package com.baekjoons;
import java.util.*;
public class number10952 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //그냥 true로만 해도 되는거였구나;
        while(true){
            int A = s.nextInt();
            int B = s.nextInt();
            if(A==0&&B==0){
                break;
            }
            System.out.println(A+B);
        }


    }
}
