package com.example.demo.mapper;

import com.example.demo.entities.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User getUserById(Integer id);

    User getUserByName(String username);

    int deleteUserById(Integer id);

    int updateUser(User user);

    int adduser(String username,String password);

    List<User> getUsers(@Param("ids") List<Integer> ids);

    List<User> queryUsers(User user);
}
