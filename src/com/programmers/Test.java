package com.programmers;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        String [] alphabet = { "119", "114032", "34893"};
        boolean answer = true;
        boolean a = true;
        String compare = alphabet[0];

        for(int i =1;i<alphabet.length;i++){
            a = !compare.equals(alphabet[i].substring(0,compare.length()));

            if(!a){
                answer = false;
                System.out.println(answer);
                break;
            }else{
                answer=true;
                System.out.println(answer);
            }
        }




    }
}
