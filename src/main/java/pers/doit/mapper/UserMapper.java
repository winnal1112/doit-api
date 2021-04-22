package pers.doit.mapper;

import org.springframework.stereotype.Repository;
import pers.doit.pojo.User;

@Repository
public interface UserMapper {

    User getUserBuId(String userId);

    User userLogin(String userId, String password);
}
