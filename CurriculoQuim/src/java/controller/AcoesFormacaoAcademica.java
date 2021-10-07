/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import BD.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FormacaoAcademica;

/**
 *
 * @author Administrador
 */
public class AcoesFormacaoAcademica {

    Conexao conecta = new Conexao();
    Connection con = conecta.Conexao();
    PreparedStatement ps;

    public void InsereFormacao(ArrayList<FormacaoAcademica> lista) {
        int contador = lista.size();
        for (int i = 0; i < contador; i++) {
            try {
                ps = con.prepareStatement("INSERT INTO formacaoacademica(CodigoCurriculo,Escolaridade,areaFormacao,InstituicaoEnsino,Curso) VALUES(?,?,?,?,?)");

                ps.setInt(1, lista.get(i).getCodigoCurriculo());
                ps.setString(2, lista.get(i).getEscolaridade());
                ps.setString(3, lista.get(i).getAreaFormacao());
                ps.setString(4, lista.get(i).getInstituicaoEnsino());
                ps.setString(5, lista.get(i).getCurso());

                ps.executeUpdate();
            } catch (SQLException sqle) {
                System.out.println("Erro na Classe AcoesFormacaoAcademica.." + sqle.getMessage());
            }
        }
    }

}
