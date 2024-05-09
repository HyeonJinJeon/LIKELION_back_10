import java.util.*;
class Solution {
    public static int solution(String dartResult) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add();
        map.put("s",1);
        map.put("sd",112);
        map.put("ss",13);
        Math.minmap.values()
        for( Integer one : map.values()){

        }
        Collection<Integer> arr1 = map.values();
        System.out.println(arr1);
        int answer = 0;
        String arr[] = dartResult.split("");
        int result[] = new int[3];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("[1-9]")){
                if(arr[i+1].equals(0)){
                    arr[i+1] = "10";
                }if("[1-9]".contains(arr[i]))
                continue;
            }else if(arr[i].equals("S")){
                result[index++] += Integer.parseInt(arr[i-1]);
            }else if(arr[i].equals("D")){
                result[index++] += Math.pow(Integer.parseInt(arr[i-1]), 2);
            }else if(arr[i].equals("T")){
                result[index++] += Math.pow(Integer.parseInt(arr[i-1]), 3);
            }else if(arr[i].equals("*")){
                if(i == 2){
                    result[index-1] *= 2;
                }else{
                    result[index-2] *= 2;
                    result[index-1] *= 2;
                }
            }else if(arr[i].equals("#")){
                result[index-1] *= -1;
            }
        }
        for(int i = 0; i < result.length; i++){
            answer += result[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(	"1D2S#10"));
    }
}
