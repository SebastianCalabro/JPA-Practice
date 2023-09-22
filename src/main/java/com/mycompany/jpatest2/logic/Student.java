package com.mycompany.jpatest2.logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) // Generates the Id in a Sequence of numbers
    private int id;
    @Basic
    private String name;
    private String lastName;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CAREER_ID")
    private Career career;
    @Temporal(TemporalType.DATE)
    private Date birthDay;
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthDay=" + birthDay + '}';
    }

    public Student() {
    }

    public Student(int id, String name, String lastName, Career career, Date birthDay) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.career = career;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    
}
