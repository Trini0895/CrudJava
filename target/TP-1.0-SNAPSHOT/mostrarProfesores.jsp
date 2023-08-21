<%-- 
    Document   : mostrarProfesores
    Created on : 21 ago 2023, 2:01:11
    Author     : Trini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Profesor"%>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado Profesores</title>
    </head>
    <body>
        <h1>Listado de Profesores</h1> 
        
        <%
            List<Profesor> profesores = (List) request.getSession().getAttribute("profesores");
            int cont = 0;
            for (Profesor p : profesores){
                cont++;
            }
        %>
            
        <p>Cantidad de registros: <%=cont%> </p>
        
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Legajo</th>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>Telefono</th>
                </tr>
            </thead>
            
            <% for (Profesor p : profesores){ %>
            
            <tbody>
                 <tr>
                    <td><%=p.getId_profesor()%></td>
                    <td><%=p.getLegajo()%></td>
                    <td><%=p.getNombres()%></td>
                    <td><%=p.getApellidos()%></td>
                    <td><%=p.getTelefono()%></td>
                </tr>
            </tbody>
            
            <%}%>
        </table>
        
        
    </body>
</html>
