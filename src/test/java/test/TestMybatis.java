package test;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.storm.pojo.User;
import com.storm.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);  
	@Resource
	private UserService userService;
  
    @Test  
    public void test1() {  
        User user = (User) userService.getUserById(1);  
        System.out.println(user.getUsername());  
        logger.info("值："+user.getUsername());  
        logger.info(JSON.toJSONString(user));  
    }  
}
