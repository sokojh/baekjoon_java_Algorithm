package com.baekjoons;


import java.util.*;

public class number3052 {
    public static void main(String[] args) {
        //hashset을 사용하면 됨.
        Scanner s = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i =0; i<10;i++) {
          h.add(s.nextInt()% 42);
        }
        s.close();
        System.out.println(h.size());
    }
}
