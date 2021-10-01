/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import BD.Conexao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.FormacaoAcademica;
import model.Teste;
import model.Teste2;

/**
 *
 * @author MarcosMG
 */
@WebServlet(name = "cadTeste2", urlPatterns = {"/cadTeste2"})
public class cadTeste2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    List<FormacaoAcademica> listaFormacao = new ArrayList<FormacaoAcademica>();

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

//            Conexao conecta = new Conexao();
//            conecta.cadTeste2(cada2);

out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cadTeste2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cadTeste2 at " + request.getContextPath() + "</h1>");

            int contador = listaFormacao.size();
            for (int i = 0; i < contador; i++) {
                out.println(listaFormacao.get(i).getCodigoCurriculo());
                out.println(listaFormacao.get(i).getEscolaridade());
                out.println(listaFormacao.get(i).getAreaFormacao());
                out.println(listaFormacao.get(i).getInstituicaoEnsino());
                out.println(listaFormacao.get(i).getCurso());
            }
            
            request.setAttribute("listagem", listaFormacao);
            response.sendRedirect("FormacaoAcademica.jsp");

//            ArrayList<String> agenda = new ArrayList();
//
//            // [ B ] usando o método add() para gravar 4 contatos na agenda
//            agenda.add("Juca Bala;11 1111-1111");
//            agenda.add("Marcos Paqueta;22 2222-2222");
//            agenda.add("Maria Antonieta;33 3333-3333");
//            agenda.add("Antônio Conselheiro;44 4444-4444");
//
//            int i;
//
//            // [ C ] mostrando os "n" contatos da agenda (usando o índice)
//            // número de elementos da agenda: método size()
//            out.println("Percorrendo o ArrayList (usando o índice)\n");
//            int n = agenda.size();
//            for (i = 0; i < n; i++) {
//                out.println("Posição %d- %s\n" + i + "" + agenda.get(i));
//            }
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
