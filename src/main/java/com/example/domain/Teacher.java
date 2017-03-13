package com.example.domain;

import javax.persistence.*;

/**
 * Created by luohuasen on 2017/3/10.
 */
@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn
    private Person person;
    @ManyToOne
    @JoinColumn
    private Grade grade;
    @ManyToOne
    @JoinColumn
    private Subject subject;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
