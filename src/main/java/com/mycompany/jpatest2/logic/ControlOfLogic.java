package com.mycompany.jpatest2.logic;

import com.mycompany.jpatest2.persistence.ControlOfPersistence;
import java.util.ArrayList;
import java.util.List;

public class ControlOfLogic {
    ControlOfPersistence cp = new ControlOfPersistence();
    public void createStudent(Student stu){
        cp.createStudent(stu);
    }
    public void deleteStudent(int stuId){
        cp.deleteStudent(stuId);
    }
    public void editStudent(Student stu){
        cp.editStudent(stu);
    }
    public Student findStudent(int stuId){
        return cp.findStudent(stuId);
    }
    public List<Student> findStudents(){
        return cp.findStudents();
    }
    public void createCareer(Career ca){
        cp.createCareer(ca);
    }
    public Career findCareer(int carId){
        return cp.findCareer(carId);
    }
}
