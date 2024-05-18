package org.example.iocexam.service;

import org.example.iocexam.dao.UserDao;
import org.example.iocexam.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;
//// 생성자로 주입
//    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
// 설정자로 주입
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void joinUser(User user) {
        //회원가입을 위한 비지니스 코드가 작성되어야함..

        //회원가입을 위한 비지니스가 수행되면.. 해당 데이터를 저장하는 코드가 실행
        userDao.addUser(user);
    }
}
