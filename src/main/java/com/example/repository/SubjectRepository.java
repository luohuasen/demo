package com.example.repository;

import com.example.domain.Person;
import com.example.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luohuasen on 2017/3/10.
 */
@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long> {
    List<Subject> findByName(String name);
}
