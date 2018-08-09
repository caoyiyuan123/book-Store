package com.book.mapper.user;

import com.book.entity.User;

/**
 * @Author: jack
 * @Create: 2018-08-10-0:05
 * @Desc: 用户名的增删查改接口
 **/
public interface UserMapper {
    /**
     * 用户增加用户名
     * @param user
     */
    void addUser(User user);

    /**
     * 根据用户名来查找该用户，用户以后的登录验证
     * @param username
     * @return
     */
    User selectByUserName(String username);

    /**
     * 根据指定的id来查找该用户
     * @param id
     * @return
     */
    User selectById(Integer id);

    /**
     * 用来更新用户的信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 根据指定的id来删除用户
     * @param user
     */
    void deleteById(User user);
}
