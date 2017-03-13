package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by luohuasen on 2016/12/28.
 */
@Entity
@Table(name="person")
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private Long code;
    private String name;
    private String sex;
    private Integer age;

    public Person(){
        super();
    }

    public Person(Long id, Long code,String name, String sex,Integer age){
        super();
        this.id = id;
        this.code = code;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
