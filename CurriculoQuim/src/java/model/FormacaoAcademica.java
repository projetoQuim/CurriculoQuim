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
    private int codigoCurriculo;
    private String Escolaridade;
    private String AreaFormacao;
    private String InstituicaoEnsino;
    private String Curso;

    public int getIdformacaoacademica() {
        return idformacaoacademica;
    }

    public void setIdformacaoacademica(int idformacaoacademica) {
        this.idformacaoacademica = idformacaoacademica;
    }

    public int getCodigoCurriculo() {
        return codigoCurriculo;
    }

    public void setCodigoCurriculo(int codigoCurriculo) {
        this.codigoCurriculo = codigoCurriculo;
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

    public FormacaoAcademica() {
    }

    
}