
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<% 
    if(request.getParameter("submit")!=null)
    {
        int no = Integer.parseInt(request.getParameter("no"));
        String fName=request.getParameter("fName");
        String lName=request.getParameter("lName");
        String email=request.getParameter("email");
        String address1=request.getParameter("address");
        
        String id=request.getParameter("id");
        String city=request.getParameter("city");
        String password=request.getParameter("password");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String note=request.getParameter("notes");
        
                           Connection con;
                           PreparedStatement pst;
                           ResultSet rs;
                           
                           String url="jdbc:mysql://localhost:3306/pharma";
                           Class.forName("com.mysql.jdbc.Driver");
                           con = DriverManager.getConnection(url,"root","");
                           
                           
                           pst = con.prepareStatement("update pharmacist set fName ='"+fName+"' ,lName = '"+lName+"',email = '"+email+"' ,address = '"+address1+"' ,id ='"+id+"' ,city ='"+city+"' ,password = '"+password+"' ,phone = '"+phone+"' ,notes = '"+note+"' where no = ?");
                          pst.setInt(1, no);
                                   
                          pst.executeUpdate();
                          response.sendRedirect("adminPharmacistView.jsp");
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
                           pst = con.prepareStatement("select *from pharmacist where no=?");
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
                    <label for="c_fname"class="text-black">First Name <span class="text-danger" >*</span></label>
                  <input type="text"class="form-control" value="<%=rs.getString("fName")%>"  name="fName" value="" required/>
                </div>
                <div class="col-md-6">
                  <label for="c_lname" class="text-black">Last Name <span class="text-danger">*</span></label>
                  <input type="text"class="form-control" value="<%=rs.getString("lName")%>"  name="lName" value="" required/>
                </div>
              </div>
    
              <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_companyname" class="text-black">Email Address <span class="text-danger">*</span> </label>
                  <input type="text" class="form-control"value="<%=rs.getString("email")%>"  name="email" value="" required/>
                </div>
              </div>
    
              <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_address" class="text-black">Address <span class="text-danger">*</span></label>
                  <input type="text"class="form-control"value="<%=rs.getString("address")%>"  name="address" value="" required/>
                </div>
              </div>
     
              
              <div class="form-group row">
                <div class="col-md-6">
                  <label for="c_state_country" class="text-black">ID <span class="text-danger">*</span></label>
                  <input type="text"class="form-control" name="id" value="<%=rs.getString("id")%>" placeholder="ID Number" onkeypress="javascript:return isNumber(event)" required/>
                </div>
                <div class="col-md-6">
                  <label for="c_postal_zip" class="text-black">City <span class="text-danger">*</span></label>
                  <input type="text"class="form-control" name="city" value="<%=rs.getString("city")%>" required/>
                </div>
              </div>
    
              <div class="form-group row mb-5">
                <div class="col-md-6">
                  <label for="c_email_address" class="text-black">Password <span class="text-danger">*</span></label>
                  <input type="password"class="form-control" name="password" value="<%=rs.getString("password")%>" required/>
                </div>
                <div class="col-md-6">
                  <label for="c_phone" class="text-black">Phone <span class="text-danger">*</span></label>
                  <input type="text"class="form-control" name="phone" value="<%=rs.getString("phone")%>" onkeypress="javascript:return isNumber(event)" required/>
                </div>
              </div>
                
                
                  <div class="form-group">
                <label for="c_order_notes" class="text-black">Notes</label>
               
                <textarea name="notes"  rows="5" cols="30" class="form-control"  placeholder="Write your notes here..." required> <%=rs.getString("notes")%>
                </textarea>
              </div>
               <% } %>  
                <br>
          
                 <div class="form-group">
                     <input class="btn btn-info" type="submit" value="UPDATE" id="submit" name="submit"/>
                     
                     <input class="btn btn-black" type="button" onclick="window.location.href = 'adminPharmacistView.jsp';" value="BACK"/>
                     
                       
                     
                
            </div>
                       </div>
        </div>
        </div>
                
         
        </form> 
    </body>
</html>
