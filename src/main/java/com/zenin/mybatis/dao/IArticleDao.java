package com.zenin.mybatis.dao;

import com.zenin.mybatis.entity.Article;

public interface IArticleDao {
    Article queryArticleById(Integer id);
}
