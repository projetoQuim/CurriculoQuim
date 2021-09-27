<%-- 
    Document   : teste
    Created on : 24/09/2021, 21:40:01
    Author     : MarcosMG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.sql.ResultSet"%>
<%@page import="BD.Conexao"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>_-_-_-_-_-_-_-_-</h1>
        <form action="cadTeste2">
            <input type="text" id="numero2"  name="numero2" placeholder="ID">
            <input type="text" id="nome2"  name="nome2" placeholder="Nome">
            <br>
            <input type="text" id="cor2"  name="cor2" placeholder="Cargo">
            <br>
            

            <table  id="tabelaFormacaoAcademica" border="1">
                <thead>
                    <tr>
                        <th scope="col">Número</th>
                        <th scope="col">Nome</th>
                        <th scope="col">Cor</th>
                        <th scope="col">Deleta</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                     Conexao conec = new Conexao();
                     ResultSet resu = conec.lista2();
                    while(resu.next()){%>
                        <tr>
                        <td><%=resu.getInt("numero")%></td>
                        <td><%=resu.getString("coisa")%></td>
                        <td><%=resu.getString("cor")%></td>
                        <td><a href="deleta?num=<%=resu.getInt("numero")%>">Deleta</a></td>
                        </tr>
                    <%}%>
                </tbody>
            </table>
            
<!--
            <button type="button" onclick="adicionaLinhaFormacao('tabelaFormacaoAcademica')" >Adiciona</button>
            <button type="button" onclick="lerTabelaExperienciaProfissional('tabelaFormacaoAcademica')" >Lista</button>-->
            
            <button type="submit">Salvar</button>

        </form>
    </body>
</html>
