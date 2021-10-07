/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DadosPessoais;
import model.FormacaoAcademica;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "CadastraCurriculo", urlPatterns = {"/CadastraCurriculo"})
public class CadastraCurriculo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            FormacaoAcademica formacaoAcademica = new FormacaoAcademica();
            ArrayList<FormacaoAcademica> listaFormacao = new ArrayList<FormacaoAcademica>();
            listaFormacao = formacaoAcademica.getFormacao();
            /*
            INFORMAÇÕES DOS DADOS PESSOAS
             */
            DadosPessoais dadosPessoais = new DadosPessoais();

            dadosPessoais.setDataCadastro(request.getParameter("dtaCadastro"));
            dadosPessoais.setCodigo(Integer.parseInt(request.getParameter("codCurriculo")));
            dadosPessoais.setNome(request.getParameter("nome"));
            dadosPessoais.setDataNascimento(request.getParameter("dtaNascimento"));
            dadosPessoais.setEstadoCivil(request.getParameter("EstadoCivil"));
            dadosPessoais.setSexo(request.getParameter("sexo"));
            dadosPessoais.setCPF(request.getParameter("CPF"));
            dadosPessoais.setEndereco(request.getParameter("endereco"));
            dadosPessoais.setBairro(request.getParameter("bairro"));
            dadosPessoais.setCidade(request.getParameter("cidade"));
            dadosPessoais.setUF(request.getParameter("UF"));
            dadosPessoais.setCEP(request.getParameter("CEP"));
            dadosPessoais.setComplemento(request.getParameter("complemento"));
            dadosPessoais.setTelResidencial(request.getParameter("telResidencial"));
            dadosPessoais.setTelCelular(request.getParameter("telCelular"));
            dadosPessoais.setTelRecado(request.getParameter("telRecado"));
            dadosPessoais.setEmail(request.getParameter("email"));
            dadosPessoais.setDisponivelViagem(Boolean.getBoolean(request.getParameter("disponivelViagem")));
            dadosPessoais.setDisponivelMudanca(Boolean.getBoolean(request.getParameter("disponivelMudanca")));
            dadosPessoais.setDeficiente(Boolean.getBoolean(request.getParameter("deficiente")));
            dadosPessoais.setTipoDeficiência(request.getParameter("tipoDeficiencia"));
            dadosPessoais.setDescricaoDeficiencia(request.getParameter("textDeficiencia"));
            dadosPessoais.setOutrasInformacoes(request.getParameter("textObs"));

            AcoesDadosPessoais acoesdadospessoais = new AcoesDadosPessoais();
            acoesdadospessoais.InsereDados(dadosPessoais);

            /*
                INFORMAÇÕES ACADÊMICAS
             */
            
            if (listaFormacao.size()>0) {
                int contador = listaFormacao.size();
                for (int i = 0; i < contador; i++) {
                    out.println(listaFormacao.get(i).getCodigoCurriculo());
                    out.println(listaFormacao.get(i).getEscolaridade());
                    out.println(listaFormacao.get(i).getAreaFormacao());
                    out.println(listaFormacao.get(i).getInstituicaoEnsino());
                    out.println(listaFormacao.get(i).getCurso());
                }
            } else {
                out.println("zeradooooo");
            }
//            AcoesFormacaoAcademica acoesformacaoacademica = new AcoesFormacaoAcademica();
//            acoesformacaoacademica.InsereFormacao(tico);

//            FormacaoAcademica formacaoAcademica = new FormacaoAcademica();
//
//            formacaoAcademica.setCodigoCurriculo(Integer.parseInt(request.getParameter("")));
//            formacaoAcademica.setEscolaridade((request.getParameter("")));
//            formacaoAcademica.setAreaFormacao((request.getParameter("")));
//            formacaoAcademica.setInstituicaoEnsino((request.getParameter("")));
//            formacaoAcademica.setCurso((request.getParameter("")));
//
//            /*
//                INFORMAÇÕES PROFISSIONAIS
//             */
//            ExperienciaProfissional experienciaProfissional = new ExperienciaProfissional();
//
//            experienciaProfissional.setCodigoCurriculo(Integer.parseInt(request.getParameter("")));
//            experienciaProfissional.setNomeEmpresa((request.getParameter("")));
//            experienciaProfissional.setRamo((request.getParameter("")));
//            experienciaProfissional.setCargo((request.getParameter("")));
//            experienciaProfissional.setDataAdmissao((request.getParameter("")));
//            experienciaProfissional.setDataDemissao((request.getParameter("")));
//            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastraCurriculo</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<div>");
            out.println("</div>");

            out.println(dadosPessoais.getNome());
            out.println(dadosPessoais.getCPF());
            out.println(dadosPessoais.getCidade());
            

            out.println("<h1>Servlet CadastraCurriculo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
