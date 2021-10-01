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
        <!-- Botão para acionar modal -->
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalFormacaoAcademica">
            Adicionar
        </button>

        <!-- Modal -->
        <div class="modal fade" id="modalFormacaoAcademica" tabindex="-1" role="dialog" aria-labelledby="modalFormacaoAcademicaLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="modalFormacaoAcademicaLabel">Formação Acadêmica</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form action="cadTeste2">
                        <div class="modal-body">
                            <div class="col col-md-2">
                                <input type="text" class="form-control" id="codigoCurriculo" name="codigoCurriculo">
                            </div>
                            <br>
                            <div class="row">
                                <div class="col col-md-4">
                                    <select id="escolaridade" name="escolaridade" class="form-control">
                                        <option selected>Escolaridade..</option>
                                        <option>Analfabeto</option>
                                        <option>Fundamental completo</option>
                                        <option>Fundamental incompleto</option>
                                        <option>Médio completo</option>
                                        <option>Médio incompleto</option>
                                        <option>Superior completo</option>
                                        <option>Superior incompleto</option>
                                        <option>Curso Técnico completo</option>
                                        <option>Curso Técnico incompleto</option>
                                    </select>
                                </div>
                                <div class="col col-md-8">
                                    <input type="text" class="form-control" id="areaFormacao" name="areaFormacao" placeholder="Área de formação">
                                </div>
                            </div>
                            <br>
                            <div class="row">
                                <div class="col col-6">
                                    <input type="text" class="form-control" id="instituicaoEnsino" name="instituicaoEnsino" placeholder="Instituição de ensino">
                                </div>
                                <div class="col col-6">
                                    <input type="text" class="form-control" id="curso" name="curso" placeholder="Curso">
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                            <button type="submit" class="btn btn-primary">Adiciona</button>
                        </div>
                    </form>

                </div>
            </div>
        </div>
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
                    FormacaoAcademica formacao = new FormacaoAcademica();
                    List<FormacaoAcademica> lista = new ArrayList<FormacaoAcademica>();
                    lista = (ArrayList) request.getAttribute("listagem");

                    if (lista.isEmpty()) {
                        out.println("<h1>ESTÁ VAZIO AINDA</h1>");
                    }else{
                        int contador = lista.size();
                        for (int i = 0; i < contador; i++) {
                %>
                <tr>
                    <td><%=lista.get(i).getCodigoCurriculo()%></td>
                    <td><%=lista.get(i).getEscolaridade()%></td>
                    <td><%=lista.get(i).getAreaFormacao()%></td>
                    <td><%=lista.get(i).getInstituicaoEnsino()%></td>
                    <td><%=lista.get(i).getCurso()%></td>
                </tr>
                <%}
                    }%>

            </tbody>
        </table>
        <br>
        <br>

        <script src="bootstrap-4.1.3/js/jquery-3.3.1.slim.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/popper.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/bootstrap.min.js" type="text/javascript"></script>

    </body>
</html>
