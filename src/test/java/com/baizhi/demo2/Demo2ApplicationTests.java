package com.baizhi.demo2;

import com.baizhi.demo2.entity.Emp;
import com.baizhi.demo2.entity.User;
import com.baizhi.demo2.mapper.EmpMapper;
import com.baizhi.demo2.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {

    @Resource
    private UserMapper userMapper;
    @Resource
    private EmpMapper empMapper;
    @Test
    public void Test(){
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void Test2(){
        User t = new User(null,"Tom","mayun","aaaaaa",1);
        userMapper.insert(t);
    }

    @Test
    public void Test3(){
        userMapper.deleteByPrimaryKey(2);
    }

    @Test
    public void Test4(){
        List<Emp> emps = empMapper.selectAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

}
