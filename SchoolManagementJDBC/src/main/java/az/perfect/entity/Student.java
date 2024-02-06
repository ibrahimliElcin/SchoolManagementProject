/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.entity;

/**
 *
 * @author Perfect
 */
public class Student extends Person {

    private int student_id;
    private String password;
    private Teacher teacher;
    private School school;

    public Student() {
    }

    public Student(String name, String surname, int age, int student_id, String password, Teacher teacher, School school) {
        super(name, surname, age);
        this.student_id = student_id;
        this.password = password;
        this.teacher = teacher;
        this.school = school;
    }

    public Student(int student_id) {
        this.student_id = student_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

 
    
    
}
