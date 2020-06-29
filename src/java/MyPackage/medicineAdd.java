/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Danac
 */
@WebServlet(name = "medicineAdd", urlPatterns = {"/medicineAdd"})
@MultipartConfig(maxFileSize = 16177216)
public class medicineAdd extends HttpServlet {

 PrintWriter out = null;
 Connection con = null;
 PreparedStatement ps = null;
 HttpSession session = null;


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        
                String connectionURL = "jdbc:mysql://localhost:3306/pharma";
		String user = "root";
		String pass = "";
            int result = 0;
		Connection con = null;
		Part part = request.getPart("photo");
            
            String fName=request.getParameter("fName");
            String lName=request.getParameter("lName");
            String email=request.getParameter("email");
            String address1=request.getParameter("address");
            String province=request.getParameter("province");
            String postelCode=request.getParameter("postelCode");
             String phone=request.getParameter("phone");
            
             if(part != null){
			try{
				Class.forName("com.mysql.jdbc.Driver");
			    con = DriverManager.getConnection(connectionURL, user, pass);
			    
			    PreparedStatement ps = con.prepareStatement("INSERT INTO customer(img,fName,lName,email,address,province,postalCode,phone)VALUES(?,?,?,?,?,?,?,?)");
			    InputStream is = part.getInputStream();
			    ps.setBlob(1, is);
                 ps.setString(2, fName );
                 ps.setString(3, lName );
                 ps.setString(4, email );
                 ps.setString(5, address1 );
                 ps.setString(6, province );
                 ps.setString(7, postelCode );
                 ps.setString(8, phone );
			    result = ps.executeUpdate();
			}
			catch(Exception e){
				e.printStackTrace();
			}	
			finally{
				if(con != null){
					try{
						con.close();
					}
					catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
             if(result > 0){
	    	response.sendRedirect("thanks.jsp");
	    }
		else{
			response.sendRedirect("result.jsp?message=Some+Error+Occurred");
		}
            
            
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
