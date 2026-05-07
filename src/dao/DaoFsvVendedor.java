/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.FsvVendedor;
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
public class DaoFsvVendedor extends DaoAbstract{

    @Override
    public void insert(Object object) {
        FsvVendedor fsvVendedor = (FsvVendedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            //url = "jdbc:mysql://localhost/db_fernanda_vergo";
            url = "jdbc:mysql://localhost/db_fernanda_vergo";
            user = "fernanda_vergo";
            password = "fernanda_vergo";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into fsv_vendedor values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, fsvVendedor.getFsvIdVendedor());
            pst.setString(2,fsvVendedor.getFsvNome());
            pst.setString(3,fsvVendedor.getFsvGenero());
            pst.setString(4,fsvVendedor.getFsvCPF());
            pst.setDate(5, null);
            pst.setString(6,fsvVendedor.getFsvTelefone());
            pst.setString(7,fsvVendedor.getFsvEmail());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoFsvVendedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoFsvVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        FsvVendedor fsvVendedor = (FsvVendedor) object;
    }

    @Override
    public void delete(Object object) {
        FsvVendedor fsvVendedor = (FsvVendedor) object;
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;    }
    
}
