package pers.doit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.doit.pojo.User;
import pers.doit.pojo.loginParams;
import pers.doit.service.UserService;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    /*
     * 根据用户userId查询用户
     * @params userId
     * @return user
     * */
    @GetMapping("/user/{userId}")
    public User userLogin(@PathVariable String userId) {
        User user = userService.getUserById(userId);
        return user;
    }

    /*
     * 用户登录验证
     * @params userId password
     * @return user
     * */
    @PostMapping("/login")
    private User userLogin(@RequestBody loginParams loginParams) {
        String userId = loginParams.getUserId();
        String password = loginParams.getPassword();
        System.out.println(userId);
        System.out.println(password);
        User user = userService.userLogin(userId, password);
        return user;
    }


    /*@GetMapping("/user/{id}")
    public User userLogin(@PathVariable String id) {
        return loginService.userLogin(id, id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String hello(){
        return "hello doit";
    }

    @PostMapping("/user/logout")
    public String userLogout() {
        return "退出成功";
    }*/

}
