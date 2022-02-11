package com.baekjoons;
import java.util.*;
public class number4344 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int C = s.nextInt();


        double re = 0;
        for (int i =0;i<C;i++){
            int N = s.nextInt();
            double count = 0;
            int sum = 0;
            int[] arr = new int[N];
            for(int j=0;j<N;j++){
                arr[j] = s.nextInt();

            }
            for(int x=0;x<arr.length;x++){
                sum +=arr[x];

            }
            re = sum/N;

            for(int y =0 ;y<arr.length;y++){
                if(arr[y]>re){
                    count++;
                }

            }

            System.out.println("count :"+count+" re :"+re);
            System.out.println((double)count/N);
            System.out.println(String.format("%.3f",(count/N)*100)+"%");
        } s.close();
    }
}
