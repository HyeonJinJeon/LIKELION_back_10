package com.example.day11.employee;


import com.example.day08.MyException;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeManager manager = new EmployeeManager();

        while(true){
            System.out.println("1. 사원 추가 | 2. 사원 찾기 | 3. 사원 삭제 | 4. 작업 종료");
            int num = sc.nextInt();

            if(num == 1){
                System.out.println("사원의 이름을 입력하세요");
                String name = sc.next();
                System.out.println("사원의 id를 입력하세요");
                String id = sc.next();
                System.out.println("사원의 부서를 입력하세요");
                String department = sc.next();

                manager.addEmployee(new Employee(name, id, department));
            } else if (num == 2) {
                System.out.println("찾을 사원의 id를 입력하세요");
                String id = sc.next();
                try{
                    manager.findEmployee(id);
                }catch (MyException e){
                    System.out.println(e.getMessage());
                }
            } else if (num == 3) {
                System.out.println("삭제할 사원의 이름을 입력하세요");
                String name = sc.next();
                System.out.println("삭제할 사원의 id를 입력하세요");
                String id = sc.next();
                System.out.println("삭제할 사원의 부서를 입력하세요");
                String department = sc.next();
                try {
                    manager.removeEmployee(new Employee(name, id, department));
                }catch (MyException e){
                    System.out.println(e.getMessage());
                }
            }else{
                break;
            }
        }
    }
}

