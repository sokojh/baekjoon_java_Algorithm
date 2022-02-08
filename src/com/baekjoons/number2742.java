package com.baekjoons;

import java.io.*;
import java.nio.Buffer;

public class number2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = N;i>0;i--){
            bw.write(Integer.parseInt(String.valueOf(i))+"\n");
        }
        bw.close();
    }
}
