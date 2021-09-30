/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrador
 */
public class ExperienciaProfissional {

    private int idexperienciaprofissional;
    private int codigoCurriculo;
    private String NomeEmpresa;
    private String Ramo;
    private String Cargo;
    private String DataAdmissao;
    private String DataDemissao;

    public int getIdexperienciaprofissional() {
        return idexperienciaprofissional;
    }

    public void setIdexperienciaprofissional(int idexperienciaprofissional) {
        this.idexperienciaprofissional = idexperienciaprofissional;
    }

    public int getCodigoCurriculo() {
        return codigoCurriculo;
    }

    public void setCodigoCurriculo(int codigoCurriculo) {
        this.codigoCurriculo = codigoCurriculo;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String NomeEmpresa) {
        this.NomeEmpresa = NomeEmpresa;
    }

    public String getRamo() {
        return Ramo;
    }

    public void setRamo(String Ramo) {
        this.Ramo = Ramo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getDataAdmissao() {
        return DataAdmissao;
    }

    public void setDataAdmissao(String DataAdmissao) {
        this.DataAdmissao = DataAdmissao;
    }

    public String getDataDemissao() {
        return DataDemissao;
    }

    public void setDataDemissao(String DataDemissao) {
        this.DataDemissao = DataDemissao;
    }

    public ExperienciaProfissional() {
    }

    
}