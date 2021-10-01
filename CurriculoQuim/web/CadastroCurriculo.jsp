<%-- 
    Document   : CadastroCurriculo
    Created on : 30/09/2021, 09:39:26
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


        <title>~Currículo~</title>
    </head>
    <body>
        <div class="container">

            <!--            <div class="jumbotron ">
                            <div class="container">
                                <p class="display-4 text-center">Cadastro de currículo</p>
                                <hr class="my-4">
                                <p class="lead text-center">Formulário de cadastro de currículo.</p>
                            </div>
                        </div>-->

            <form action="CadastraCurriculo">

                <div class="form-row">
                    <div class="form-group col-md-4">
                        <input type="text" class="form-control" id="id" name="id">
                    </div>
                    <div class="form-group col-md-4">
                        <input type="date" class="form-control" id="dtaCadastro" name="dtaCadastro">
                    </div>
                    <div class="form-group col-md-4">
                        <input type="text" class="form-control" id="codCurriculo" name="codCurriculo">
                    </div>
                </div>
                <fieldset class="form-group border p-3">
                    <legend class="w-auto px-2">Dados pessoais</legend>
                    <div class="form-row">
                        <div class="form-group col-md-4">
                            <!--<label for="nome">Nome</label>-->
                            <input type="text" class="form-control" id="nome" name="nome" placeholder="Nome">
                        </div>
                        <div class="form-group col-md-2">
                            <!--<label for="endereco">C.P.F.</label>-->
                            <input type="text" class="form-control" id="CPF" name="CPF" placeholder="C.P.F.">
                        </div>
                        <div class="form-group col-md-2">
                            <!--<label for="dtaNascimento">Data do Nascimento</label>-->
                            <input type="date" class="form-control" id="dtaNascimento" name="dtaNascimento">
                        </div>
                        <!--<fieldset class="form-group border px-2">-->
                        <div class="form-col">
                            <div class="form-check col-md-2">
                                <!--<label>Sexo</label>-->
                                <input class="form-check-input" type="radio" name="sexo" id="masculino" value="Masculino">
                                <label class="form-check-label" for="masculino">
                                    Masculino
                                </label>
                                <input class="form-check-input" type="radio" name="sexo" id="feminino" value="Feminino">
                                <label class="form-check-label" for="feminino">
                                    Feminino
                                </label>
                            </div>
                        </div>
                        <!--</fieldset>-->
                        <div class="form-group col-md-2">
                            <!--<label for="EstadoCivil">Estado civil</label>-->
                            <select id="EstadoCivil" name="EstadoCivil" class="form-control">
                                <option selected>Estado Civil..</option>
                                <option>Solteiro</option>
                                <option>Casado</option>
                                <option>Separado</option>
                                <option>Divorciado</option>
                                <option>Viúvo</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-row">

                        <div class="form-group col-md-4">
                            <!--<label for="endereco">Endereço</label>-->
                            <input type="text" class="form-control" id="endereco" name="endereco" placeholder="Rua , nº 0">
                        </div>
                        <div class="form-group col-md-2">
                            <!--<label for="bairro">Bairro</label>-->
                            <input type="text" class="form-control" id="bairro" name="bairro" placeholder="Bairro">
                        </div>
                        <div class="form-group col-md-2">
                            <!--<label for="cidade">Cidade</label>-->
                            <input type="text" class="form-control" id="cidade" name="cidade" placeholder="Cidade">
                        </div>
                        <div class="form-group col-md-1">
                            <!--<label for="UF">Estado civil</label>-->
                            <select id="UF" name="UF" class="form-control">
                                <option selected>UF</option>
                                <option>AC</option>
                                <option>AL</option>
                                <option>AP</option>
                                <option>AM</option>
                                <option>BA</option>
                                <option>CE</option>
                                <option>ES</option>
                                <option>GO</option>
                                <option>MA</option>
                                <option>MT</option>
                                <option>MS</option>
                                <option>MG</option>
                                <option>PA</option>
                                <option>PB</option>
                                <option>PR</option>
                                <option>PE</option>
                                <option>PI</option>
                                <option>RJ</option>
                                <option>RN</option>
                                <option>RS</option>
                                <option>RO</option>
                                <option>RR</option>
                                <option>RJ</option>
                                <option>SC</option>
                                <option>SP</option>
                                <option>SE</option>
                                <option>TO</option>
                                <option>DF</option>
                            </select>
                        </div>

                        <div class="form-group col-md-3">
                            <!--<label for="CEP">CEP</label>-->
                            <input type="text" class="form-control" id="CEP" name="CEP" placeholder="CEP">
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <!--<label for="complemento">Complemento</label>-->
                            <input type="text" class="form-control" id="complemento" name="complemento" placeholder="Complemento">
                        </div>
                    </div>
                    <!--TELEFONES-->
                    <div class="form-row">
                        <div class="form-group col-md-2">
                            <!--<label for="telResidencial">Telefone Residencial</label>-->
                            <input type="text" class="form-control" id="telResidencial" name="telResidencial" placeholder="Telefone residencial">
                        </div>
                        <div class="form-group col-md-2">
                            <!--<label for="telCelular">Telefone Celular</label>-->
                            <input type="text" class="form-control" id="telCelular" name="telCelular" placeholder="Telefone celular">
                        </div>
                        <div class="form-group col-md-2">
                            <!--<label for="telRecado">Telefone Recado</label>-->
                            <div class="input-group-prepend">
                                <span class="input-group-text">♫</span>
                                <input type="text" class="form-control" id="telRecado" name="telRecado" placeholder="Telefone recados">
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <!--<label for="email">e-mail</label>-->
                            <div class="input-group-prepend">
                                <span class="input-group-text">@</span>
                                <input type="text" class="form-control" id="email" name="email" placeholder="e-mail">
                            </div>

                        </div>
                    </div>
                </fieldset>

                <nav>
                    <div class="nav nav-tabs" id="nav-tab" role="tablist">
                        <a class="nav-item nav-link active navbar-dark" style="background-color: #E0F2F1;" id="nav-formacadem-tab" data-toggle="tab" href="#nav-formacadem" role="tab" aria-controls="nav-formacadem" aria-selected="true">Formação Acadêmica</a>
                        <a class="nav-item nav-link navbar-dark " style="background-color: #E0F2F1;" id="nav-exprofis-tab" data-toggle="tab" href="#nav-exprofis" role="tab" aria-controls="nav-exprofis" aria-selected="false">Experiência Profissional</a>
                        <a class="nav-item nav-link navbar-dark " style="background-color: #E0F2F1;" id="nav-deficiencia-tab" data-toggle="tab" href="#nav-deficiencia" role="tab" aria-controls="nav-deficiencia" aria-selected="false">Deficiência</a>

                    </div>
                </nav>

                <!--                    
                        ABAS
                -->

                <div class="tab-content" id="nav-tabContent">

                    <!--                    
                        ABA FORMAÇÃO ACADÊMICA
                    -->
                    <div class="tab-pane fade show active border border" id="nav-formacadem" role="tabpanel" aria-labelledby="nav-formacadem-tab">
                        
                        <div class="embed-responsive embed-responsive-16by9">
                            <iframe class="embed-responsive-item" src="FormacaoAcademica.jsp" ></iframe>
                        </div>

                        <!--                        
    
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
                         Botão para acionar modal 
                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalFormacaoAcademica">
                            Adicionar
                        </button>

                         Modal 
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
                        <br>-->

                    </div>

                    <!--                    
                        ABA EXPERÊNCIA PROFISSIONAL
                    -->
                    <div class="tab-pane fade border" id="nav-exprofis" role="tabpanel" aria-labelledby="nav-exprofis-tab">

                        <div class="container-fluid mr-sm-2"> 
                        <div class="embed-responsive embed-responsive-16by9">
                            <iframe class="embed-responsive-item" src="ExperienciaProfissional.jsp" ></iframe>
                        </div>
                        </div>
                        <!--
                        <table class="table table-hover " id="tabelaExperienciaProfissional">
                            <thead class="thead-light">
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
                         Botão para acionar modal 
                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalExperiênciaProfissional">
                            Adicionar
                        </button>

                         Modal 
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
                        <br>-->

                    </div>

                    <!--                    
                        ABA DEFICIÊNCIA
                    -->

                    <div class="tab-pane fade border border" id="nav-deficiencia" role="tabpanel" aria-labelledby="nav-deficiencia-tab">

                        <div class="container">
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="Sim" id="deficiente" name="deficiente">
                                <label class="form-check-label" for="deficiente">
                                    Apresenta algum tipo de deficiência?
                                </label>
                            </div>
                            <br>
                            <div class="row">
                                <select id="tipoDeficiencia" name="tipoDeficiencia" class="form-control col-md-3">
                                    <option selected>Tipo..</option>
                                    <option>Deficiência visual</option>
                                    <option>Deficiência motora</option>
                                    <option>Deficiência mental</option>
                                    <option>Deficiência auditiva</option>
                                    <option>Paralisia cerebral</option>

                                </select>
                                <div class="form-group col-md-8">
                                    <!--<label for="textDeficiencia">Descrição/Observação da deficiência</label>-->
                                    <textarea class="form-control" id="textDeficiencia" name="textDeficiencia" rows="3" placeholder="Descrição/Observação da deficiência"></textarea>
                                </div>
                            </div>
                            <br>
                            <br>

                        </div>
                    </div>

                </div>
                <br>
                <fieldset class="form-group border p-3"> 

                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="disponivelViagem" name="disponivelViagem">
                        <label class="form-check-label" for="disponivelViagem">
                            DISPONÍVEL PARA VIAGENS
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="disponivelMudanca" name="disponivelMudanca">
                        <label class="form-check-label" for="disponivelMudanca">
                            DISPONIBILIDADE PARA MUDANÇA DE ENDEREÇO/CIDADE
                        </label>
                    </div>
                </fieldset>

                <fieldset class="form-group border p-3"> 
                    <legend class="w-auto px-2">Observações gerais</legend>

                    <div class="form-group">
                        <!--<label for="textDeficiencia">Descrição/Observação da deficiência</label>-->
                        <textarea class="form-control" id="textObs" name="textObs" rows="3" placeholder="Descrição/Observação relevantes"></textarea>
                    </div>

                </fieldset>

                <button type="submit" class="btn btn-primary">Salvar</button>

                <footer class="footer navbar-fixed-bottom">
                    <p >&copy; Tudo o que quiser colocar aqui</p>
                </footer>
            </form>
        </div>

        <script src="bootstrap-4.1.3/js/jquery-3.3.1.slim.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/popper.min.js" type="text/javascript"></script>
        <script src="bootstrap-4.1.3/js/bootstrap.min.js" type="text/javascript"></script>

    </body>
</html>
