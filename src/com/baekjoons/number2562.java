package com.baekjoons;
import java.util.*;
public class number2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<9;i++){
            list.add(s.nextInt());

        }
        int max = Collections.max(list);
        System.out.println(max);
        System.out.println(list.lastIndexOf(max)+1);
    }
}
