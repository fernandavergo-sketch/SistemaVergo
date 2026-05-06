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
public class FsvVenda_Produto {
    private int fsvIdVendaProduto;
    private int fsvIdVenda;
    private int fsvIdProduto;
    private int fsvQuantidade;
    private Double fsvTotal;
    private Date fsvData;
    private String fsvObservacao;

    /**
     * @return the fsvIdVendaProduto
     */
    public int getFsvIdVendaProduto() {
        return fsvIdVendaProduto;
    }

    /**
     * @param fsvIdVendaProduto the fsvIdVendaProduto to set
     */
    public void setFsvIdVendaProduto(int fsvIdVendaProduto) {
        this.fsvIdVendaProduto = fsvIdVendaProduto;
    }

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
