package com.app.springsecurity.dao;

import com.app.springsecurity.model.User;

public interface UserDao {

    User findById(int id);

    User findBySSO(String sso);
}
