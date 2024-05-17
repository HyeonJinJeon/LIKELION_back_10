import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.*;

import java.util.*;

import java.util.*;
class Solution {
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> result = new Stack<>();
        int answer = 0;

        for(int i = 0; i < moves.length; i++){
            int pick = moves[i]-1;
            for(int j = 0; j < board.length; j++){
                if(board[j][pick] != 0){
                    result.push(board[j][pick]);
                    break;
                }
            }
            if(result.size() >=2 && result.get(result.size()-1) == result.get(result.size()-2)){
                result.pop();
                result.pop();
                answer += 2;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] board ={{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        solution(board, moves);
    }
}