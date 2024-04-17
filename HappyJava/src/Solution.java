import java.util.*;
class Solution {
    static boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<>();

        String[] arr = s.split("");

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("{")){
                stack.push("{");
            }else {
                if(stack.isEmpty() == true){
                    answer = false;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty() == false){
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        String polynomial = "3x + 7 + x";
        int dots[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}};

        System.out.println(solution("{{}{"));
//        String pol = polynomial.replace("\\+", "");
//        System.out.println(pol);
//        String[] each = pol.split(" ");
//        System.out.println(each[0]);
//        System.out.println(each[1]);
//        System.out.println(each[2]);

    }
}


