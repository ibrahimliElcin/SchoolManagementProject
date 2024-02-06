/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.entity;

/**
 *
 * @author Perfect
 */
public class Teacher extends Person {

    private int teacher_id;
    private String password;
    private School school;

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Teacher(String name, String surname, int age, int teacher_id, String password, School school) {
        super(name, surname, age);
        this.teacher_id = teacher_id;
        this.password = password;
        this.school = school;
    }

    public Teacher(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Teacher() {
    }

}
