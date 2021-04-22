package pers.doit.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.doit.pojo.User;

@Service
public interface UserService {

    // 根据用户userId查找用户
    User getUserById(String userId);

    // 用户登录认证
    @Transactional
    User userLogin(String userId, String password);
}
