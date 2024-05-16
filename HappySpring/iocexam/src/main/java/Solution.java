import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.*;

import java.util.*;

class Solution {
    public static String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        List <Character> list = new ArrayList<>();
        for(int i = 97; i < 123; i++){
            if(!skip.contains(((char)i)+"")){
                list.add((char)i);
            }
        }
        System.out.println(list);
        for(int i = 0; i < s.length(); i++){
            int result = list.get(list.indexOf(s.charAt(i))+index)%list.size();
            answer.append((char)result);
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        solution("aukks", "wbqd", 5);
    }
}