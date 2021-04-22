package pers.doit.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.doit.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
class userServiceTest {

    @Autowired
    private UserService loginService;

    @Test
    void userLogin() {
        User user = loginService.userLogin("1", "1");
        System.out.println(user);
    }

}