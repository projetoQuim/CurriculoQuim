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
import model.DadosPessoais;

/**
 *
 * @author Administrador
 */
public class AcoesDadosPessoais {

    Conexao conecta = new Conexao();
    Connection con = conecta.Conexao();
    PreparedStatement ps;

    public void InsereDados(DadosPessoais dadosPessoais) {
        try {

            ps = con.prepareStatement("INSERT INTO dadospessoais(DataCadastro,Codigo, Nome, DataNascimento, EstadoCivil, Sexo, CPF, Endereco, Bairro, Cidade, UF,CEP,Complemento,telResidencial, telCelular,telRecado,email,DisponivelViagem,DisponivelMudanca,Deficiente, TipoDeficiencia,DescricaoDeficiencia,OutrasInformacoes) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, dadosPessoais.getDataCadastro());
            ps.setString(2, Integer.toString(dadosPessoais.getCodigo()));
            ps.setString(3, dadosPessoais.getNome());
            ps.setString(4, dadosPessoais.getDataNascimento());
            ps.setString(5, dadosPessoais.getEstadoCivil());
            ps.setString(6, dadosPessoais.getSexo());
            ps.setString(7, dadosPessoais.getCPF());
            ps.setString(8, dadosPessoais.getEndereco());
            ps.setString(9, dadosPessoais.getBairro());
            ps.setString(10, dadosPessoais.getCidade());
            ps.setString(11, dadosPessoais.getUF());
            ps.setString(12, dadosPessoais.getCEP());
            ps.setString(13, dadosPessoais.getComplemento());
            ps.setString(14, dadosPessoais.getTelResidencial());
            ps.setString(15, dadosPessoais.getTelCelular());
            ps.setString(16, dadosPessoais.getTelRecado());
            ps.setString(17, dadosPessoais.getEmail());
            ps.setBoolean(18, dadosPessoais.isDisponivelViagem());
            ps.setBoolean(19, dadosPessoais.isDisponivelMudanca());
            ps.setBoolean(20, dadosPessoais.isDeficiente());

            ps.setString(21, dadosPessoais.getTipoDeficiencia());
            ps.setString(22, dadosPessoais.getDescricaoDeficiencia());
            ps.setString(23, dadosPessoais.getOutrasInformacoes());

            ps.executeUpdate();
            
        } catch (SQLException sqle) {
            System.out.println("Erro na Classe AcoesDadosPessoais.."+sqle.getMessage());
        }

    }
}
