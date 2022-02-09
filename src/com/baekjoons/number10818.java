package com.baekjoons;
import java.util.*;
public class number10818 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = s.nextInt();

        for(int i =0; i <N;i++){
            list.add(s.nextInt());

        }
        System.out.println(Collections.min(list)+" "+Collections.max(list));



        }

    }

