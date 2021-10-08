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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.FormacaoAcademica;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "ListaFormacao", urlPatterns = {"/ListaFormacao"})
public class ListaFormacao extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ArrayList<FormacaoAcademica> listaFormacao = new ArrayList<FormacaoAcademica>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            FormacaoAcademica formacao = new FormacaoAcademica();

            formacao.setCodigoCurriculo(Integer.parseInt(request.getParameter("codigoCurriculo")));
            formacao.setEscolaridade(request.getParameter("escolaridade"));
            formacao.setAreaFormacao(request.getParameter("areaFormacao"));
            formacao.setInstituicaoEnsino(request.getParameter("instituicaoEnsino"));
            formacao.setCurso(request.getParameter("curso"));

            listaFormacao.add(formacao);
//
//            
//            formacao.setFormacao((ArrayList<FormacaoAcademica>) listaFormacao);
//            
//            int contador = formacao.getFormacao().size();
//            for (int i = 0; i < contador; i++) {
//                out.println(listaFormacao.get(i).getCodigoCurriculo());
//                out.println(listaFormacao.get(i).getEscolaridade());
//                out.println(listaFormacao.get(i).getAreaFormacao());
//                out.println(listaFormacao.get(i).getInstituicaoEnsino());
//                out.println(listaFormacao.get(i).getCurso());
//            }
//            
            request.setAttribute("listagemFormacao", listaFormacao);
            RequestDispatcher rd = request.getRequestDispatcher("FormacaoAcademica.jsp");
            rd.forward(request, response);
            // ASSIM NÃO FUNCIONA****response.sendRedirect("FormacaoAcademica.jsp");

//            AcoesFormacaoAcademica acFor = new AcoesFormacaoAcademica();
//            
//            acFor.InsereFormacao(formaAcad.formacaoacad);
//            out.println("foiiii..");
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
