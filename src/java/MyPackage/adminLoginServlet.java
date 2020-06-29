/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Danac
 */
@WebServlet(name = "adminLoginServlet", urlPatterns = {"/adminLoginServlet"})
public class adminLoginServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String uName=request.getParameter("email");
            String pass=request.getParameter("pass");
            
            try
            {
               if(uName!=null)
               {
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma","root","");
                  String Query="select * from adminlogin where uName=? and password=?";
                  PreparedStatement psm=conn.prepareStatement(Query);
                  psm.setString(1, uName);
                  psm.setString(2, pass);
                  ResultSet rs=psm.executeQuery();
                  if(rs.next())
                  {
                      //response.sendRedirect("adminHome.jsp");
                      HttpSession session =request.getSession();
                      session.setAttribute("uName", uName);
                      response.sendRedirect("adminHome.jsp?name="+rs.getString("uName"));
                      response.sendRedirect("adminHome.jsp?names="+rs.getString("uName"));
                  }
                  else
                  {
                     response.sendRedirect("errorPass2.jsp");
                  }
                  
               }
            }
            catch(Exception ex)
            {
              out.println("Exeception :"+ex.getMessage());
            
            }
           
        }
    }

    
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
  

}
