/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.perfect.dao.inter;

import az.perfect.entity.Student;
import java.util.List;

/**
 *
 * @author Perfect
 */
public interface StudentDaoInter {

    void update(Student s);

    void delete(int id);

    void insert(Student s);

    Student getStudentById(int id);

    List<Student> getAllStudents();
    
    Student getStudentByIdAndByPassword(int id,String password);
}
