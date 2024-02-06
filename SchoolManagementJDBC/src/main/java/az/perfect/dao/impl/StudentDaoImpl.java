/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.dao.impl;

import az.perfect.config.AbstractDao;
import az.perfect.dao.inter.StudentDaoInter;
import az.perfect.entity.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Perfect
 */
public class StudentDaoImpl extends AbstractDao implements StudentDaoInter {

    @Override
    public void update(Student s) {
        try ( Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("update student set name=?,surname=?,age=?,password=?,teacher_id=?,school_id=? where student_id=?");
            st.setString(1, s.getName());
            st.setString(2, s.getSurname());
            st.setInt(3, s.getAge());
            st.setString(4, s.getPassword());
            st.setInt(5, s.getTeacher().getTeacher_id());
            st.setInt(6, s.getSchool().getSchool_id());
            st.setInt(7, s.getStudent_id());

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        try ( Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("delete from student where student_id=?");
            st.setInt(1, id);

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void insert(Student s) {
        try ( Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("insert into student(name,surname,age,password,teacher_id,school_id) values (?,?,?,?,?,?);");
            st.setString(1, s.getName());
            st.setString(2, s.getSurname());
            st.setInt(3, s.getAge());
            st.setString(4, s.getPassword());
            st.setInt(5, s.getTeacher().getTeacher_id());
            st.setInt(6, s.getSchool().getSchool_id());

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public Student getStudentById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Student> getAllStudents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student getStudentByIdAndByPassword(int id, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
