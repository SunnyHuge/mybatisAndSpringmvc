package com.zenin.mybatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zenin.mybatis.dao.IUserDao;
import com.zenin.mybatis.entity.Article;
import com.zenin.mybatis.service.UserService;

/**
 * 业务实现类.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private IUserDao userDao;

    public List<Article> queryUserArticles(Integer uid) {
        List<Article> articleList = userDao.queryUserArticles(uid);
        return articleList;
    }
}
