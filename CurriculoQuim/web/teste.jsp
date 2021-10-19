<%-- 
    Document   : teste
    Created on : 24/09/2021, 21:40:01
    Author     : MarcosMG
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.FormacaoAcademica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            FormacaoAcademica formAcad = new FormacaoAcademica();
            ArrayList<FormacaoAcademica> resultado = new ArrayList<FormacaoAcademica>();
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            resultado = (ArrayList<FormacaoAcademica>) request.getAttribute("lista");
            out.println("Olá - - >"+resultado.size());

            //resultado = formAcad.getFormacao();
            if (resultado != null) {
                if (resultado.size() == 0) {
                    out.println("Zeraddooo...");
                }
                int contador = resultado.size();
                for (int i = 0; i < contador; i++) {
                    formAcad = resultado.get(i);

                    out.println(formAcad.getCodigoCurriculo());
                    out.println(formAcad.getEscolaridade());
                    out.println(formAcad.getAreaFormacao());
                    out.println(formAcad.getInstituicaoEnsino());
                    out.println(formAcad.getCurso());
                }
            } else {
                out.println("Nulo ainda...");
            }
             //}
        %>

    </body>
</html>
