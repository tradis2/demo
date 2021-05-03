package com.example.demo.Controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.entities.User;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RestController
public class InsertController {
    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 所有的外部类的注入，都统一放在上面，方法放在下面
     * controller 调用 service ，service调用mapper
     */

    @Autowired
    UserService userService;

    /**
     * controller不要调用mapper
     */
    @Resource
    UserMapper userMapper;

    @PostMapping("/insert")
    public String add(String username,String password) {

        String result=userService.insert(username,password);

        return result;
    }

    @PostMapping("/select")
    public  User select(Integer id){

        logger.info("查询" + id + "的详细信息");

        User user = userMapper.getUserById(id);

        return user;
    }

    @PostMapping("/selectusers")
    public List<User> selectusers(@RequestBody List<Integer> ids,@RequestBody List<String> username){

        return userMapper.getUsers(ids);

    }

    @GetMapping("/update")
    public String update(User user){
        userMapper.updateUser(user);
        return "用户"+user.getId()+"信息更新完成";
    }

    @DeleteMapping("/delete")
    public String delect(Integer id) {
        userMapper.deleteUserById(id);
        return "删除用户" + id;
    }

    @PostMapping("/queryUsers")
    public List<User> query(User user){
        List result = userMapper.queryUsers(user);
        return result;
    }
}
