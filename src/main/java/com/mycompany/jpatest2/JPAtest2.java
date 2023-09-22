package com.mycompany.jpatest2;

import com.mycompany.jpatest2.logic.Career;
import com.mycompany.jpatest2.logic.ControlOfLogic;
import com.mycompany.jpatest2.logic.Student;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JPAtest2 {

    public static void main(String[] args) {
        Student s2;
        ControlOfLogic cl = new ControlOfLogic();
        Career existingCareer = cl.findCareer(7);
        if (existingCareer != null) {
            // La carrera ya existe, usar la instancia existente
            s2 = new Student(8, "Pindorcho", "rigoide", existingCareer, new Date());
        } else {
            // La carrera no existe, crear una nueva instancia y guardarla
            Career newCareer = new Career("Bakery", 300000);
            cl.createCareer(newCareer);

            // Crear el estudiante con la nueva carrera
            s2 = new Student(8, "Pindorcho", "rigoide", newCareer, new Date());
        }
        

        // Guardar el estudiante en la base de datos
        cl.createStudent(s2);
    }
}
