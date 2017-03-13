package com.example.repository;

import com.example.domain.Subject;
import com.example.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by luohuasen on 2017/3/10.
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
