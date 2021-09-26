/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
            
             /*
                INFORMAÇÕES ACADÊMICAS
             */
             FormacaoAcademica formacaoAcademica = new FormacaoAcademica();
             
             
             
             
             
             /*
                INFORMAÇÕES PROFISSIONAIS
            */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastraCurriculo</title>");
            out.println("</head>");
            out.println("<body>");

            String codigoForm = request.getParameter("codigoFromacao");
            String escolaForm = request.getParameter("escolaridadeFormacao");
            String areaForm = request.getParameter("areaFormacao");
            String instForm = request.getParameter("instituicaoFormacao");
            String cursoForm = request.getParameter("cursoFormacao");

            out.println("<div>");

            out.println(codigoForm);
            out.println(escolaForm);
            out.println(areaForm);
            out.println(instForm);
            out.println(cursoForm);

            out.println("</div>");

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