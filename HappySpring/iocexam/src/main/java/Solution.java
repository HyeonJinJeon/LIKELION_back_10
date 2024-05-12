import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static String solution(String X, String Y) {
        StringBuilder xsb = new StringBuilder(X);
        StringBuilder ysb = new StringBuilder(Y);
        List<Character> ylist = new ArrayList<>();
        for(int i = 0; i < ysb.length(); i++){
            ylist.add(ysb.charAt(i));
        }
        String answer = "";
        for(int i = 0; i < xsb.length(); i++){
            if(ylist.contains(xsb.charAt(i))){
                answer += xsb.charAt(i)+"";
                ylist.remove(xsb.charAt(i));
            }
        }
        StringBuilder asb = new StringBuilder(answer);
        String[] arr = new String[answer.length()];
        for(int i = 0; i < asb.length(); i++){
            arr[i] = asb.charAt(i)+"";
        }
        Arrays.sort(arr);
        answer = "";
        for(int i = arr.length-1; i >= 0; i--){
            answer += arr[i];
        }
        if(answer.equals("")){
            answer = "-1";
        }else if(answer.charAt(0) == '0'){
            answer = "0";
        }
        return answer;
    }

    public static void main(String[] args) {
        solution("100", "123450");
    }
}