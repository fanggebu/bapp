package com.qiuhen.bapp.rest;

import com.qiuhen.bapp.po.Person;
import com.qiuhen.bapp.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: bapp
 * @Package: rest
 * @ClassName: PersonRest
 * @Author: qiuhen
 * @Description: 个人
 * @Date: 2020/8/9 20:39
 * @Version: 1.0
 */
@Api("个人注册接口")
@RestController
@RequestMapping("/person")
public class PersonRest {

    private final static Logger logger = LoggerFactory.getLogger(Person.class);

    @Autowired
    private PersonService personService;

    @ApiOperation("添加用户")
    @PostMapping(path = "/addPerson")
    @ResponseBody
    public void addPerson(Person person) {
        logger.info("添加新用户");
        System.out.println("执行了");
//        personSer.save(person);
    }

}
