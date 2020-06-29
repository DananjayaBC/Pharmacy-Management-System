<%-- 
    Document   : adminMedicineUpdate
    Created on : Apr 19, 2020, 11:07:06 PM
    Author     : Danac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<% 
    if(request.getParameter("submit")!=null)
    {
        int no = Integer.parseInt(request.getParameter("no"));
        String name=request.getParameter("name");
        String category=request.getParameter("category");
        String company=request.getParameter("company");
        int price = Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String description=request.getParameter("description");
        
                           Connection con;
                           PreparedStatement pst;
                           ResultSet rs;
                           
                           String url="jdbc:mysql://localhost:3306/pharma";
                           Class.forName("com.mysql.jdbc.Driver");
                           con = DriverManager.getConnection(url,"root","");
                           
                           
                           pst = con.prepareStatement("update medicine set name ='"+name+"' ,category = '"+category+"',company = '"+company+"' ,price = '"+price+"' ,quantity ='"+quantity+"' ,description ='"+description+"' where no = ?");
                          pst.setInt(1, no);
                                   
                          pst.executeUpdate();
                          
                          response.sendRedirect("adminMedicineView.jsp");
%>

<% }%>

<!DOCTYPE html>
<html>
    <head>
         <title>Pharmacy &mdash; SignUp</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <link href="https://fonts.googleapis.com/css?family=Rubik:400,700|Crimson+Text:400,400i" rel="stylesheet">
  <link rel="stylesheet" href="fonts/icomoon/style.css">

  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/magnific-popup.css">
  <link rel="stylesheet" href="css/jquery-ui.css">
  <link rel="stylesheet" href="css/owl.carousel.min.css">
  <link rel="stylesheet" href="css/owl.theme.default.min.css">


  <link rel="stylesheet" href="css/aos.css">

  <link rel="stylesheet" href="css/style.css">
  <script>
    
    function isNumber(evt) {
        var iKeyCode = (evt.which) ? evt.which : evt.keyCode
        if (iKeyCode != 46 && iKeyCode > 31 && (iKeyCode < 48 || iKeyCode > 57))
            return false;

        return true;
    }    
</script>
    </head>
    <body>
        <form action="#" method="POST">
            
            <% 
                           Connection con;
                           PreparedStatement pst;
                           ResultSet rs;
                           
                           String url="jdbc:mysql://localhost:3306/pharma";
                           Class.forName("com.mysql.jdbc.Driver");
                           con = DriverManager.getConnection(url,"root","");
                           
                           String no = request.getParameter("no");
                           pst = con.prepareStatement("select *from medicine where no=?");
                           pst.setString((1), no);
                           rs = pst.executeQuery();
                           
                             while(rs.next())
                             {
                             
                             
            
            
            
            
            %>
        
        <div class="row">
          <div class="col-md-6 mb-5 mb-md-0">
            <h2 class="h3 mb-3 text-black">Pharmacist Update</h2>
            <div class="p-3 p-lg-5 border">
            
              <div class="form-group row">
                <div class="col-md-6">
                    <label for="c_fname"class="text-black">Name <span class="text-danger" >*</span></label>
                  <input type="text"class="form-control" value="<%=rs.getString("name")%>"  name="name" value="" required/>
                </div>
                <div class="col-md-6">
                  <label for="c_lname" class="text-black">Category <span class="text-danger">*</span></label>
                  <input type="text"class="form-control" value="<%=rs.getString("category")%>"  name="category" value="" required/>
                </div>
              </div>
    
              <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_companyname" class="text-black">Company <span class="text-danger">*</span> </label>
                  <input type="text" class="form-control"value="<%=rs.getString("company")%>"  name="company" value="" required/>
                </div>
              </div>
    
              <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_address" class="text-black">Price <span class="text-danger">*</span></label>
                  <input type="text"class="form-control"value="<%=rs.getString("price")%>"  name="price" value="" onkeypress="javascript:return isNumber(event)" required/>
                </div>
              </div>
                <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_address" class="text-black">Quantity <span class="text-danger">*</span></label>
                  <input type="text"class="form-control"value="<%=rs.getString("quantity")%>"  name="quantity" value="" onkeypress="javascript:return isNumber(event)" required/>
                </div>
              </div>
                  <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_address" class="text-black">Description <span class="text-danger">*</span></label>
                  <input type="text"class="form-control"value="<%=rs.getString("description")%>"  name="description" value="" required/>
                </div>
              </div>
     
              
            
                <% } %>
                <br>
          
                 <div class="form-group">
                     <input class="btn btn-info" type="submit" value="UPDATE" id="submit" name="submit"/>
                     
                     <input class="btn btn-black" type="button" onclick="window.location.href = 'adminMedicineView.jsp';" value="BACK"/>
                     
                            
                     
                
            </div>
                       </div>
        </div>
         
        </form> 
    </body>
</html>

