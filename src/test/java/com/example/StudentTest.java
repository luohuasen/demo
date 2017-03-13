package com.example;
import com.example.domain.Student;
import com.example.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by luohuasen on 2017/3/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {
    @Autowired
    StudentRepository studentRepository;

    @Test
    public void test(){
        List<Student> list = studentRepository.findAll();
        System.out.println("获取学生个数为："+list.size());
        Assert.notEmpty(list);
    }
}
