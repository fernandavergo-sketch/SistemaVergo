/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.FsvCompra;
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
public class DaoFsvCompra extends DaoAbstract{

    @Override
    public void insert(Object object) {
        FsvCompra fsvCompra = (FsvCompra) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            //url = "jdbc:mysql://localhost/db_fernanda_vergo";
            url = "jdbc:mysql://localhost/db_fernanda_vergo";
            user = "fernanda_vergo";
            password = "fernanda_vergo";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into fsv_compra values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, fsvCompra.getFsvIdCompra());
            pst.setInt(2,fsvCompra.getFsvIdFornecedor());
            pst.setInt(3,fsvCompra.getFsvIdUsuario());
            pst.setString(4,fsvCompra.getFsvDescricao());
            pst.setString(5,fsvCompra.getFsvTipo());
            pst.setDate(6, null);
            pst.setDouble(7,fsvCompra.getFsvTotal());
            pst.setDouble(8,fsvCompra.getFsvDesconto());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoFsvCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoFsvCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
    FsvCompra fsvCompra = (FsvCompra) object;

    }

    @Override
    public void delete(Object object) {
    FsvCompra fsvCompra = (FsvCompra) object;
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;    }
    
}
