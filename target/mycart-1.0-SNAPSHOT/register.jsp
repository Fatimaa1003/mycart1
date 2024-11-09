

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New User</title>
         <%@include file="comoponents/common_css_js.jsp" %>
    </head>
    <body>
        <%@include file="comoponents/navbar.jsp" %>
        <div class=""container-fluid">
            <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="card">
                    
                    <%@include file="comoponents/message.jsp" %>
                    
                    <div class="card-body px-5">
                        <div class=text-center>
                            <img src="img/icon.png"  style="max-width: 150px;"class="img-fluid" />
                        </div>
                         <h3 class="text-center my-3">Sign up here </h3>
                <form action="RegisterServlet" method="post">
                    <div class="form-group">
    <label for="name">User Name</label>
    <input name="user_name" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter here">
    
  </div>
                     <div class="form-group">
    <label for="email">User Email</label>
    <input name="user_email" type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter here">
    
  </div>
                                         
                                         
                     <div class="form-group">
    <label for="password">User Password</label>
    <input name="user_password" type="password" class="form-control" id="password" aria-describedby="emailHelp" placeholder="Enter here">
    
  </div>
                     <div class="form-group">
    <label for="phone">User phone</label>
    <input name="user_pn"type="number" class="form-control" id="phone" aria-describedby="emailHelp" placeholder="Enter here">
    
  </div>
                     <div class="form-group">
    <label for="Address">User Address</label>
    <textarea name="user_add" style="height:200px;" class="form-control"   placeholder="Enter here"> </textarea>
    
  </div>
                    <div class="container text-center">
                        <button class="btn btn-outline-success">Registration</button>
                        <button class="btn btn-outline-warning">Reset</button>
                        
                    </div>
                </form>
                        
                    </div>
                </div>
               
            </div>
        </div>
            
        </div>
       
    </body>
</html>
