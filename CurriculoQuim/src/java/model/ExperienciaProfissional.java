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
    private int Codigo;
    private String NomeEmpresa;
    private String Ramo;
    private String Cargo;
    private String DataAdmissao;
    private String DataDemissao;

    public ExperienciaProfissional(int Codigo, String NomeEmpresa, String Ramo, String Cargo, String DataAdmissao, String DataDemissao) {
        this.Codigo = Codigo;
        this.NomeEmpresa = NomeEmpresa;
        this.Ramo = Ramo;
        this.Cargo = Cargo;
        this.DataAdmissao = DataAdmissao;
        this.DataDemissao = DataDemissao;
    }

    public int getIdexperienciaprofissional() {
        return idexperienciaprofissional;
    }

    public void setIdexperienciaprofissional(int idexperienciaprofissional) {
        this.idexperienciaprofissional = idexperienciaprofissional;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
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

}