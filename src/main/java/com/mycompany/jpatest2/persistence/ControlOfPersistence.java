package com.mycompany.jpatest2.persistence;

import com.mycompany.jpatest2.logic.Career;
import com.mycompany.jpatest2.logic.Student;
import com.mycompany.jpatest2.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlOfPersistence {
    StudentJpaController stuJpa = new StudentJpaController();
    CareerJpaController caJpa = new CareerJpaController();
    public void createStudent(Student stu){
        stuJpa.create(stu);
    }

    public void deleteStudent(int stuId) {
        try {
            stuJpa.destroy(stuId);
        } catch (NonexistentEntityException ex) {
            System.out.println("The student that you tried to delete doesnt exists");
        }
    }

    public void editStudent(Student stu) {
        try {
            stuJpa.edit(stu);
        } catch (Exception ex) {
            System.out.println("The student that you tried to edit doesnt exists");        }
    }
    public Student findStudent(int stuId) {
        return stuJpa.findStudent(stuId);
    }
    public List<Student> findStudents(){
        return stuJpa.findStudentEntities();
    }
    public void createCareer(Career ca){
        caJpa.create(ca);
    }

    public Career findCareer(int carId) {
        return caJpa.findCareer(carId);
    }
}
