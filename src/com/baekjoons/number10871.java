package com.baekjoons;
import java.util.*;
public class number10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int X = s.nextInt();
        int index = 0;
        String[] A = new String[N];
        String[] outputA = new String[N];
        for(int i = 0;i<N;i++){
            A[i] = s.next();

            if(Integer.parseInt(A[i])<X){
                outputA[index] = A[i];
                index +=1;
            }
        }
        for(int j=0;j<index;j++){
            System.out.print(outputA[j]+" ");
        }
        s.close();

    }
}
