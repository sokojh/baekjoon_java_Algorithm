package com.baekjoons;
import java.util.*;
public class number8958 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String arr[] = new String[s.nextInt()];
        for(int i = 0; i<arr.length;i++){
            arr[i]=s.next();
        }
        s.close();
        for(int i =0; i <arr.length;i++){
            int count = 0;
            int sum =0;
            for(int j=0; j<arr[i].length();j++){
                if(arr[i].charAt(j) == 'O'){
                    count++;

                }else{
                    count=0;
                }sum +=count;
            }
            System.out.println(sum);
        }

    }
}

