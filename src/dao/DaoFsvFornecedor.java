/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.FsvFornecedor;
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
public class DaoFsvFornecedor extends DaoAbstract{

    @Override
    public void insert(Object object) {
        FsvFornecedor fsvFornecedor = (FsvFornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            //url = "jdbc:mysql://localhost/db_fernanda_vergo";
            url = "jdbc:mysql://localhost/db_fernanda_vergo";
            user = "fernanda_vergo";
            password = "fernanda_vergo";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into fsv_fornecedor values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, fsvFornecedor.getFsvIdFornecedor());
            pst.setString(2,fsvFornecedor.getFsvNome());
            pst.setString(3,fsvFornecedor.getFsvCNPJ());
            pst.setString(4,fsvFornecedor.getFsvWhatsapp());
            pst.setString(5,fsvFornecedor.getFsvTelefoneFixo());
            pst.setString(6,fsvFornecedor.getFsvEmail());
            pst.setString(7,fsvFornecedor.getFsvEstado());
            pst.setString(8,fsvFornecedor.getFsvCidade());
            pst.setString(9,fsvFornecedor.getFsvBairro());
            pst.setString(10,fsvFornecedor.getFsvCEP());
            pst.setString(11,fsvFornecedor.getFsvEndereco());
            pst.setString(12,fsvFornecedor.getFsvRepresentante());
            pst.setString(13,fsvFornecedor.getFsvTipo());
            pst.setString(14,fsvFornecedor.getFsvSite());
            pst.setString(15,fsvFornecedor.getFsvAtivo());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoFsvFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoFsvFornecedor.class.getName()).log(Level.SEVERE, null, ex);
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
