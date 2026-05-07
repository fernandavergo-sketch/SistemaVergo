/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.FsvUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author vergo
 */
public class DaoFsvUsuarios extends DaoAbstract{

    @Override
    public void insert(Object object) {
        FsvUsuarios fsvUsuarios = (FsvUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            //url = "jdbc:mysql://localhost/db_fernanda_vergo";
            url = "jdbc:mysql://localhost/db_fernanda_vergo";
            user = "fernanda_vergo";
            password = "fernanda_vergo";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into fsv_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, fsvUsuarios.getFsvIdUsuarios());
            pst.setString(2,fsvUsuarios.getFsvNome());
            pst.setString(3,fsvUsuarios.getFsvApelido());
            pst.setString(4,fsvUsuarios.getFsvCPF());
            pst.setDate(5, null);
            pst.setInt(6,fsvUsuarios.getFsvnivel());
            pst.setString(7,fsvUsuarios.getFsvsenha());
            pst.setString(8,fsvUsuarios.getFsvativo());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoFsvUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoFsvUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        FsvUsuarios fsvUsuarios = (FsvUsuarios) object;
    }

    @Override
    public void delete(Object object) {
        FsvUsuarios fsvUsuarios = (FsvUsuarios) object;
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;    }
    
}
