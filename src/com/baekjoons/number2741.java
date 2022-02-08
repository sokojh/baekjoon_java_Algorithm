package com.baekjoons;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
public class number2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i =1;i<=T;i++){
            bw.write(i+"\n");
        }
        bw.close();


    }
}
