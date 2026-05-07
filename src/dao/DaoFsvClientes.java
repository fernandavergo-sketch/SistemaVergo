/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.FsvClientes;
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
public class DaoFsvClientes extends DaoAbstract{

    @Override
    public void insert(Object object) {
        FsvClientes fsvClientes = (FsvClientes) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            //url = "jdbc:mysql://localhost/db_fernanda_vergo";
            url = "jdbc:mysql://localhost/db_fernanda_vergo";
            user = "fernanda_vergo";
            password = "fernanda_vergo";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into fsv_clientes values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, fsvClientes.getFsvIdCliente());
            pst.setString(2,fsvClientes.getFsvNome());
            pst.setString(3,fsvClientes.getFsvApelido());
            pst.setString(4,fsvClientes.getFsvCPF());
            pst.setDate(5,null);
            pst.setString(6,fsvClientes.getFsvGenero());
            pst.setString(7,fsvClientes.getFsvEmail());
            pst.setString(8,fsvClientes.getFsvTelefone());
            pst.setString(9,fsvClientes.getFsvCidade());
            pst.setString(10,fsvClientes.getFsvBairro());
            pst.setString(11,fsvClientes.getFsvCEP());
            pst.setString(12,fsvClientes.getFsvIndicacao());
            pst.setString(13,fsvClientes.getFsvPrimeiraCompra());
            pst.setDate(14,null);
            pst.setString(15,fsvClientes.getFsvAtendente());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoFsvClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoFsvClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;    }
    
}
