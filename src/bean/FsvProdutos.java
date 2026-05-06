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
public class FsvProdutos {
    private int fsvIdProdutos;
    private String fsvNome;
    private String fsvDescricao;
    private String fsvTipo;
    private Double fsvPreco;
    private Date fsvDataCadastro;
    private String fsvFragil;

    /**
     * @return the fsvIdProdutos
     */
    public int getFsvIdProdutos() {
        return fsvIdProdutos;
    }

    /**
     * @param fsvIdProdutos the fsvIdProdutos to set
     */
    public void setFsvIdProdutos(int fsvIdProdutos) {
        this.fsvIdProdutos = fsvIdProdutos;
    }

    /**
     * @return the fsvNome
     */
    public String getFsvNome() {
        return fsvNome;
    }

    /**
     * @param fsvNome the fsvNome to set
     */
    public void setFsvNome(String fsvNome) {
        this.fsvNome = fsvNome;
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

    /**
     * @return the fsvPreco
     */
    public Double getFsvPreco() {
        return fsvPreco;
    }

    /**
     * @param fsvPreco the fsvPreco to set
     */
    public void setFsvPreco(Double fsvPreco) {
        this.fsvPreco = fsvPreco;
    }

    /**
     * @return the fsvDataCadastro
     */
    public Date getFsvDataCadastro() {
        return fsvDataCadastro;
    }

    /**
     * @param fsvDataCadastro the fsvDataCadastro to set
     */
    public void setFsvDataCadastro(Date fsvDataCadastro) {
        this.fsvDataCadastro = fsvDataCadastro;
    }

    /**
     * @return the fsvFragil
     */
    public String getFsvFragil() {
        return fsvFragil;
    }

    /**
     * @param fsvFragil the fsvFragil to set
     */
    public void setFsvFragil(String fsvFragil) {
        this.fsvFragil = fsvFragil;
    }
}
