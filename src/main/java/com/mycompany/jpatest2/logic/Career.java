package com.mycompany.jpatest2.logic;

import java.io.Serializable;
//import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;

@Entity
public class Career implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String name;
    private double fee;
//    @OneToMany
//    private ArrayList<Student> studentsOnTheCareer;

    public Career() {
    }

    public Career(String name, double fee) {
        this.name = name;
        this.fee = fee;
//        this.studentsOnTheCareer = studentsOnTheCareer;
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

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

//    public ArrayList<Student> getStudentsOnTheCareer() {
//        return studentsOnTheCareer;
//    }
//
//    public void setStudentsOnTheCareer(ArrayList<Student> studentsOnTheCareer) {
//        this.studentsOnTheCareer = studentsOnTheCareer;
//    }
    
    
}
