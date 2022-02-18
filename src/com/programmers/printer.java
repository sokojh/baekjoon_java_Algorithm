package com.programmers;
import java.util.*;

public class printer {
    public static void main(String[] args) {
        int[] p = {2, 1, 3, 2};
        int location = 2;
        int[] searchLocation = new int[100];
        Queue<Integer> que = new LinkedList<Integer>();
        for(int i =0; i<p.length;i++){ // 대기열을 큐에 저장
            que.add(p[i]);
        }

        for(int i=1; i<p.length;i++){ //자기자신을 빼고 검색하면 되기 때문 1부터시작
            int search = que.poll();
            if(search < p[i] || search == p[i]){  // search 할려는 값이 다음 값보다 작거나 같으면
                que.add(search); // 큐 대기열 뒤에 저장

            }else{ //크다면 큐에 있는 값들을 다 빼서 배열에 저장.
                for(int j =0;j<que.size();j++){
                    searchLocation[i] = que.poll();

                }
            }
            System.out.println(searchLocation[location]);


        }


    }
}
