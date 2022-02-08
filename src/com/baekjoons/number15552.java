package com.baekjoons;
import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class number15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; //Buffer는 처음 입력 받는 것을 String으로 받기 때문에 Token화 시켜서 int 캐스팅하기 위해 사용
        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i<=T;i++){
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");

        }

        bw.close();
    }
}
