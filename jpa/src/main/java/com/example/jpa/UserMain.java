package com.example.jpa;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Slf4j
public class UserMain {
    //    private static final Logger log = LoggerFactory.getLogger(UserMain.class);
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        //findUser() 테스트
//        log.info("===============findUser()===============");
//        User findUser = userDAO.findUser(1L);
//        log.info("Found User : {}", findUser.getName());
//
//        User findUser2 = userDAO.findUser(1L);
//
//        if (findUser == findUser2) {
//            log.info("findUser == findUser2");
//        } else
//            log.info("findUser != findUser2");



//        UserDAO userDAO = new UserDAO();
//
//        User jiniUser = new User("jungwoo", "jungwoo@naver.com");
//
//        userDAO.createUser(jiniUser);
//
//        log.info("Create user : " + jiniUser.getName());
//        log.info("User email : {}", jiniUser.getEmail());


        //update ---------------------------------------------------------------------------------!
//        User user = new User();
//        user.setId(2L);
//        user.setName("newJeans");
//        user.setEmail("new_jini@exam.com");
//
//        userDAO.updateUser(user);
        //delete ---------------------------------------------------------------------------------!
        User user = new User();
        user.setId(2L);

        userDAO.deleteUser(user);

    }
}