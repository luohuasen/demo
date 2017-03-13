package com.example.repository;
import com.example.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luohuasen on 2017/3/10.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
