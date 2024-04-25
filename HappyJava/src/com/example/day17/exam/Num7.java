package com.example.day17.exam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Num7 {
    public static void main(String[] args) {
        List<Temperature> temperatures = Arrays.asList(
                new Temperature("Seoul", 33),
                new Temperature("New York", 30),
                new Temperature("Seoul", 34),
                new Temperature("New York", 28)
        );

        Map<String, Integer> highestTemperatures = temperatures.stream()
                .collect(Collectors.toMap(
                        Temperature::getCity, //키 지정
                        Temperature::getMaxTemp, //값 지정
                        Integer::max // 중복된 키가 있을 때 값을 지정하는 방법
                ));
        highestTemperatures.forEach((city, maxTemp) ->
                System.out.println(city + ": " + maxTemp)
        );
//        Map<String, List<Temperature>> map = temperatures.stream().collect(Collectors.groupingBy(Temperature :: getCity));
//        int result1 = map.get("Seoul").stream().mapToInt(t -> t.getMaxTemp()).max().getAsInt();
//        int result2 = map.get("New York").stream().mapToInt(t -> t.getMaxTemp()).max().getAsInt();
//        System.out.println("seoul: " + result1);
//        System.out.println("new york: " + result2);
    }
}
class Temperature {
    private String city;
    private int maxTemp;

    public Temperature(String city, int maxTemp) {
        this.city = city;
        this.maxTemp = maxTemp;
    }

    public String getCity() {
        return city;
    }

    public int getMaxTemp() {
        return maxTemp;
    }
}