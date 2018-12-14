package com.baizhi.demo2.controller;

import com.baizhi.demo2.entity.User;
import com.baizhi.demo2.mapper.UserMapper;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @Title: UserController
 * @ProjectName springboot
 * @Date 2018-12-14--9:41
 */

@RestController
@RequestMapping("/us")
@Log4j
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("queryAll")
    @ResponseBody
    public List<User>queryAll(){
        List<User> users = userMapper.selectAll();
        log.info("qqqqqqqqq");
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

}
