package com.baekjoons;
import java.util.*;
public class number9498 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int testScore = i.nextInt();

        if(testScore>=90){
            System.out.println('A');
        }else if(testScore>=80){
            System.out.println('B');
        }else if(testScore>=70){
            System.out.println('C');
        }else if(testScore>=60){
            System.out.println('D');
        }else{
            System.out.println('F');
        }

    }
}
