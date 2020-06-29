<%-- 
    Document   : adminPharmacistDelete
    Created on : Apr 19, 2020, 12:56:00 PM
    Author     : Danac
--%>

<%@page import="java.sql.*"%>

<% 
  
        int no = Integer.parseInt(request.getParameter("no"));
     
        
                           Connection con;
                           PreparedStatement pst;
                           ResultSet rs;
                           
                           String url="jdbc:mysql://localhost:3306/pharma";
                           Class.forName("com.mysql.jdbc.Driver");
                           con = DriverManager.getConnection(url,"root","");
                           
                           
                           pst = con.prepareStatement("delete from pharmacist where no = ?");
                          pst.setInt(1, no);
                                   
                          pst.executeUpdate();
                          
                          response.sendRedirect("adminPharmacistView.jsp");
%>



