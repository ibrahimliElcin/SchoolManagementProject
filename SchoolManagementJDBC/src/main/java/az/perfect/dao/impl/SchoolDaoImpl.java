/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.dao.impl;

import az.perfect.config.AbstractDao;
import az.perfect.dao.inter.SchoolDaoInter;
import az.perfect.entity.School;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DESIGNER
 */
public class SchoolDaoImpl extends AbstractDao implements SchoolDaoInter {

    @Override
    public void update(School sc) {
        try (Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("update school set school_id=?, name=?");
            st.setInt(1, sc.getSchool_id());
            st.setString(2, sc.getSchool_name());

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try (Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("delete from school where school_id=?");
            st.setInt(1, id);

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insert(School sc) {
        try(Connection conn=connect()){
            PreparedStatement st = conn.prepareCall("insert into school(name, school_id) values(?,?)");
            st.setString(1, sc.getSchool_name());
            st.setInt(2, sc.getSchool_id());
            
            st.execute();
            
           
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }

    @Override
    public School getSchoolById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<School> getAllSchools() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
