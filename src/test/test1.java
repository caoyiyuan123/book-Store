package test;

import com.book.entity.User;
import com.book.mapper.user.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: jack
 * @Create: 2018-08-10-0:31
 * @Desc: 测试类
 **/

public class test1 {

    @Autowired
    private UserMapper userMapper;

    @Before
    public void init(){
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        userMapper = ac.getBean("userMapper", UserMapper.class);
        System.out.println(userMapper);

    }

    @Test
    public void add(){
        User recode = new User();
        recode.setUsername("小三子");
        recode.setPassword("123");
        recode.setRealname("张三");
        recode.setGender("男");
        recode.setEmail("695142919@qq.com");
        recode.setPhone("15623984801");
        recode.setCompany("xxx公司");
        userMapper.addUser(recode);
        System.out.println("添加成功");
    }
}
