package com.programmers;
import java.util.*;
public class kNumber {



    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        for(int i = 0;i<commands.length;i++) {
                for (int j = 0; j < commands[i].length; j++) {
                    list.add(commands[i][j] - 1);
                }
                int[] b = Arrays.copyOfRange(array,list.get(0),list.get(1)+1);
                Arrays.sort(b);
                answer1.add(b[list.get(2)]);
                list.clear();
        }
        int[] answer = answer1.stream().mapToInt(Integer::intValue).toArray();
        System.out.println();



}
}
