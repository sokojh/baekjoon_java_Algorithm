package com.programmers;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        String [] alphabet = { "119", "119032", "34893","1"};

        boolean answer = true;
        Arrays.sort(alphabet);
        HashMap<String,String> map = new HashMap<>();
        for(String temp : alphabet ) {
           map.put(temp,temp);
        }
        for(String str : alphabet){
            for(int i = 0;i<str.length();i++){
                String temp =str.substring(0,i);
                if(map.containsKey(temp)){
                    System.out.println(!answer);
                }
                System.out.println(answer);
            }
        }

        System.out.println(map.entrySet());




            //왜 테스트케이스는 통과하는데 효율성 테스트는 통과하지 못할까 ㅠ
    }
}
