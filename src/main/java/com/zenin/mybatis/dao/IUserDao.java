package com.zenin.mybatis.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.zenin.mybatis.entity.Article;
import com.zenin.mybatis.entity.User;

public interface IUserDao {

    /**
     * 添加用户
     * 
     * @param user
     *            用户对象
     * @return 是否成功
     */
    boolean addUser(User user) throws DataAccessException;

    /**
     * 根据用户id删除用户
     *
     * @param id
     *            用户id
     * @return 是否成功
     */
    boolean deleteUserById(Integer id) throws DataAccessException;

    /**
     * 更新用户信息
     * 
     * @param user
     *            用户信息
     * @return 是否成功
     */
    boolean updateUser(User user) throws DataAccessException;

    /**
     * 根据用户id获取用户
     * 
     * @param id
     *            用户id
     * @return 用户信息
     */
    User queryUserById(Integer id) throws DataAccessException;

    /**
     * 获取用户名为userName的所有用户
     * 
     * @param userName
     *            用户名
     * @return 用户集合
     */
    List<User> queryListUser(String userName) throws DataAccessException;

    /**
     * 根据id获取用户的所有文章
     * 
     * @param userId
     *            用户id
     * @return 文章几个
     */
    List<Article> queryUserArticles(Integer userId) throws DataAccessException;
}
