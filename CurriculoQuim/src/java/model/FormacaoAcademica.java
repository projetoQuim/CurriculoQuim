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
public class FormacaoAcademica {

    private int idformacaoacademica;
    private int Codigo;
    private String Escolaridade;
    private String AreaFormacao;
    private String InstituicaoEnsino;
    private String Curso;

    public FormacaoAcademica(int Codigo, String Escolaridade, String AreaFormacao, String InstituicaoEnsino, String Curso) {
        this.Codigo = Codigo;
        this.Escolaridade = Escolaridade;
        this.AreaFormacao = AreaFormacao;
        this.InstituicaoEnsino = InstituicaoEnsino;
    }
    
    public FormacaoAcademica() {
    }
    
    public int getIdformacaoacademica() {
        return idformacaoacademica;
    }

    public void setIdformacaoacademica(int idformacaoacademica) {
        this.idformacaoacademica = idformacaoacademica;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getEscolaridade() {
        return Escolaridade;
    }

    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
    }

    public String getAreaFormacao() {
        return AreaFormacao;
    }

    public void setAreaFormacao(String AreaFormacao) {
        this.AreaFormacao = AreaFormacao;
    }

    public String getInstituicaoEnsino() {
        return InstituicaoEnsino;
    }

    public void setInstituicaoEnsino(String InstituicaoEnsino) {
        this.InstituicaoEnsino = InstituicaoEnsino;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

}