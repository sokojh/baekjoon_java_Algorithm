package com.baekjoons;
import java.util.*;
public class number1546 {
    public static void main(String[] args) {
        //cast를 생략해서 헤어나오질 못했다 ㅋㅋ ㅠ
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        double average = 0;

        int A = s.nextInt();

        for(int i=0;i<A;i++){
            list.add(s.nextInt());

        }
        double max = (double) Collections.max(list);

        for (int i=0;i<list.size();i++){
             average += (double)list.get(i)/max*100.0;

        }
        System.out.println(average/(double) list.size());
    }
}
