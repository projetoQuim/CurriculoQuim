<%-- 
    Document   : FormacaoAcademica
    Created on : 30/09/2021, 11:20:57
    Author     : Administrador
--%>

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

        <!--        <title>JSP Page</title>-->
    </head>
    <body>
        <table class="table table-hover" id="tabelaFormacaoAcademica">
            <thead class="thead-light">
                <tr>
                    <th scope="col">Cód</th>
                    <th scope="col">Escolaridade</th>
                    <th scope="col">Área de formação</th>
                    <th scope="col">Instituição de ensino</th>
                    <th scope="col">Curso</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="hidden" name="codigoFromacao" value="1"> 1</td>
                    <td><input type="hidden" name="escolaridadeFormacao" value="Mark">Mark</td>
                    <td><input type="hidden" name="areaFormacao" value="Otto">Otto</td>
                    <td><input type="hidden" name="instituicaoFormacao" value="@mdo">@mdo</td>
                    <td><input type="hidden" name="cursoFormacao" value="@mdo">@mdo</td>
                </tr>

            </tbody>
        </table>
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
                    <div class="modal-body">
                        <div class="col col-md-2">
                            <input type="text" class="form-control" id="codigoFormacao">
                        </div>
                        <br>
                        <div class="row">
                            <div class="col col-md-4">
                                <select id="escolaridade" class="form-control">
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
                                <input type="text" class="form-control" id="areaFormacao" placeholder="Área de formação">
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col col-6">
                                <input type="text" class="form-control" id="instituicaoEnsino" placeholder="Instituição de ensino">
                            </div>
                            <div class="col col-6">
                                <input type="text" class="form-control" id="curso" placeholder="Curso">
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                        <button type="button" onclick="adicionaLinhaFormacao('tabelaFormacaoAcademica')" class="btn btn-primary">Adiciona</button>
                    </div>
                </div>
            </div>
        </div>

        <button type="button" onclick="lerTabelaFormacaoAcademica('tabelaFormacaoAcademica')" class="btn btn-primary">Lista</button>

        <br>
        <br>
        
        <script src="bootstrap-4.1.3/js/jquery-3.3.1.slim.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/popper.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/bootstrap.min.js" type="text/javascript"></script>

    </body>
</html>
