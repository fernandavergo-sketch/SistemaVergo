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
public class FsvCompra_Produto {
    private int fsvIdCompraProduto;
    private int fsvIdCompra;
    private int fsvIdProduto;
    private Double fsvTotal;
    private int fsvQuantidade;
    private Date fsvData;
    private String fsvObservacao;

    /**
     * @return the fsvIdCompraProduto
     */
    public int getFsvIdCompraProduto() {
        return fsvIdCompraProduto;
    }

    /**
     * @param fsvIdCompraProduto the fsvIdCompraProduto to set
     */
    public void setFsvIdCompraProduto(int fsvIdCompraProduto) {
        this.fsvIdCompraProduto = fsvIdCompraProduto;
    }

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
     * @return the fsvIdProduto
     */
    public int getFsvIdProduto() {
        return fsvIdProduto;
    }

    /**
     * @param fsvIdProduto the fsvIdProduto to set
     */
    public void setFsvIdProduto(int fsvIdProduto) {
        this.fsvIdProduto = fsvIdProduto;
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
     * @return the fsvQuantidade
     */
    public int getFsvQuantidade() {
        return fsvQuantidade;
    }

    /**
     * @param fsvQuantidade the fsvQuantidade to set
     */
    public void setFsvQuantidade(int fsvQuantidade) {
        this.fsvQuantidade = fsvQuantidade;
    }

    /**
     * @return the fsvData
     */
    public Date getFsvData() {
        return fsvData;
    }

    /**
     * @param fsvData the fsvData to set
     */
    public void setFsvData(Date fsvData) {
        this.fsvData = fsvData;
    }

    /**
     * @return the fsvObservacao
     */
    public String getFsvObservacao() {
        return fsvObservacao;
    }

    /**
     * @param fsvObservacao the fsvObservacao to set
     */
    public void setFsvObservacao(String fsvObservacao) {
        this.fsvObservacao = fsvObservacao;
    }
}
