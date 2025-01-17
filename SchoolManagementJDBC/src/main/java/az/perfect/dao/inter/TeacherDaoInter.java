/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.perfect.dao.inter;

import az.perfect.entity.Teacher;
import java.util.List;

/**
 *
 * @author Perfect
 */
public interface TeacherDaoInter {
      void update(Teacher t);

    void delete(int id);

    void insert(Teacher t);

    Teacher getTeacherById(int id);

    List<Teacher> getAllTeachers();
    
    Teacher getTeacherByIdAndByPassword(int id,String password);
}
