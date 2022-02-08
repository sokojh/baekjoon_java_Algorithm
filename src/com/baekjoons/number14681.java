package com.baekjoons;
import java.util.*;
public class number14681 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x = i.nextInt();
        int y = i.nextInt();
//        if(x>=-1000 && x<=1000 && y>=-1000 && y<=1000 && y!=0 && x!=0){
//            System.out.println("옳바른 범위값입니다.");
//        }else {
//            System.out.println("범위값을 넘어서거나 0이면 안됩니다.");
//        }
        if (x>0 && y>0){
            System.out.println(1);
        }else if(x<0 && y<0){
            System.out.println(3);
        }else if(x>0 && y<0){
            System.out.println(4);
        }else if(x<0 && y>0){
            System.out.println(2);
        }
    }
}
