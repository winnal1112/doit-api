package pers.doit.mapper;

import org.springframework.stereotype.Repository;
import pers.doit.pojo.User;

@Repository
public interface LoginMapper {
    User userLogin(String userId, String password);
}
