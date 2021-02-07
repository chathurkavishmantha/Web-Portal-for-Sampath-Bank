<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
    <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
     <link rel="stylesheet" href="resourcess/css&js&jquery/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="resourcess/css&js&jquery/customized.css" type="text/css">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <title>Hello, world!</title>
    </head>


    <body>
        <nav class="navbar fixed-top navbar-expand-md navbar-dark fixed-stuff">
            <div class="navbar-collapse collapse w-100 order-1 order-md-0 dual-collapse2">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#" title="Go to Employee Homepage">Customer Home</a>
                    </li>
                    
                </ul>
            </div>
            <div class="mx-auto order-0">
                <a class="navbar-brand mx-auto" href="#" title="Go to Employee Homepage">Sampath Web Portal</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target=".dual-collapse2">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </div>
            <div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item" title="Sign Up">
                        <a class="nav-link" href="#"><span class="fa fa-user"></span> Sign Up</a>
                    </li>
                    <li class="nav-item" title="Login">
                        <a class="nav-link" href="#"><span class="fa fa-sign-in"></span> Login</a>
                    </li>
                </ul>
            </div>
        </nav>

        <header class="page-header" id="header01">
            <div class="header-mid">
                <a href="#" title="Go to Sampath Web Site">
                    <div class="container-fluid img-div">
                        <img src="resourcess/images/SampathBankLogo01.png" alt="" class="logo">
                    </div>
                </a>
                <div style=" float: right">
                    <div class="container-fluid img_profile_div">
                        <img src="resourcess/images/ProfilePlaceholder.png" alt="" class="pro-pic">
                    </div>
                    <div class="container-fluid" style="float: right; clear: both;" >
                        <a href="">Mr. xxx xxx</a>
                    </div>
                </div>

            </div>

            <div class="container-fluid">
                <ul class="nav nav-pills nav-fill nav-justified nav-header">
                    <!--fixed-top-->
                    <li class="nav-item dropdown" title="Click to go to Homepage">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; text-align: center; background-color: #FD4F00">Home</a>
                            
                    </li>
                    <li class="nav-item dropdown" title="Click to See About Us">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; background-color: #FD4F00">About Us</a>
                        
                    </li>
                    <li class="nav-item dropdown" title="Click to Contact Us">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; background-color: #FD4F00">Contact Us</a>
                        
                    </li>
                    <li class="nav-item dropdown" title="Click to See Available Jobs ">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; background-color: #FD4F00">Careers</a>
                        
                    </li>
                    <li class="nav-item dropdown" title="Click to See News">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; background-color: #FD4F00">News</a>
                        
                    </li>
                    <li class="nav-item dropdown" title="Click to See Branches">
                        <a class="nav-link nav-change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; background-color: #FD4F00">Branch Network</a>
                        
                    </li>
                </ul>
            </div>

        </header>







        <div class="container-fluid" style="height: 1755px ">
            
            <div class="row">
                <div class="col-md-2" style="height: 450px;background-color:#fd4f00 ;border-radius: 10px 10px 10px 10px;margin-top:5px;">
                
                <ul class="nav nav-center" align="center" style="margin-top:20px">
                    <li class="nav-item">
                        <a class="nav-link nav_change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; text-align: center; background-color: white;font-weight:bold;color:#fd4f00;width:200px">Transaction</a>
                    
                    <ul class="list-unstyled" align="center" style="text-align:10px;margin-left:5px">
                        
                      <li>   <a href="#!" style="color:white">Inter-Bank Transaction</a>  </li>
                      <li>  <a href="#!" style="color:white">Intra-Bank Transaction</a>  </li>  
                      <li> <a href="#!" style="color:white">Account Balance</a>          </li> 
                      <li> <a href="#!" style="color:white">Account History</a>             </li> 
                   
                    
                    </ul>
                    
                    </li>
                    
                     <li class="nav-item">        
                        <a class="nav-link nav_change" data-toggle="dropdown" href="LM_LoanCalculator.html" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; text-align: center; background-color: white;font-weight:bold;color:#fd4f00;;width:200px">Loan Calculator</a>
                    
                    
                     <ul class="list-unstyled" align="center" style="text-align:10px;margin-left:5px">
                        
                      <li>   <a href="LM_LoanSign.html" style="color:white">For Admin Sign IN</a>  </li>
                      <li>   <a href="LM_LoanRegister.html" style="color:white">For Admin Register</a>  </li>
                      <li>   <a href="LM_LoanOverviw.html" style="color:white">For Loan Over View</a>  </li>
                      
                   
                    
                    </ul>
                    
                    </li>
                    
                    <li class="nav-item">    
                        <a class="nav-link nav_change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; text-align: center; background-color: white;font-weight:bold;color:#fd4f00;;width:200px">Lease Calculator</a>
                    
                     <ul class="list-unstyled" align="center" style="text-align:10px;margin-left:5px">
                        
                      <li>   <a href="#!" style="color:white">Other Loan Related</a>  </li>
                      
                   
                    
                    </ul>
                    
                    
                    </li>
                    
                    <li class="nav-item">    
                        <a class="nav-link nav_change" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="border-radius: 15px; text-align: center; background-color: white;font-weight:bold;color:#fd4f00;;width:200px">Complaint Handling</a>
                    
                    <ul class="list-unstyled" align="center" style="text-align:10px;margin-left:5px">
                        
                      <li>   <a href="#!" style="color:white">Lodge</a>  </li>
                      <li>  <a href="#!" style="color:white">History</a>  </li>  
                      <li> <a href="#!" style="color:white">Chat Support</a>          </li> 
                      
                   
                    
                    </ul>
                    
                    
                    </li>
                <ul>
                
                </div>
                
                <div class="col-md-10">
                    <!-- Include your stuff here-->
					<div class="banner2">
					<img src="resourcess/images/personal.png" style="width: 1235px; height: 500px " >
					
					</div>
							<div class="container">
									<div class="Home-loan">
										<h1>personal Loan</h1>
										<p>You can now put a full stop to the hassle of getting housing loans and make your dream home a reality. </p>
									</div> 
									<div class="row">
										<div class="col-md-13 crli about_grid">
											<i class="fas fa-uniregistry"></i>
											<h4>personal Loan</h4>
											<p>Whether you’re remodeling your vehicle or buying a new one, Comerica home loan solutions1 are designed with the flexibility needed to meet your needs</p>
											
											<form action="searchPersonal2" method="POST">
		                                        <div class="input-group mb-3">
		                                                <div class="input-group-prepend">
		                                                    <span class="input-group-text" id="search1" >Search</span>
		                                                </div>
		                                            <input type="text" class="form-control" name="loanType" placeholder="Enter Loan type " id="search2">&ensp;&ensp;&ensp;
		                                            <button type="submit" class="more-bttn" id="createbutton" >Search</button>
		                                        </div>
                                        
                        		 			</form>
										</div><br><br><br>

									   
									</div>  
								</div> 

								<%
                                        
                                        int Total = 0;
                                        int count = 0;
                                        
                                        if (request.getAttribute("result") != null){
                                        	ArrayList al = (ArrayList) request.getAttribute("result");
                                        	
                                            System.out.println(al);
                                            
                                            Iterator itr = al.iterator();
                                            while (itr.hasNext()) {          
                                                count++;
                                                ArrayList search_list = (ArrayList) itr.next();	
                                        %>

									   
									
									<%
                    						}
                						}						
                						if (count == 0) {
                    					%>
                    						
									
                    					<%    
                    					}
                						%>

								</div>	
											
							</div>
							 <div class="col-sm-12 my-col7">
                                <table class="table table-striped">
                                        <thead>
                                          <tr>
                                            <th scope="col">#</th>
                                            <th scope="col">Loan Id</th>
                                            <th scope="col">Loan Type</th>
                                            <th scope="col">Loan Rate</th>
                                          </tr>
                                        </thead>
                                        <tbody>
                                        <%
                                        
                                        int Total2 = 0;
                                        int count2 = 0;
                                        
                                        if (request.getAttribute("result") != null){
                                        	ArrayList al = (ArrayList) request.getAttribute("result");
                                        	
                                            System.out.println(al);
                                            
                                            Iterator itr = al.iterator();
                                            while (itr.hasNext()) {          
                                                count++;
                                                ArrayList search_list = (ArrayList) itr.next();	
                                        %>
                                    <form action="UpdateDeleteServlet" method="post">
                                    	
                                          <tr>
                                          	<th scope="row"></th>
                                          	<td><input type="hidden" name="loanid" value="<%=search_list.get(0)%>"><%=search_list.get(0)%></td>
                                            <td><input type="hidden" name="loanType" value="<%=search_list.get(1)%>"><%=search_list.get(1)%></td>
                							<td><input type="hidden" name="loanRate" value="<%=search_list.get(2)%>"><%=search_list.get(2)%></td>
               	 	
              	  							
                                          </tr>
                                          
                                         </form>
                                         <%
                    						}
                						}						
                						if (count == 0) {
                    					%>
                    						<tr>
                        						<td colspan=6 align="center"style="background-color:#F4F6F6"><b>No Record Found..</b></td>
                    						</tr>
                    					<%    
                    					}
                						%>
                                        </tbody>
                                        
                                      </table>
                                      
                        </div>
                </div>
              
        </div>

				<br><br><br>
							

            <!-- Footer Links -->

       <!-- Footer -->
        <footer class="page-footer font-small blue pt-4 footer-all">
            <div class="container-fluid text-center text-md-left">
                <div class="row">
                    <div class="col-6 mt-md-0 mt-3 footer-all-stuff footer-legal-form-stuff" title="Our Legal Form">
                        <h5 class="text-uppercase">Legal Form</h5>
                        <p style="text-align: justify">A Public Limited Liability Company incorporated in Sri Lanka on 10th March 1986 under the Companies Act No 17 of 1982 and listed in the Colombo Stock Exchange. A licensed Commercial Bank under the Banking Act No 30 of 1988. Re-registered on 28th April 2008 under the Companies Act No 7 of 2007.</p>
                    </div>

                    <hr class="clearfix w-100 d-md-none pb-3">

                    <div class="col mb-md-0 mb-3 footer-all-stuff footer-other-stuff" title="Know About the Company">
                        <h5 class="text-uppercase">Company</h5>

                        <ul class="list-unstyled">
                            <li>
                                <a href="#!" style="color:white">Home</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">About Us</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Contact Us</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Privacy Policy</a>
                            </li>
                        </ul>
                    </div>

                    <div class="col mb-md-0 mb-3 footer-all-stuff footer-other-stuff">
                        <h5 class="text-uppercase">Profile Related</h5>

                        <ul class="list-unstyled">
                            <li>
                                <a href="#!" style="color:white">View Profile</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Update Profile</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">View History</a>
                            </li>
                        </ul>

                    </div>

                    <div class="col mb-md-0 mb-3 footer-all-stuff footer-last-stuff" title="Act as a Customer">
                        <h5 class="text-uppercase">Customer Related</h5>

                        <ul class="list-unstyled">
                            <li>
                                <a href="#!" style="color:white">Transaction</a>
                            </li>
                            <li>
                                <a href="LoanCalculator.html" style="color:white">Loan Calculator</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Lease Calculator</a>
                            </li>
                            <li>
                                <a href="#!" style="color:white">Complaint</a>
                            </li>
                        </ul>

                    </div>
                </div>

                <!-- Copyright -->
                <div class="footer-copyright text-left py-1 footer_copyright" title="Disclaimer">© All Rights Reserved @2018 |
                    <a href="#" title="Owners/ Group"> ITP-2018-MLB-G3-10.</a> |
                    <a href="#" title="Privacy Policy"> Privacy Policy.</a>
                </div>
                <!-- Copyright -->
            </div>
            <!-- Footer Links -->

       </footer>
        <!-- Footer -->
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="resourcess/jquery-3.3.1.slim.min.js"></script>
    <script src="resourcess/popper.min.js"></script>
	
    <script src="resourcess/bootstrap.min.js"></script>
	
    </body>
</html>