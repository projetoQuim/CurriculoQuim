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
import model.ExperienciaProfissional;
import model.FormacaoAcademica;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "ListaExperiencia", urlPatterns = {"/ListaExperiencia"})
public class ListaExperiencia extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        List<ExperienciaProfissional> listaExperiencia = new ArrayList<ExperienciaProfissional>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            ExperienciaProfissional experiencia = new ExperienciaProfissional();
            QG expPro = new QG();
            
            experiencia.setCodigoCurriculo(Integer.parseInt(request.getParameter("codigoCurriculo")));
            experiencia.setNomeEmpresa(request.getParameter("empresaExperiencia"));
            experiencia.setRamo(request.getParameter("ramoExperiencia"));
            experiencia.setCargo(request.getParameter("cargoExperiencia"));
            experiencia.setDataAdmissao(request.getParameter("dataAdmissao"));
            experiencia.setDataDemissao(request.getParameter("dataDemissao"));
            
            
            
            listaExperiencia.add(experiencia);
//            
//            int contador = listaExperiencia.size();
//            
//            for (int i=0;i<contador;i++){
//                out.println(listaExperiencia.get(i).getCodigoCurriculo());
//                out.println(listaExperiencia.get(i).getNomeEmpresa());
//                out.println(listaExperiencia.get(i).getRamo());
//                out.println(listaExperiencia.get(i).getCargo());
//                out.println(listaExperiencia.get(i).getDataAdmissao());
//                out.println(listaExperiencia.get(i).getDataDemissao());
//            }
//     
            expPro.Experiencia((ArrayList<ExperienciaProfissional>) listaExperiencia);

            request.setAttribute("listagemExperiencia", listaExperiencia);
//          DÁ ERRADO  response.sendRedirect("FormacaoAcademica.jsp");
            RequestDispatcher rd = request.getRequestDispatcher("ExperienciaProfissional.jsp");
            rd.forward(request, response);
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
