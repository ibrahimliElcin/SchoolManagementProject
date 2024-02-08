/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.perfect.dao.inter;

import az.perfect.entity.School;
import java.util.List;

/**
 *
 * @author DESIGNER
 */
public interface SchoolDaoInter {
    void update(School sc);

    void delete(int id);

    void insert(School sc);

    School getSchoolById(int id);

    List<School> getAllSchools();
}
