package com.soya.springboot;

import com.soya.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyFirstApplicationTest {
    @Autowired
    Person person;
    @Test
    public void loadContext(){
        System.out.println(person);
    }
}
