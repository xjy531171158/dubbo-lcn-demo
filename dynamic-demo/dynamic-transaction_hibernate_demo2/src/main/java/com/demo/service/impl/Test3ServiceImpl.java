package com.demo.service.impl;

import com.demo.annotation.DynamicDataSource;
import com.demo.dao.TestDao;
import com.demo.entity.Test;
import com.demo.service.Test3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lorne on 2017/6/14.
 */
@Service
@DynamicDataSource(name = "datasource")
public class Test3ServiceImpl implements Test3Service {


    @Autowired
    private TestDao testDao;

    @Override
    @Transactional
    public String test() {
        String name = "hibernate_demo2";
        Test test = new Test();
        test.setName(name);
        testDao.save(test);
        return name;
    }
}
