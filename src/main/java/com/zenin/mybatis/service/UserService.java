package com.zenin.mybatis.service;

import java.util.List;

import com.zenin.mybatis.entity.Article;

/**
 * 业务接口.
 */
public interface UserService {
    /**
     * 根据用户Id获取用户的所有文章
     * 
     * @param uid
     *            用户id
     * @return 文章集合
     */
    List<Article> queryUserArticles(Integer uid);
}
