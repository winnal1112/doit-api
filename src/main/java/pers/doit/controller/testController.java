package pers.doit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import pers.doit.pojo.User;
import pers.doit.service.UserService;

// @CrossOrigin设置跨域访问，“*”代表所有域
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class testController {

    @Value("${abc.abc}")
    private String abc;

    @Value("${def.def}")
    private String def;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String hello(){
        return "hello doit";
    }

    @PostMapping("/user/logout")
    public String userLogout() {
        return "退出成功";
    }
}
