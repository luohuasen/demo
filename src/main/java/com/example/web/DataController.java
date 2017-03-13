package com.example.web;

import com.example.domain.Person;
import com.example.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by luohuasen on 2016/12/28.
 */
@RestController()
public class DataController {
    protected static Logger logger= LoggerFactory.getLogger(DataController.class);
    @Autowired
    PersonRepository personRepository;
    @RequestMapping("/list")
    public List<Person> list(){
        logger.debug("list");
        return personRepository.findAll();
    }

}
