package com.programmers;
import java.util.*;
class phoneNumber {
    public static class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i =0; i<phone_book.length;i++) {
                for (int j = 0; j < phone_book[i].length(); j++) {
                    map.put(phone_book[i].charAt(j),j);
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] phone_book = {"119", "97674223", "1195524421"};
        sol.solution(phone_book);
    }
}
