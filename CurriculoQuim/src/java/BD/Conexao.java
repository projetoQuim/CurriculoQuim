/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

/**
 *
 * @author Administrador
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Teste;
import model.Teste2;

public class Conexao {

    public Connection conexao;
    public PreparedStatement ps;
    public ResultSet rs;
    public Teste cad;

    public Conexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Classe Conexao - Erro Class not found ->" + cnfe.getMessage());
        }
        try {
            //Conexão com banco de dados remoto. freesqldatabase.com
            conexao = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com/sql10437122", "sql10437122", "eXZTxJSlZB");
        } catch (SQLException sqle) {
            System.out.println("Classe Conexao - Erro ->" + sqle.getMessage());
        }
    }

    public void cadTeste(Teste teste) {
        try {

            ps = conexao.prepareStatement("INSERT INTO Colaborador(idColaborador,nome,cargo,situacao) VALUES(?,?,?,?)");

            ps.setString(1, teste.getId());
            ps.setString(2, teste.getNome());
            ps.setString(3, teste.getCargo());
            ps.setString(4, teste.getSituacao());

            ps.executeUpdate();

        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cadTeste2(Teste2 teste) {
        try {

            ps = conexao.prepareStatement("INSERT INTO teste(numero,coisa,cor) VALUES(?,?,?)");

            ps.setString(1, Integer.toString(teste.getNumero()));
            ps.setString(2, teste.getCoisa());
            ps.setString(3, teste.getCor());
            ps.executeUpdate();

            ps.close();

        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet lista2() {
        try {
            ps = conexao.prepareStatement("SELECT * FROM teste");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return rs;
    }

    public void deletaTeste(int id) {
        try {
            ps = conexao.prepareStatement("delete from teste where numero=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            
        } catch (SQLException sqle) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, sqle);

        }
    }

}
