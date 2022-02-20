package com.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProgrammersTEST1 {
    public static void main(String[] args) {
        int[] arr = {1, 52, 125, 10, 25, 201, 244, 192, 128, 23, 203, 98, 154, 255};
        ArrayList<Integer> ju = new ArrayList<>();
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            a=0;
            b=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    a++;
                } else if (arr[i] >= arr[j]) {
                    b++;
                }
                ju.add(Math.abs(a-b));

            }

        }
        int answer = Collections.min(ju);

    }
}
