package com.example.domain;

import javax.persistence.*;

/**
 * Created by luohuasen on 2017/3/10.
 */
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn()
    private Person person;

    @ManyToOne
    @JoinColumn()
    private Classes classes;

    @ManyToOne
    @JoinColumn()
    private Grade grade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
