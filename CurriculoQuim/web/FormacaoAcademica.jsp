<%-- 
    Document   : FormacaoAcademica
    Created on : 30/09/2021, 11:20:57
    Author     : Administrador
--%>

<%@page import="controller.AcoesFormacaoAcademica"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.FormacaoAcademica"%>

<%@page import="controller.cadTeste2" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

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

        <%
            ArrayList<FormacaoAcademica> listaFor = (ArrayList<FormacaoAcademica>) request.getAttribute("listagemFormacao");
            FormacaoAcademica formacaoAcademica = new FormacaoAcademica();

//            formacaoAcademica.setFormacao((ArrayList<FormacaoAcademica>) request.getAttribute("listagemFormacao"));
            AcoesFormacaoAcademica acoesFormacao = new AcoesFormacaoAcademica();
        %>


        <!--        <title>JSP Page</title>-->
    </head>
    <body>
        <h2>Formação Acadêmica</h2>

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
                    <form name="formFormacao">
                        <div class="modal-body">
                            <div class="col col-md-2">
                                <!--READONLY PARA QUE NÃO SEJA ALTERADO-->
                                <input type="text" class="form-control" id="codigoCurriculo" name="codigoCurriculo" >
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

                            <!--USAR FORMACTION PARA CHAMAR A AÇÃO PORQUE SE USAR O ACTION DO FORMULÁRIO ELE SE PERDE QUAL BOTÃO CHAMAR...-->
                            <button type="submit" class="btn btn-primary" formaction="ListaFormacao" >Adiciona</button>
                        </div>

                    </form>

                </div>
            </div>
        </div>
        <br>
        <br>

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
                    if (listaFor != null) {
                        int contador = listaFor.size();
                        for (int i = 0; i < contador; i++) {%>
                <tr>
                    <td><%=listaFor.get(i).getCodigoCurriculo()%></td>
                    <td><%=listaFor.get(i).getEscolaridade()%></td>
                    <td><%=listaFor.get(i).getAreaFormacao()%></td>
                    <td><%=listaFor.get(i).getInstituicaoEnsino()%></td>
                    <td><%=listaFor.get(i).getCurso()%></td>
                </tr>
                <%}
                    } else {
                        out.println("Nenhum registro");
                    }
                %>
            </tbody>
        </table>
        <%
            if (listaFor != null) {
                out.println(listaFor.size());
                request.setAttribute("lista", listaFor);
                RequestDispatcher rd = request.getRequestDispatcher("cadTeste2?acao=nao");
                rd.include(request, response);
//               VER AS DIFERENÇAS DEPOIS rd.forward(request, response);
// REFERÊNCIA .: https://www.guj.com.br/t/como-passar-um-objeto-de-jsp-para-servlet/133802/10

            } else {
                out.println("Zerando ainda");
            }

//          ASSIM NÃO FUNCIONA****response.sendRedirect("FormacaoAcademica.jsp");
%>
        <!--        <form>
                    <button type="submit" formaction="cadTeste2">Teste</button>
                </form>-->

        <script src="bootstrap-4.1.3/js/jquery-3.3.1.slim.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/popper.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/bootstrap.min.js" type="text/javascript"></script>

    </body>
</html>
