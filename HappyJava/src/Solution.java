class Solution {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if((i%3 == 0)){
                answer++;
            }else{
                int num = i;
                while(num>0){
                    if(num%10 == 3){
                        answer++;
                        break;
                    }
                    num /= 10;
                }
            }
        }
        return answer+n;
    }
    public static void main(String[] args) {
        solution(15);
    }
}

