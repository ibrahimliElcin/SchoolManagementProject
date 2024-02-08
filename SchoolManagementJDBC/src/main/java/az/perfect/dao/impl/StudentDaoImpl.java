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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Perfect
 */
public class StudentDaoImpl extends AbstractDao implements StudentDaoInter {

    @Override
    public void update(Student s) {
        try (Connection conn = connect()) {
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
        try (Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("delete from student where student_id=?");
            st.setInt(1, id);

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void insert(Student s) {
        try (Connection conn = connect()) {
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
        Student s = null;
        try (Connection conn = connect()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from allinfo where student_id=" + id);

            while (rs.next()) {
                s = getStudent(rs);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return s;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        try (Connection conn = connect()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from allinfo ");

            while (rs.next()) {
                list.add(getStudent(rs));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;

    }

    @Override
    public Student getStudentByIdAndByPassword(int id, String password) {
        try (Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("select from student where student_id=?,password=?");
            st.setInt(1, id);
            st.setString(2, password);
             
            
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;

    }

    

    public static Student getStudent(ResultSet rs) throws SQLException {
        int student_id = rs.getInt("student_id");
        String name = rs.getString("name");
        String surname = rs.getString("surname");
        int age = rs.getInt("age");
        String password = rs.getString("password");
        int teacher_id = rs.getInt("teacher_id");
        int school_id = rs.getInt("school_id");

        return new Student(student_id, name, surname, age, password, teacher_id, school_id);

    }
}
