/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import modelo.Profesor;
import modelo.dao.ProfesorDaoImpl;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Trini
 */
@WebServlet(name = "SvAltas", urlPatterns = {"/SvAltas"})
public class SvAltas extends HttpServlet {

    ProfesorDaoImpl profesorDaoImpl = new ProfesorDaoImpl();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvAltas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvAltas at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Profesor> profesores = new ArrayList();
        profesores = profesorDaoImpl.listar();
        
        HttpSession session = request.getSession();
        session.setAttribute("profesores", profesores);
        
        response.sendRedirect("mostrarProfesores.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String legajo = request.getParameter("legajo");
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String telefono = request.getParameter("telefono");
        
        Profesor profesor = new Profesor();
        
        profesor.setLegajo(legajo);
        profesor.setNombres(nombres);
        profesor.setApellidos(apellidos);
        profesor.setTelefono(telefono);
        profesorDaoImpl.crear(profesor);
        
        response.sendRedirect("Mensaje.jsp");
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
