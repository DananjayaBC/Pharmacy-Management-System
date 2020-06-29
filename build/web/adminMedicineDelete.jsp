<%-- 
    Document   : adminMedicineDelete
    Created on : Apr 19, 2020, 11:22:45 PM
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
                           
                           
                           pst = con.prepareStatement("delete from medicine where no = ?");
                          pst.setInt(1, no);
                                   
                          pst.executeUpdate();
                          
                          response.sendRedirect("adminMedicineView.jsp");
%>

