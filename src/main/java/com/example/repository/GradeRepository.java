package com.example.repository;

import com.example.domain.Classes;
import com.example.domain.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luohuasen on 2017/3/10.
 */
@Repository
public interface GradeRepository extends JpaRepository<Grade,Long> {
    List<Grade> findByName(String name);
}
