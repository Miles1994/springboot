package com.baizhi.demo2.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Administrator
 * @Title: Emp
 * @ProjectName springboot
 * @Date 2018-12-12--19:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "e_emp")
public class Emp implements Serializable {
    @Id
    private Integer id;
    private String name;
    private Double salary;
    private Integer age;
    private String realName;
}
