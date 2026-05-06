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
public class FsvCompra {
  private int fsvIdCompra;
  private Date fsvDataCompra;
  private int fsvIdFornecedor;
  private int fsvIdUsuario;
  private Double fsvDesconto;
  private Double fsvTotal;
  private String fsvTipo;
  private String fsvDescricao;

    /**
     * @return the fsvIdCompra
     */
    public int getFsvIdCompra() {
        return fsvIdCompra;
    }

    /**
     * @param fsvIdCompra the fsvIdCompra to set
     */
    public void setFsvIdCompra(int fsvIdCompra) {
        this.fsvIdCompra = fsvIdCompra;
    }

    /**
     * @return the fsvDataCompra
     */
    public Date getFsvDataCompra() {
        return fsvDataCompra;
    }

    /**
     * @param fsvDataCompra the fsvDataCompra to set
     */
    public void setFsvDataCompra(Date fsvDataCompra) {
        this.fsvDataCompra = fsvDataCompra;
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
}
