package jdbc;

import java.util.ArrayList;
import java.util.List;

public class DeptDAORun {
    public static void main(String[] args) {
        DeptDAO deptDAO = new DeptDAO();
        DeptDTO deptDTO = new DeptDTO();
        List<DeptDTO> list = new ArrayList<>();

//        deptDTO.setDeptno(4);
//        deptDTO.setDname("전산");
//        deptDTO.setLoc("전주");
//        boolean resultFlag = deptDAO.addDept(deptDTO);
//        if(resultFlag){
//            System.out.println("정보 추가 성공");
//        }else {
//            System.out.println("정보 추가 실패");
//        }
//        deptDAO.deleteDept(3);
        deptDTO = deptDAO.getDept(1);
        System.out.println("depeno = " + deptDTO.getDeptno() + " dname = " + deptDTO.getDname() + " loc = " + deptDTO.getLoc());

        list = deptDAO.getAllDept();
        for(DeptDTO oneThing : list){
            System.out.println(oneThing);
        }
    }
}
