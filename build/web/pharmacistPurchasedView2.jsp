<%-- 
    Document   : customerPurchasedView2
    Created on : Apr 27, 2020, 8:55:14 AM
    Author     : Danac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

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
    </head>
    <body>
        <form action="myServlet" method="GET">
            
            <% 
                           Connection con;
                           PreparedStatement pst;
                           ResultSet rs;
                           
                           String url="jdbc:mysql://localhost:3306/pharma";
                           Class.forName("com.mysql.jdbc.Driver");
                           con = DriverManager.getConnection(url,"root","");
                           
                           String no = request.getParameter("no");
                           pst = con.prepareStatement("select *from customer where no=?");
                           pst.setString((1), no);
                           rs = pst.executeQuery();
                           
                             while(rs.next())
                             {
                             
                             
            
            
            
            
            %>
        
        <div class="row">
          <div class="col-md-6 mb-5 mb-md-0">
            <h2 class="h3 mb-3 text-black">Medicine Details</h2>
            <div class="p-3 p-lg-5 border">
            
              <div class="form-group row">
                <div class="col-md-6">
                    <label for="c_fname"class="text-black">NO<span class="text-danger" >*</span></label>
                  <input type="text"class="form-control" value="<%=rs.getString("no")%>"  name="no" value="" readonly/>
                </div>
                <div class="col-md-6">
                  <label for="c_lname" class="text-black">Prescription Image <span class="text-danger">*</span></label>
                  <br>
                  <input class="btn btn-danger" type="submit" value="Download" />
                </div>
              </div>
            </div>
         
          </div>
                 
          <div class="col-md-6 mb-5 mb-md-0">
              <h2 class="h3 mb-3 text-black">Delivery Address</h2>
              <div class="p-3 p-lg-10 border">
              
              <div class="form-group row">
                <div class="col-md-6">
                    <label for="c_fname"class="text-black">First Name <span class="text-danger" >*</span></label>
                  <input type="text"class="form-control" value="<%=rs.getString("fName")%>"  name="name" value="" readonly/>
                </div>
                <div class="col-md-6">
                  <label for="c_lname" class="text-black">Last Name<span class="text-danger">*</span></label>
                  <input type="text"class="form-control" value="<%=rs.getString("lName")%>"  name="category" value="" readonly/>
                </div>
              </div>
                <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_address" class="text-black">Email <span class="text-danger">*</span></label>
                  <input type="text"class="form-control"value="<%=rs.getString("email")%>"  name="quantity" value="" readonly/>
                </div>
                
              </div>
                  <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_address" class="text-black">Address <span class="text-danger">*</span></label>
                  <input type="text"class="form-control"value="<%=rs.getString("address")%>"  name="description" value="" readonly/>
                </div>
              </div>
                  <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_address" class="text-black">Province <span class="text-danger">*</span></label>
                  <input type="text"class="form-control"value="<%=rs.getString("province")%>"  name="description" value="" readonly/>
                </div>
              </div>
                  <div class="form-group row">
                <div class="col-md-6">
                    <label for="c_fname"class="text-black">Postal Code <span class="text-danger" >*</span></label>
                  <input type="text"class="form-control" value="<%=rs.getString("postalCode")%>"  name="name" value="" readonly/>
                </div>
                <div class="col-md-6">
                  <label for="c_lname" class="text-black">Phone<span class="text-danger">*</span></label>
                  <input type="text"class="form-control" value="<%=rs.getString("phone")%>"  name="category" value="" readonly/>
                </div>
              </div>
     
     
              
            
                <% } %>
                <br>
          
                 <div class="form-group">
                     
                     
                     <input class="btn btn-black" type="button" onclick="window.location.href = 'PharmacistPurchasedView.jsp';" value="BACK"/>
          
            </div>
              
                       
        </div>
          </div>
          </div>
          </div>
        </div>
                
                
         
        </form> 
    </body>
</html>

