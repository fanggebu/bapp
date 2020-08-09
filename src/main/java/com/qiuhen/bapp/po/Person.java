package com.qiuhen.bapp.po;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ProjectName: bapp
 * @Package: com.qiuhen.interfaces.pojo
 * @ClassName: Person
 * @Author: qiuhen
 * @Description: 个人
 * @Date: 2020/8/9 19:42
 * @Version: 1.0
 */
@Entity
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = true, length = 20)
    private String name;

    @Column(name = "agee", nullable = true, length = 4)
    private int age;
}
