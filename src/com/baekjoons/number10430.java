package com.baekjoons;
import java.util.*;
public class number10430 {
    public static void main(String[] args) {


        Scanner h = new Scanner(System.in);
        int A = h.nextInt();
        int B = h.nextInt();
        int C = h.nextInt();
        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);


    }

}
