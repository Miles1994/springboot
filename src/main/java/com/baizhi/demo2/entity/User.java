package com.baizhi.demo2.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @author Administrator
 * @Title: User
 * @ProjectName springboot
 * @Date 2018-12-12--16:39
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "e_user")
public class User implements Serializable {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private  String  username;
    private  String  password;
    private  String  realname;
    private  Integer sax;
}
