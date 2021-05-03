package com.example.demo.service.iml;

import com.example.demo.entities.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceIml implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public List<User> getUsers(List<Integer> ids) {
        List<User> users=userMapper.getUsers(ids);
        return users;
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public String insert(String username,String password) {
        if (!StringUtils.isEmpty(username)
                && !StringUtils.isEmpty(password)) {
            User user = userMapper.getUserByName(username);
            if (user != null) {
                return "该用户已经存在，请勿重复添加！";
            } else if (user == null) {
                userMapper.adduser(username,password);
                return "成功添加用户：" + username;
            }
        }
        return "用户名，密码不能为空";
    }

    @Override
    public List<User> queryUsers(User user) {
        return userMapper.queryUsers(user);
    }
}
