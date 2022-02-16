package com.programmers;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        String [] alphabet = { "119", "119032", "34893"};
        boolean answer = true;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 1; i<alphabet.length;i++) {
            map.put(alphabet[i].substring(0, alphabet[0].length()), 0);
            System.out.println(map.entrySet());
        }
        System.out.println(map.containsKey(alphabet[0]));



            //왜 테스트케이스는 통과하는데 효율성 테스트는 통과하지 못할까 ㅠ
    }
}
