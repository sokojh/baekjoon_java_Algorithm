package com.baekjoons;
import java.util.*;
import java.util.stream.Stream;

public class number1110 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "";
        String str2 ="";
        int[] digits2;
        int N = s.nextInt();
        if (N < 10) {
            str = "0" + N;
        }else {
            str = N + "";
        }
        int cycle = 0;
        int[] digits;
        while (true) {
            digits = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
            int i = Integer.parseInt(String.valueOf(digits[0])) + Integer.parseInt(String.valueOf(digits[1]));
            if(i <10) {
                str = digits[1] + "" + i;

                cycle++;
            }else {
                str2 = "" + i;
                digits2 = Stream.of(str2.split("")).mapToInt(Integer::parseInt).toArray();
                str = digits[1] + ""+ digits2[1];
                cycle++;
            }
            if(Integer.parseInt(str) == N) {
                System.out.println(cycle);
                break;
            }

        }
    }
}
