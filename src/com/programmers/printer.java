package com.programmers;
import java.util.*;

public class printer {
    public static void main(String[] args) {
        int count=0;
        int search = 0;
        int[] p = {2, 1, 3, 2};
        int location = 2;
        ArrayList<Integer> searchLocation = new ArrayList<>();
        Queue<Integer> que = new LinkedList<Integer>();
        for(int i =0; i<p.length;i++){ // 대기열을 큐에 저장
            que.add(p[i]);
        }

        for(int i=1; i<p.length;i++){ //자기자신을 빼고 검색하면 되기 때문 1부터시작
            if(que.isEmpty()){break;}
            search = que.peek();
            if(search < p[i] || search == p[i]){  // search 할려는 값이 다음 값보다 작거나 같으면
                que.poll(); //첫번째 값 뽑아서
                que.add(search); // 큐 대기열 뒤에 저장
                count++;
            }else{ //크다면 큐에 있는 값들을 다 빼서 배열에 저장.
                int qsize = que.size();
                for(int j =0;j<qsize;j++){
                    int temp = que.poll();
                    searchLocation.add(temp);


                }
            }
        }
        System.out.println(searchLocation.size()-count+1);

    }
}
