import java.util.*;

public class Solutions {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Integer> map = new HashMap<>(); // 각 스테이지 및 스테이지에 머물러있는 플레이어 수
        Map<Integer, Double> map2 = new HashMap<>();// 각 스테이지 및 스테이지 별 실패율
        double[] failRate = new double[N];
        //map에 초기값 넣기
        for(int i = 0; i <= N+1; i++){
            map.put(i, 0);
        }
        for(int i = 0; i < stages.length; i++){
            if(map.get(stages[i]) == null){
                map.put(stages[i], 1);
            }else{
                int val = map.get(stages[i]) + 1;
                map.put(stages[i], val);
            }
        }
//            map.put(0,0);
//            List<Integer> mapKeySort = new ArrayList<>(map.keySet());
//            // 키 값으로 오름차순 정렬
//            Collections.sort(mapKeySort);

        for(int i = 1; i <= N; i++){
            int remainPlayer = stages.length;
            double fail = (double)map.get(i)/(remainPlayer-map.get(i-1));
            map2.put(i, fail);
            remainPlayer -= map.get(i-1);
        }
        List<Integer> keySet = new ArrayList<>(map2.keySet());

        // Value 값으로 오름차순 정렬
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int compareResult = map2.get(o2).compareTo(map2.get(o1));
                if (compareResult == 0) {
                    // 값이 같을 때는 키(첫 번째 값)에 따라 오름차순으로 정렬
                    return o1.compareTo(o2);
                }
                return compareResult; // 값이 다를 때는 기존의 내림차순 정렬 유지
            }
        });

        for (int i = 0; i < keySet.size(); i++) {
            answer[i] = keySet.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 6, 2, 4, 3, 3};
        solution(5, arr);
    }
}
