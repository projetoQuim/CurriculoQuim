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
import java.sql.SQLException;

public class Conexao {

    public Connection Conexao() {

        Connection conexao = null;

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
        return conexao;
    }

}
