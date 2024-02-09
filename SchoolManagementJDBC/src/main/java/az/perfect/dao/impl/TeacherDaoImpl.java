/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.dao.impl;

import az.perfect.config.AbstractDao;
import az.perfect.dao.inter.TeacherDaoInter;
import az.perfect.entity.Teacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author DESIGNER
 */
public class TeacherDaoImpl extends AbstractDao implements TeacherDaoInter {

    @Override
    public void update(Teacher t) {
        try (Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("update teacher set name=?,surname=?,age=?,password=?,teacher_id=?,school_id=?");
            st.setString(1, t.getName());
            st.setString(2, t.getSurname());
            st.setInt(3, t.getAge());
            st.setString(4, t.getPassword());
            st.setInt(5, t.getTeacher_id());
            st.setInt(6, t.getSchool().getSchool_id());
            st.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try (Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("delete from teacher where teacher_id=?");
            st.setInt(1, id);

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insert(Teacher t) {
        try (Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("insert into teacher(name,surname,age,password,teacher_id,school_id) values (?,?,?,?,?,?);");
            st.setString(1, t.getName());
            st.setString(2, t.getSurname());
            st.setInt(3, t.getAge());
            st.setString(4, t.getPassword());
            st.setInt(5, t.getTeacher_id());
            st.setInt(6, t.getSchool().getSchool_id());

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Teacher getTeacherById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Teacher> getAllTeachers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Teacher getTeacherByIdAndByPassword(int id, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
