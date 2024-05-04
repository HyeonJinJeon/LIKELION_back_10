import java.util.*;

class Solution implements Comparator<String>{
    public static void main(String args[]) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T = sc.nextInt();
//		/*
//		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
//		*/
//        String s = "";
//        ArrayList<String> list = new ArrayList<>();
//        list.add(s);
//        s.split(" ");
//        s.s
//
//        for (int test_case = 1; test_case <= T; test_case++) {
//            int n = sc.nextInt();
//            int[] price = new int[n];
//            long remain = 0;
//
//            for (int j = 0; j < n; j++) {
//                price[j] = sc.nextInt();
//            }
//            for (int i = 0; i < n; i++) {
//                int max = price[i];
//                for (int j = i; j < n; j++) {
//                    if (price[j] > max){
//                        max = price[j];
//                    }
//                }
//                remain += (max - price[i]);
//            }
//            System.out.println("#"+ test_case + " " + remain);
//        }
        solution("500220839878", "7");
    }
    public static int solution(String t, String p) {
        int answer = 0;
        int compare = 0;
        StringBuilder stringBuilder = new StringBuilder("aaaaaaaa");
        String[] str = new String[stringBuilder.length()];
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.get("a");
        System.out.println(map.get("b"));
//        Arrays.sort(str, );
        for(int i = 0; i < t.length()-p.length()+1; i++){
            compare = (Integer.parseInt(t.substring(i,i+p.length())));
            if(compare < Integer.parseInt(p)){
                answer++;
            }
        }
//        Arrays.sort(str, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//
//            }
//        });
        return answer;
    }

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}