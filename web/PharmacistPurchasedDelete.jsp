<%-- 
    Document   : PharmacistPurchasedDelete
    Created on : Apr 28, 2020, 4:40:56 PM
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
                           
                           
                           pst = con.prepareStatement("delete from customer where no = ?");
                          pst.setInt(1, no);
                                   
                          pst.executeUpdate();
                          
                          response.sendRedirect("PharmacistPurchasedView.jsp");
%>