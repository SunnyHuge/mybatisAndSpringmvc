package com.zenin.mybatis.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zenin.mybatis.entity.Article;
import com.zenin.mybatis.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/articles")
    public ModelAndView getAllArticles(HttpServletRequest request, HttpServletResponse response) {
        List<Article> articles = userService.queryUserArticles(1);
        ModelAndView model = new ModelAndView("articles");
        model.addObject("articles", articles);
        return model;
    }
}
