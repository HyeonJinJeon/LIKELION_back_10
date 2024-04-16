package com.example.day11.exam1;

import com.example.day08.MyException;

import java.util.HashSet;
import java.util.Set;

public class EmployeeManager {
    Set<Employee> set = new HashSet<>();

    public void addEmployee(Employee employee){
        set.add(employee);
    }

    public void findEmployee(String id){
        for(Employee employee : set){
            if (employee.getId().equals(id)) {
                System.out.println("이름: " + employee.getName() + " id: " + employee.getId() + " 부서: " + employee.getDepartment());
                return;
            }
        }
        throw new MyException("해당 정보가 없습니다.");
    }

    public void removeEmployee(Employee employee){
        if (set.contains(employee)){
            System.out.println(employee.getName()+"이 삭제되었습니다");
            set.remove(employee);
        } else {
            throw new MyException("삭제할 사원이 없습니다");
        }
    }

}
