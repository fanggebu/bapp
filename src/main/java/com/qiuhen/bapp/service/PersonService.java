package com.qiuhen.bapp.service;

import com.qiuhen.bapp.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: bapp
 * @Package: com.qiuhen.bapp.service
 * @ClassName: PersonService
 * @Author: qiuhen
 * @Description: 个人处理
 * @Date: 2020/8/9 20:50
 * @Version: 1.0
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
}
