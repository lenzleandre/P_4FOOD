/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Entities.Calculation;
import java.io.IOException;
import javax.ejb.EJB;
import javax.json.Json;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import EJBeans.CRUDOperationBean;
import EJBeans.CalculatorBean;

/**
 *
 * @author mcamelo
 */
public class CalculatorServlet extends HttpServlet {

    @EJB
    private CalculatorBean calculatorBean;
    @EJB
    private CRUDOperationBean crudRB;
    private Calculation calculation;
    

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
        
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operator = request.getParameter("r1");
        String save = request.getParameter("s1");
        
        calculatorBean = new CalculatorBean(num1, num2, operator);
        calculation = calculatorBean.doCalculation();
                
        String stored = "not";
        if ("Yes".equals(save)){
            crudRB.savetoDataBase(calculation);
            System.out.println("Result saved in the DB");
            stored = "";
        }

        //Creating json with answer.
        String jsonObject = Json.createObjectBuilder()
            .add("num1", num1)
            .add("num2", num2)
            .add("operation", calculation.getOperator())
            .add("result", calculation.getResult())
            .add("stored", stored)
            .build()
            .toString();
        
//        response.setContentType("application/json");
//        // Get the printwriter object from response to write the required json object to the output stream      
//        PrintWriter out = response.getWriter();
//        // Assuming your json object is **jsonObject**, perform the following, it will return your json object  
//        out.print(jsonObject);
//        out.flush();
//        out.close();
          response.getWriter().print(jsonObject);

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
