package com.example.servers;

import com.example.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luohuasen on 2017/3/10.
 */
@Service
public class GradeServer {
    @Autowired
    GradeRepository gradeRepository;
}
