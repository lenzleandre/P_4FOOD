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
import model.Client;

/**
 *
 * @author PC
 */
@WebServlet(name = "loginservlet", urlPatterns = {"/loginservlet"})
public class loginservlet extends HttpServlet {

     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
         PrintWriter out = response.getWriter();
         out.printf("login-name" + request.getParameter("loginname") + "password" + request.getParameter("password"));
        
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
        
        Client client = new Client();
        
         request.setAttribute("userName",request.getParameter("loginname"));
         request.setAttribute("password",request.getParameter("Password"));
         
         if(client.isValidUserCredentials(request.getParameter("loginname"), request.getParameter("password"))){
         request.getRequestDispatcher("/welcome.jsp").forward(request, response);
         }else
         {
           request.setAttribute("errorMessage","Invalid login or password! check and try again");
           request.getRequestDispatcher("/index.jsp").forward(request, response);
         }
        
        
        
    }
}
