package com.example.day17.exam;

import com.example.day17.Member;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Num4 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "HR", 2000),
                new Employee("Charlie", "Engineering", 5000),
                new Employee("David", "Engineering", 4000)
        );
        Map<String, List<Employee>> groupDepartment =  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        double result1 = groupDepartment.get(Employee.DEPARTMENT1).stream().mapToInt(n -> n.getMoney()).average().orElse(0);
        System.out.println(result1);

        double result2 = groupDepartment.get(Employee.DEPARTMENT2).stream().mapToInt(n -> n.getMoney()).average().orElse(0);
        System.out.println(result2);

    }
}
class Employee{
    public static final String DEPARTMENT1 = "HR";
    public static final String DEPARTMENT2 = "Engineering";
    private String name;
    private String department;
    private int money;

    public Employee(String name, String department, int money) {
        this.name = name;
        this.department = department;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
