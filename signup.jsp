<%-- 
    Document   : signup
    Created on : Jul 24, 2018, 1:43:49 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>identification</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
         <script src="js/resultInModal.js"></script>
    </head>
    <body style="background-color: #eeeeee">
        <div class="container">
            <div align="center" class="panel panel-default" style="margin-top: 10%;">
                <div class="panel-body" style="background-color: white; padding: 50px 20px 40px 20px; width: 50%; border-radius: 20px; border:solid; border-width: 1px; border-color: #bbbbbb">
                    <form action="register" name="signup" onsubmit="return validateForm()" method="post">
                        <p class="font-weight-bold">Register to Pinterest 4 Food</p>
                        <p style="color: red;">${Status.getReturnmessage()}</p>
                        <div class="row">
                            <div class="col-sm">
                                <p>Credentials</p>
                                <div class="form-group">
                                    <input type="text" class="form-control" id="email" placeholder="Email" name="email" required>
                                    <p style="color:red;" id="emailError"></p>
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" id="username" placeholder="Username" name="username" required>
                                    <p style="color:red;" id="unameError"></p>
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" id="password" placeholder="Password" name="password" required>
                                     <p style="color:red;" id="pwdError"></p>
                                </div>
                            </div>

                            <div class="col-sm">
                                <p>Personal Details</p>
                                <div class="form-group">
                                    <input type="text" class="form-control" id="fname" placeholder="First Name" name="fname" required>
                                    <p style="color:red;" id="fnameError"></p>
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" id="lname" placeholder="Last Name" name="lname" required>
                                    <p style="color:red;" id="lnameError"></p>
                                </div>
                                <div class="form-group">                                    
                                    <input class="form-control" type="text" id="country" name="country" >

                                    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
                                    <script src="countrySelect/js/countrySelect.min.js"></script>
                                    <script>
                                        $("#country").countrySelect();
                                    </script> 
                                </div>
                                <div class="form-group">
                                    <select class="custom-select" name="gender" >
                                        <option selected>Select Gender</option>
                                        <option value="M">Male</option>
                                        <option value="F">Female</option>                                        
                                    </select>  
                                   <p style="color:red;" id="gError"></p>
                                </div>
                            </div>
                        </div>
                        <div class="dropdown-divider"></div>
                        <button type="submit" class="btn btn-primary">Register me</button>                        
                    </form>

                </div>
            </div>
        </div>
    </body>>
</html>>
        
        
        
        
       
        

