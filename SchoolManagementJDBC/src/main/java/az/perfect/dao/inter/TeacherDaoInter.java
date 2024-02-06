/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.perfect.dao.inter;

import az.perfect.entity.Teacher;

/**
 *
 * @author Perfect
 */
public interface TeacherDaoInter {
    Teacher getTeacherByIdAndByPassword(int id,String password);
}
