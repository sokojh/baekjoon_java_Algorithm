package com.programmers;
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        return answer;
    }
}
public class function_develop {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> c = new LinkedList<>();
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int[] progresses = {93, 30, 55};
        int[] speeds = {1,30,5};
        int percent = 100;
        for(int i=0;i<progresses.length;i++){
            int a = (int) Math.ceil(((double)(percent-progresses[i])/speeds[i]));
            q.add(a);
        }
        System.out.println(q.element());

        while(!q.isEmpty()){
            if(q.isEmpty())
                break;
            if(q.poll()>q.poll()){
                count +=1;
                c.add(count);
            }else if(q.poll()<q.poll()){
                count1 += 1;
                c.add(count1);

            } count2 +=1;
            c.add(count2);

        }
        Solution sol = new Solution();
        sol.solution(progresses,speeds);
    }
}
