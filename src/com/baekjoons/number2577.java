package com.baekjoons;
import java.util.*;
public class number2577 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int multiply = A*B*C;
        int indexT = 0;
        String number = String.valueOf(multiply);
        String[] digits = number.split("(?<=.)");

        for (int i =0; i<10;i++){
            list.add(0);
        }
        for(int i = 0; i < digits.length;i++){
            for(int j =0; j <10;j++){
                if(Integer.parseInt(digits[i])==j){
                    indexT = list.get(j)+1;
                    list.set(j,indexT);



                }
            }
        }
        for(int i =0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
