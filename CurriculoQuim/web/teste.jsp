<%-- 
    Document   : teste
    Created on : 24/09/2021, 21:40:01
    Author     : MarcosMG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="cadTeste">
            <input type="text" id="idColaborador"  name="idColaborador" placeholder="ID">
            <input type="text" id="nomeColaborador"  name="nomeColaborador" placeholder="Nome">
            <br>
            <input type="text" id="cargoColaborador"  name="cargoColaborador" placeholder="Cargo">
            <input type="text" id="situacaoColaborador"  name="situacaoColaborador" placeholder="Situação">
            <br>
            <br>
            <br>
            <br>
            <iframe src="teste2.jsp" height="200" width="400" title="Iframe Example">

            </iframe>

            <button type="submit">Salvar</button>

        </form>
    </body>
</html>
