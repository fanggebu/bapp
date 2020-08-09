package com.qiuhen.bapp.dao;

import com.qiuhen.bapp.po.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ProjectName: bapp
 * @Package: com.qiuhen.bapp.dao
 * @ClassName: PersonRepository
 * @Author: qiuhen
 * @Description: dao接口
 * @Date: 2020/8/9 19:49
 * @Version: 1.0
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
