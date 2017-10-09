package com.app.springsecurity.service;

import com.app.springsecurity.dao.UserDao;
import com.app.springsecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public User findById(int id) { return userDao.findById(id); }

    public User findBySSO(String sso) { return userDao.findBySSO(sso); }
}
