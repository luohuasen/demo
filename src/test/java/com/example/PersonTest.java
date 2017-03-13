package com.example;

/**
 * Created by luohuasen on 2017/3/9.
 */

import com.example.domain.Person;
import com.example.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {
    @Autowired
    PersonRepository personRepository;
    @Test
    public void test(){
        List<Person> list = personRepository.findAll();
        Assert.notEmpty(list);
    }
}
