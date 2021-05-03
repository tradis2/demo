package com.example.demo.service;

import com.example.demo.entities.User;

import java.util.List;

public interface UserService {
    /**
     * 关于用户的增删改查，这都是用户这个概念下的增删改查，所以可以要抽出一个User的service类来
     * 一切关于用户的操作都放在这个类里面
     */
    /**
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 根据NAME查询用户信息
     * @param username
     * @return
     */
    User getUserByName(String username);

    /**
     * 根据id查询用户信息
     * @param ids
     * @return
     */
    List<User> getUsers(List<Integer> ids);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    void deleteUserById(Integer id);

    /**
     * 根据用户ID更新用户信息
     * @param user
     * @return
     */
    void updateUser(User user);

    /**
     * 添加一个新的用户
     * @param username,password
     * @return
     */
    String insert(String username,String password);

    /**
     * 根据id,username查询用户
     * @param user
     * @return
     */
    List<User> queryUsers(User user);
}
