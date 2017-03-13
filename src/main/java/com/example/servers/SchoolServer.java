package com.example.servers;
import com.example.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luohuasen on 2017/3/10.
 */
@Service
public class SchoolServer {
    @Autowired
    SchoolRepository schoolRepository;
}
