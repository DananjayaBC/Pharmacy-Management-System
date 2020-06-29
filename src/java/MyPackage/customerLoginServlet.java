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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Danac
 */
@WebServlet(name = "customerLoginServlet", urlPatterns = {"/customerLoginServlet"})
public class customerLoginServlet extends HttpServlet {
    
    

    
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
                  String Query="select * from registration where email=? and password=?";
                  PreparedStatement psm=conn.prepareStatement(Query);
                  psm.setString(1, uName);
                  psm.setString(2, pass);
              
                  ResultSet rs=psm.executeQuery();
                   
                  if(rs.next())  
                  {
                     
                    HttpSession session =request.getSession();
                    session.setAttribute("uName", uName);
                    
             
                     response.sendRedirect("index.jsp");
                    
                      
                      
                  }
                  else
                  {
                     response.sendRedirect("errorPass1.jsp");
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
}