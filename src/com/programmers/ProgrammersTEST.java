package com.programmers;
import java.util.*;

public class ProgrammersTEST {
    public static void main(String[] args) {
        Queue<String> nameQueue = new LinkedList<>();
        Queue<String> statusQueue = new LinkedList<>();
        Stack<String> alerm = new Stack<>();
        Queue<String> bogan = new LinkedList<>();
        ArrayList<String> verCount = new ArrayList<>();
        ArrayList<String> nameCount = new ArrayList<>();
        ArrayList<String[]> temp = new ArrayList<>();
        String[] records = {"johh share","mary comment","jay share","check notification"};
        for(int i =0; i< records.length;i++) { //name과 check 분류
            temp.add(records[i].split(" "));
            nameQueue.add(temp.get(0)[0]);
            statusQueue.add(temp.get(0)[1]);
            temp.clear();
        }
        while(!nameQueue.isEmpty()){
            String name = nameQueue.poll();
            String stat = statusQueue.poll();
            if(stat.equals("share")){
                alerm.push(name+" "+"shared your post");
            }else if(stat.equals("comment")){
                alerm.push(name+" "+"commented on your post");
            }else if(stat.equals("notification")){
                bogan.add(alerm.pop());
            }

        }


        //답 보내는거
        String[] answer=new String[bogan.size()];
        for(int i =0; i<bogan.size();i++){
            answer[i] = bogan.poll();
        }

    }
}
