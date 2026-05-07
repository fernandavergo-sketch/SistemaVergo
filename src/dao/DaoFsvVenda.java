/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.FsvVenda;
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
public class DaoFsvVenda extends DaoAbstract{

    @Override
    public void insert(Object object) {
        FsvVenda fsvVenda = (FsvVenda) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            //url = "jdbc:mysql://localhost/db_fernanda_vergo";
            url = "jdbc:mysql://localhost/db_fernanda_vergo";
            user = "fernanda_vergo";
            password = "fernanda_vergo";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into fsv_venda values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, fsvVenda.getFsvIdVenda());
            pst.setInt(2,fsvVenda.getFsvIdFornecedor());
            pst.setInt(3,fsvVenda.getFsvIdUsuario());
            pst.setString(4,fsvVenda.getFsvDescricao());
            pst.setString(5,fsvVenda.getFsvTipo());
            pst.setDate(6, null);
            pst.setDouble(7,fsvVenda.getFsvTotal());
            pst.setDouble(8,fsvVenda.getFsvDesconto());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoFsvVenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoFsvVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        FsvVenda fsvVenda = (FsvVenda) object;
    }

    @Override
    public void delete(Object object) {
        FsvVenda fsvVenda = (FsvVenda) object;
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;    }
    
}
