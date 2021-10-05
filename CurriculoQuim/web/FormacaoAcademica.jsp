<%-- 
    Document   : FormacaoAcademica
    Created on : 30/09/2021, 11:20:57
    Author     : Administrador
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.FormacaoAcademica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="controller.cadTeste2" %>
<!DOCTYPE html>
<html>
    
    <%ArrayList<FormacaoAcademica> listaFor = (ArrayList<FormacaoAcademica>) request.getAttribute("listagem");%>
    
    <head>
        <!--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">-->

        <!-- Meta tags Obrigatórias -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link href="bootstrap-4.1.3/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="bootstrap-4.1.3/css/bootstrap.css" type="text/css">
        <link href="estilo.css" rel="stylesheet" type="text/css"/>

        <!--        <title>JSP Page</title>-->
    </head>
    <body>

        <table class="table table-hover border-top-0" id="tabelaFormacaoAcademica">
            <thead>
                <tr>
                    <th scope="col">Cód</th>
                    <th scope="col">Escolaridade</th>
                    <th scope="col">Área de formação</th>
                    <th scope="col">Instituição de ensino</th>
                    <th scope="col">Curso</th>
                </tr>
            </thead>
            <tbody>
                <%
//                    ArrayList<FormacaoAcademica> listaFor = (ArrayList<FormacaoAcademica>) request.getAttribute("listagem");
//                    listaFor = (ArrayList) request.getAttribute("listagem");

                    if (listaFor != null) {
                        int contador = listaFor.size();
                        for (int i = 0; i < contador; i++) {%>
                <tr>
                    <td><%listaFor.get(i).getCodigoCurriculo()%></td>
                    <td><%=listaFor.get(i).getEscolaridade()%></td>
                    <td><%=listaFor.get(i).getAreaFormacao()%></td>
                    <td><%=listaFor.get(i).getInstituicaoEnsino()%></td>
                    <td><%=listaFor.get(i).getCurso()%></td>
                    <!--                        
                                            out.println(listaFor.get(i).getCodigoCurriculo());
                                            out.println(listaFor.get(i).getEscolaridade());
                                            out.println(listaFor.get(i).getAreaFormacao());
                                            out.println(listaFor.get(i).getInstituicaoEnsino());
                                            out.println(listaFor.get(i).getCurso());-->
                </tr>    
                <%}
                    } else {
                        out.println("Valor Nulo");
                    }
                %>
            </tbody>
        </table>
        <br>
        <br>

        <script src="bootstrap-4.1.3/js/jquery-3.3.1.slim.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/popper.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/bootstrap.min.js" type="text/javascript"></script>

    </body>
</html>
