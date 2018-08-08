/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import EJBeans.AdminBeanLocal;
import Entities.Admin;
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
@WebServlet(name = "Adminservlet", urlPatterns = {"/Adminservlet"})
public class Adminservlet extends HttpServlet {
    @EJB
    private AdminBeanLocal adminBean;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String adminIdstr = request.getParameter("adminId");
        int adminId=0;
        if(adminIdstr!=null && !adminIdstr.equals(""))
            adminId=Integer.parseInt(adminIdstr);
        String username = request.getParameter("urename");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        Admin admin = new Admin(adminId, username, email, password);
        
       if("Add".equalsIgnoreCase(action)){
            adminBean.addAdmin(admin);
        }else if("Edit".equalsIgnoreCase(action)){
            adminBean.editAdmin(admin);
        }else if("delete".equalsIgnoreCase(action)){
            adminBean.deleteAdmin(adminId);
        }else if("search".equalsIgnoreCase(action)){
            admin = adminBean.getAdmin(adminId);
        }
       request.setAttribute("admin", admin);
       request.setAttribute("alladmin", adminBean.getAllAdmin());
       request.getRequestDispatcher("adminregister.jsp").forward(request, response);
       

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.sendRedirect("adminregister.jsp");
        
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
                PrintWriter out = response.getWriter();
                out.printl("doPost-version:");
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
}
