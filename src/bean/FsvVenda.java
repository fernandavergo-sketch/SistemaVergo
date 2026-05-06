/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;
import java.util.Date;
/**
 *
 * @author vergo
 */
public class FsvVenda {
    private int fsvIdVenda;
    private Date fsvDataVenda;
    private int fsvIdFornecedor;
    private int fsvIdUsuario;
    private Double fsvDesconto;
    private Double fsvTotal;
    private String fsvDescricao;
    private String fsvTipo;

    /**
     * @return the fsvIdVenda
     */
    public int getFsvIdVenda() {
        return fsvIdVenda;
    }

    /**
     * @param fsvIdVenda the fsvIdVenda to set
     */
    public void setFsvIdVenda(int fsvIdVenda) {
        this.fsvIdVenda = fsvIdVenda;
    }

    /**
     * @return the fsvDataVenda
     */
    public Date getFsvDataVenda() {
        return fsvDataVenda;
    }

    /**
     * @param fsvDataVenda the fsvDataVenda to set
     */
    public void setFsvDataVenda(Date fsvDataVenda) {
        this.fsvDataVenda = fsvDataVenda;
    }

    /**
     * @return the fsvIdFornecedor
     */
    public int getFsvIdFornecedor() {
        return fsvIdFornecedor;
    }

    /**
     * @param fsvIdFornecedor the fsvIdFornecedor to set
     */
    public void setFsvIdFornecedor(int fsvIdFornecedor) {
        this.fsvIdFornecedor = fsvIdFornecedor;
    }

    /**
     * @return the fsvIdUsuario
     */
    public int getFsvIdUsuario() {
        return fsvIdUsuario;
    }

    /**
     * @param fsvIdUsuario the fsvIdUsuario to set
     */
    public void setFsvIdUsuario(int fsvIdUsuario) {
        this.fsvIdUsuario = fsvIdUsuario;
    }

    /**
     * @return the fsvDesconto
     */
    public Double getFsvDesconto() {
        return fsvDesconto;
    }

    /**
     * @param fsvDesconto the fsvDesconto to set
     */
    public void setFsvDesconto(Double fsvDesconto) {
        this.fsvDesconto = fsvDesconto;
    }

    /**
     * @return the fsvTotal
     */
    public Double getFsvTotal() {
        return fsvTotal;
    }

    /**
     * @param fsvTotal the fsvTotal to set
     */
    public void setFsvTotal(Double fsvTotal) {
        this.fsvTotal = fsvTotal;
    }

    /**
     * @return the fsvDescricao
     */
    public String getFsvDescricao() {
        return fsvDescricao;
    }

    /**
     * @param fsvDescricao the fsvDescricao to set
     */
    public void setFsvDescricao(String fsvDescricao) {
        this.fsvDescricao = fsvDescricao;
    }

    /**
     * @return the fsvTipo
     */
    public String getFsvTipo() {
        return fsvTipo;
    }

    /**
     * @param fsvTipo the fsvTipo to set
     */
    public void setFsvTipo(String fsvTipo) {
        this.fsvTipo = fsvTipo;
    }
}

