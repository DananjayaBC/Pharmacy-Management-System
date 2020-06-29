<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

   
<!DOCTYPE html>
<html lang="en">

<head>
  <title>Customer &mdash; Book Medicine</title>
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
    // WRITE THE VALIDATION SCRIPT.
    function isNumber(evt) {
        var iKeyCode = (evt.which) ? evt.which : evt.keyCode
        if (iKeyCode != 46 && iKeyCode > 31 && (iKeyCode < 48 || iKeyCode > 57))
            return false;

        return true;
    }    
</script>

</head>

<body>
    <form action="customerBookServlet" method="POST">
   
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
         


    <div class="site-navbar py-2">
    

      <div class="search-wrap">
        <div class="container">
          <a href="#" class="search-close js-search-close"><span class="icon-close2"></span></a>
         
            <input type="text" class="form-control" placeholder="Search keyword and hit enter...">
          
        </div>
      </div>

      <div class="container">
        <div class="d-flex align-items-center justify-content-between">
          <div class="logo">
            <div class="site-logo">
              <a href="index.jsp" class="js-logo-clone">Pharmacy</a>
            </div>
          </div>
          <div class="main-nav d-none d-lg-block">
            <nav class="site-navigation text-right text-md-center" role="navigation">
              <ul class="site-menu js-clone-nav d-none d-lg-block">
                <li class="active"><a href="index.jsp">Home</a></li>
                    <li class="has-children">
                  <a href="#">PURCHASE</a>
                  <ul class="dropdown">
                    <li><a href="logIn.jsp">UPLOAD PRESCRIPTION</a></li>
                  
                  </ul>
                </li>
               
               
              </ul>
            </nav>
          </div>
          <div class="icons">
            
          </div>
        </div>
      </div>
    </div>
  </div>
       <div class="bg-light py-3">
      <div class="container">
        <div class="row">
          <div class="col-md-12 mb-0">
            <a href="index.html">Home</a> <span class="mx-2 mb-0">/</span>
            <strong class="text-black">Book Medicine</strong>
          </div>
        </div>
      </div>
    </div>
       <div class="site-section">
      <div class="container">
        <div class="row mb-5">
          <div class="col-md-12">
            <div class="bg-light rounded p-3">
              <p class="mb-0">Book <a href="#" class="d-inline-block">MEDICINE</a></p>
            </div>
          </div>
        </div>
         
             <div class="row">
            
          <div class="col-md-6 mb-5 mb-md-0">
            <h2 class="h3 mb-3 text-black">Medicine Name</h2>
            <div class="p-3 p-lg-5 border">
            
              <div class="form-group row">
                <div class="col-md-6">
                    <label for="c_fname"class="text-black">Name <span class="text-danger" >*</span></label>
                  <input type="text"class="form-control" value="<%=rs.getString("name")%>"  name="name" readonly/>
                </div>
                <div class="col-md-6">
                  <label for="c_lname" class="text-black">Category <span class="text-danger">*</span></label>
                  <input type="text"class="form-control" value="<%=rs.getString("category")%>"  name="category"  readonly/>
                </div>
              </div>
    
              <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_companyname" class="text-black">Company <span class="text-danger">*</span> </label>
                  <input type="text" class="form-control"value="<%=rs.getString("company")%>"  name="company" disabled/>
                </div>
              </div>
    
              <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_address" class="text-black">Price <span class="text-danger">*</span></label>
                  <input type="text"class="form-control"value="<%=rs.getString("price")%>"  name="price"  disabled/>
                </div>
              </div>
                <div class="form-group row">
               
                  <div class="form-group row">
                  </div>
                </div>
            </div>
          </div>
             </div>  
      
          
          <br>
        <div class="row">
          <div class="col-md-6 mb-5 mb-md-0">
            <h2 class="h3 mb-3 text-black">Primary Delivery Address</h2>
            <div class="p-3 p-lg-5 border">
             <div class="form-group row">
                <div class="col-md-6">
                    <label for="c_fname"class="text-black">First Name <span class="text-danger" >*</span></label>
                  <input type="text"class="form-control"  name="fName"  required/>
                </div>
                <div class="col-md-6">
                  <label for="c_lname" class="text-black">Last Name <span class="text-danger">*</span></label>
                  <input type="text"class="form-control"  name="lName"  required/>
                </div>
              </div>
    
              <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_companyname" class="text-black">Email Address <span class="text-danger">*</span> </label>
                  <input type="text" class="form-control"  name="email" required/>
                </div>
              </div>
    
              <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_address" class="text-black">Address <span class="text-danger">*</span></label>
                  <input type="text"class="form-control" name="address" required/>
                </div>
              </div>
     
              
              <div class="form-group row">
                <div class="col-md-6">
                  <label for="c_state_country" class="text-black">Province <span class="text-danger">*</span></label>
                  <input type="text"class="form-control" name="province" required/>
                </div>
                <div class="col-md-6">
                  <label for="c_postal_zip" class="text-black">Postel Code <span class="text-danger">*</span></label>
                  <input type="text"class="form-control" name="postelCode"  required onkeypress="javascript:return isNumber(event)" />
                </div>
              </div>
    
              <div class="form-group row mb-5">
                
                <div class="col-md-6">
                  <label for="c_phone" class="text-black">Phone <span class="text-danger">*</span></label>
                  <input type="text"class="form-control" name="phone"  placeholder="Phone Number" required onkeypress="javascript:return isNumber(event)" />
                </div>
              </div>
                
                
              
                
                <br>
          
                 <div class="form-group">
                     <input class="btn btn-info" type="submit" value="BOOK" />  
                      <input class="btn btn-black" type="button" onclick="window.location.href = 'customerBookMedicine.jsp';" value="BACK"/>
       
                 </div>
                 <% } %> 
            </div>
          </div>
       
        </div>
        
            

    <div class="site-section bg-secondary bg-image" style="background-image: url('images/bg_2.jpg');">
      <div class="container">
        <div class="row align-items-stretch">
          <div class="col-lg-6 mb-5 mb-lg-0">
            <a href="#" class="banner-1 h-100 d-flex" style="background-image: url('images/bg_1.jpg');">
              <div class="banner-1-inner align-self-center">
                <h2>Pharmacy Products</h2>
                <p>A healthier nation that contributes to its economic, social, mental and spiritual development.
                </p>
              </div>
            </a>
          </div>
          <div class="col-lg-6 mb-5 mb-lg-0">
            <a href="#" class="banner-1 h-100 d-flex" style="background-image: url('images/bg_2.jpg');">
              <div class="banner-1-inner ml-auto  align-self-center">
                <h2>Rated by Experts</h2>
                <p>To be the Admired Healthcare Retailer in Sri Lanka.
                </p>
              </div>
            </a>
          </div>
        </div>
      </div>
    </div>


    <footer class="site-footer">
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-lg-3 mb-4 mb-lg-0">

            <div class="block-7">
              <h3 class="footer-heading mb-4">About Us</h3>
              <p>To contribute to social and economic development of Sri Lanka by achieving the highest attainable
                  health status through promotive, preventive, curative and rehabilitative services of high quality
                  made available and accessible to people of Sri Lanka.</p>
            </div>

          </div>
          <div class="col-lg-3 mx-auto mb-5 mb-lg-0">
            <h3 class="footer-heading mb-4">Quick Links</h3>
            <ul class="list-unstyled">
              <li><a href="#">Supplements</a></li>
              <li><a href="#">Vitamins</a></li>
              <li><a href="#">Diet &amp; Nutrition</a></li>
              <li><a href="#">Tea &amp; Coffee</a></li>
            </ul>
          </div>

          <div class="col-md-6 col-lg-3">
            <div class="block-5 mb-5">
              <h3 class="footer-heading mb-4">Contact Info</h3>
              <ul class="list-unstyled">
                <li class="address">
                   SUWASIRIPAYA
                   No. 385,
                   Rev. Baddegama Wimalawansa Thero Mawatha.
                   Colombo 10, Sri Lanka</li>
                <li class="phone"><a href="tel://0770553938">+94 77 055 3938</a></li>
                <li class="email">Dananjaya.chanuka@gmail.com</li>
              </ul>
            </div>


          </div>
        </div>
        <div class="row pt-5 mt-5 text-center">
          <div class="col-md-12">
            <p>
            
              Copyright &copy;
              <script>document.write(new Date().getFullYear());</script> All rights reserved |
               <i class="icon-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank"
                class="text-primary">DANA</a>
              
            </p>
          </div>

        </div>
      </div>
    </footer>
  

  <script src="js/jquery-3.3.1.min.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/aos.js"></script>

  <script src="js/main.js"></script>
    
</form> 
</body>
</html>
    
             
    
    
              
    
            

             
    
    
              
    
            

