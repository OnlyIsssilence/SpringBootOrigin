package com.onlyisssilence.muya.controller;

import com.onlyisssilence.muya.domain.db1.Project;
import com.onlyisssilence.muya.domain.db1.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;

/**
 * Author: MuYa
 * Date  : 2017/7/21
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonTest {
    @Autowired
    private ProjectRepository projectRepository;

    @Test
    public void addProject(){
        String uuid = "";

        Date date = null;
        for (int i = 0 ;i<5;i++){
            date = new Date();
            uuid = UUID.randomUUID().toString();
            projectRepository.save(new Project(uuid,uuid,"www.baidu.com","李阳:"+i,
                    date.toString(),date,date));

        }

    }


}
