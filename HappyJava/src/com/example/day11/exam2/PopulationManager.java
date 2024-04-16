package com.example.day11.exam2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PopulationManager {
    Map<String, Integer> map = new HashMap<>();

    public void addOrUpdateCity(String city, int i) {
        map.put(city, i);
        System.out.println("추가/수정 완료");
    }

    public void removeCity(String city) {
        map.remove(city);
        System.out.println("삭제 완료");
    }

    public void displayPopulation(String city) {
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            if(key.equals(city)){
                System.out.println("도시: " + key);
                System.out.println("인구수: " + map.get(key));
                return;
            }
        }
        System.out.println("해당 도시 정보 없음");
    }

    public void displayAll() {
        System.out.println("전체 도시를 조회합니다");
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            System.out.println("도시: " + key);
            System.out.println("인구수: " + map.get(key));
        }
    }

    public static void main(String[] args) {
        PopulationManager manager = new PopulationManager();
        Scanner scanner = new Scanner(System.in);

        manager.addOrUpdateCity("서울", 10000000);
        manager.addOrUpdateCity("부산", 3500000);

        while (true) {
            System.out.println("명령을 입력하세요 (추가/수정, 삭제, 조회, 전체 조회, 종료): ");
            String command = scanner.next();
            if (command.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String city;
            switch (command) {
                case "추가/수정":
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    System.out.print("인구를 입력하세요: ");
                    int population = scanner.nextInt();
                    manager.addOrUpdateCity(city, population);
                    break;
                case "삭제":
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.removeCity(city);
                    break;
                case "조회":
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.displayPopulation(city);
                    break;
                case "전체":
                    manager.displayAll();
                    break;
                default:
                    System.out.println("알 수 없는 명령입니다.");
            }
        }
        scanner.close();
    }
}
