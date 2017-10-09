package com.app.springsecurity.service;

import com.app.springsecurity.model.User;

public interface UserService {

    User findById(int id);

    User findBySSO(String sso);
}
