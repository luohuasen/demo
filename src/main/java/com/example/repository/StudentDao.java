package com.example.repository;

import com.example.domain.Person;
import com.example.domain.Student;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by luohuasen on 2017/3/10.
 */
public class StudentDao {
    public static Specification<Student> whereCause(Student s){
        return new Specification<Student>() {
            @Override
            public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if(s.getId() != null){

                }
                return null;
            }
        };
    }
}
