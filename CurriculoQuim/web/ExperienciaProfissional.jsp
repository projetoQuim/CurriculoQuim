<%-- 
    Document   : ExperienciaProfissional
    Created on : 30/09/2021, 13:31:38
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

        <table class="table table-hover border-top-0" id="tabelaExperienciaProfissional">
            <thead>
                <tr>
                    <th scope="col">Cód</th>
                    <th scope="col">Nome da Empresa</th>
                    <th scope="col">Ramo</th>
                    <th scope="col">Cargo</th>
                    <th scope="col">Data Admissão</th>
                    <th scope="col">Data Demissão</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                </tr>

            </tbody>
        </table>
        <!-- Botão para acionar modal -->
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalExperiênciaProfissional">
            Adicionar
        </button>

        <!-- Modal -->
        <div class="modal fade" id="modalExperiênciaProfissional" tabindex="-1" role="dialog" aria-labelledby="modalExperiênciaProfissionalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="modalExperiênciaProfissionalLabel">Experiência Profissional</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col col-md-2">
                                <input type="text" class="form-control" id="codigoExperiencia" placeholder="Código">
                            </div>
                            <div class="col col-md-8">
                                <input type="text" class="form-control" id="empresaExperiencia" placeholder="Empresa">
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col col-6">
                                <input type="text" class="form-control" id="ramoExperiencia" placeholder="Ramo da empresa">
                            </div>
                            <div class="col col-6">
                                <input type="text" class="form-control" id="cargoExperiencia" placeholder="Cargo na empresa">
                            </div>
                        </div>
                        <br>

                        <div class="row">
                            <div class="col col-6">
                                <input type="date" class="form-control" id="dataAdmissao" placeholder="Ramo da empresa">
                            </div>
                            <div class="col col-6">
                                <input type="date" class="form-control" id="dataDemissao" placeholder="Cargo na empresa">
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                        <button type="button" onclick="adicionaLinhaExperiencia('tabelaExperienciaProfissional')" class="btn btn-primary">Adiciona</button>
                    </div>
                </div>
            </div>
        </div>

        <button type="button" onclick="lerTabelaExperienciaProfissional('tabelaExperienciaProfissional')" class="btn btn-primary">Lista</button>

        <br>
        <br>


        <script src="bootstrap-4.1.3/js/jquery-3.3.1.slim.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/popper.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/bootstrap.min.js" type="text/javascript"></script>

    </body>
</html>
