package com.example.servers;

import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luohuasen on 2017/3/9.
 */
@Service
public class PersonServer {
    @Autowired
    PersonRepository personRepository;
}
