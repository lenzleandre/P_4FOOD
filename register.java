/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import EJBeans.UsersdaoLocal;
import Entities.Users;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
@WebServlet(name = "register", urlPatterns = {"/signup"})
public class register extends HttpServlet {
    @EJB
    private UsersdaoLocal usersdao;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
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
        processRequest(request, response);String action = request.getParameter("action");
        String userIdstr = request.getParameter("userId");
        int userId=0;
        if(userIdstr!=null && !userIdstr.equals(""))
            userId=Integer.parseInt(userIdstr);
        String username = request.getParameter("username");
        String email  = request.getParameter("email");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String password = request.getParameter("password");
        String country = request.getParameter("country");
        String gender = request.getParameter("gender");
        
        Users users = new Users(userId, username, email, firstname, lastname, password, country, gender);
        
        if("Add".equalsIgnoreCase(action)){
            usersdao.addUser(users);
        }else if("Edit".equalsIgnoreCase(action)){
            usersdao.editUser(users);
        }else if("delete".equalsIgnoreCase(action)){
            usersdao.deleteUser(userId);
        }else if("search".equalsIgnoreCase(action)){
            users = usersdao.getUser(userId);
        }
        request.setAttribute("users", users);
        request.setAttribute("allUsers", usersdao.getAllUsers());
        request.getRequestDispatcher("signup.jsp").forward(request, response);
        
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
