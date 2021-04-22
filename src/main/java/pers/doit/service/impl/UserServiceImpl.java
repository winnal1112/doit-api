package pers.doit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.doit.mapper.UserMapper;
import pers.doit.pojo.User;
import pers.doit.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(String userId) {
        return userMapper.getUserBuId(userId);
    }

    @Override
    public User userLogin(String userId, String password) {
        return userMapper.userLogin(userId, password);
    }
}
