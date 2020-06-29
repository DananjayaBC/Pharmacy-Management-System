<%-- 
    Document   : index
    Created on : Apr 29, 2020, 3:23:46 PM
    Author     : Danac
--%>

<!DOCTYPE html>
<html lang="en">

<head>
  <title>Pharmacy &mdash; Home</title>
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
    <form action="meinLogout">
        <%
        response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
        %>
    
  <div class="site-wrap">


    <div class="site-navbar py-2">

      <div class="search-wrap">
        <div class="container">
          <a href="#" class="search-close js-search-close"><span class="icon-close2"></span></a>
          <form action="#" method="post">
            <input type="text" class="form-control" placeholder="Search keyword and hit enter...">
          </form>
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
                    <li><a href="customerHome.jsp">UPLOAD PRESCRIPTION</a></li>
                    
                    <li><a href="customerBookMedicine.jsp">BOOK MEDICINE</a></li>
                   
                    
                  </ul>
                </li>
               
                </li>
                <li><a href="https://covid19.gov.lk/">COVID-19</a></li>
                
              
                   <li class="has-children">
                  <a href="#">STAFF ACCESS</a>
                  <ul class="dropdown">
                    <li><a href="adminLogin.jsp">ADMIN</a></li>
                    
                    <li><a href="pharmacistLogin.jsp">PHARMACIST</a></li>
                   
                    
                  </ul>
                </li>
                 
                
                
            </nav>
          </div>
                <div class="main-nav d-none d-lg-block">
              <nav class="site-navigation text-right text-md-center" role="navigation">
              <ul class="site-menu js-clone-nav d-none d-lg-block">
         
                 <li class="has-children"> 
                         <a href="logIn.jsp">LOGIN ${uName}</a>
                      
                 <ul class="dropdown">
                    
                     <li><input class="btn btn-danger btn-lg btn-block" type="submit" value="LOGOUT" /></li>
                   </ul>
                 </li>
              </ul>
            
          </div>
        </div>
      </div>
    </div>

    <div class="site-blocks-cover" style="background-image: url('images/hero_1.jpg');">
      <div class="container">
        <div class="row">
          <div class="col-lg-7 mx-auto order-lg-2 align-self-center">
            <div class="site-block-cover-content text-center">
              <h2 class="sub-title">Effective Medicine, New Medicine Everyday</h2>
              <h1>Welcome To Pharmacy</h1>
              <p>
                <a href="#" class="btn btn-primary px-5 py-3">Purchase & get medicine delivered at your door step</a>
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="site-section">
      <div class="container">
        <div class="row align-items-stretch section-overlap">
          <div class="col-md-6 col-lg-4 mb-4 mb-lg-0">
            <div class="banner-wrap bg-primary h-100">
              <a href="#" class="h-100">
                <h5>Free <br> Shipping</h5>
                <p>
                  Mainstream products
                  <strong>Get Your Clinic Medicines At Your Doorstep During Curfew.</strong>
                </p>
              </a>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 mb-4 mb-lg-0">
            <div class="banner-wrap h-100">
              <a href="#" class="h-100">
                <h5>Cash <br> On Delivery</h5>
                <p>
                  Mainstream products
                  <strong>Get Your Clinic Medicines At Your Doorstep During Curfew.</strong>
                </p>
              </a>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 mb-4 mb-lg-0">
            <div class="banner-wrap bg-warning h-100">
              <a href="#" class="h-100">
                <h5>Locate <br> Nearest Pharmacy Delivery</h5>
                <p>
                  Mainstream products
                  <strong>Get Your Clinic Medicines At Your Doorstep During Curfew.</strong>
                </p>
              </a>
            </div>
          </div>

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
                <p>To be the Admired Healthcare Retailer in Sri Lanka..
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
               <i class="icon-heart" aria-hidden="true"></i> by <a href="https://www.facebook.com/dananjaya.jayalath.18" target="_blank"
                class="text-primary">DANA</a>
              
            </p>
          </div>

        </div>
      </div>
    </footer>
  </div>

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
