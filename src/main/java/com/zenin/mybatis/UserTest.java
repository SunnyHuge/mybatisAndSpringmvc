package com.zenin.mybatis;

import com.zenin.mybatis.entity.Article;
import com.zenin.mybatis.dao.IUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {

    private static Logger logger = LoggerFactory.getLogger(UserTest.class);

    private static ApplicationContext context;

    static {
	try {
	    context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
	} catch (NullPointerException e) {
	    logger.error("初始化配置文件时发生错误: {}", e.toString());
	}
    }

    public static void main(String[] args) {
	try {
	    //查找id为1的用户
	    //User user = session.selectOne("com.zenin.mybatis.entity.UserMapper.selectUserById", 1);
	    
	    // 配置service层
	    IUserDao userService = (IUserDao)context.getBean("userDao");
	    
	    // 添加用户
            // User zsw = new User();
            // zsw.setUserName("张三汪");
            // zsw.setUserAge(40);
            // zsw.setUserAddress("南京");
            // boolean add = userOperation.addUser(zsw);
            // session.commit();
	    //logger.info("插入结果: {}", add);

	    // 删除id为7的用户
            // boolean delete = userOperation.deleteUserById(7);
            // session.commit();
            // logger.info("删除结果: {}", delete);

	    //map 传递参数更新
	    //Map<String, Object> map = new HashMap<String, Object>();
	    //map.put("id", 1);
	    //map.put("userAge", 10);
	    //boolean update = userOperation.updateUserById(map);
	    //session.commit();
	    //logger.info("更新结果: {}", update);

	    //// User传递参数
	    //User user = new User();
	    //user.setUserAge(10);
	    //user.setId(1);
	    //user.setUserAddress("安徽");
	    //boolean update = userOperation.updateUser(user);
	    //session.commit();
	    //logger.info("更新结果: {}", update);

	    // 查找id为1的用户
	    //User user = userOperation.queryUserById(1);
	    //logger.info("查询结果：{}", user.toString());

	    //查询姓张的所有用户List<User>
	    //List<User> userList = userOperation.queryListUser("张%");
	    //logger.info("姓张的所有用户人数：{}", userList.size());
	    //for (User user1 : userList) {
		//logger.info("用户：{}", user1.toString());
	    //}

	    //
	    List<Article> articles = userService.queryUserArticles(1);
	    for (Article article : articles) {
		logger.info("{}", article.toString());
	    }

	} catch (Exception e) {
	    logger.error("获取sqlSession时发生错误: {}", e.toString());
	}
    }
}
