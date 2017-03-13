package com.example.repository;

import com.example.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luohuasen on 2016/12/28.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    List<Person> findByName(String name);
}
