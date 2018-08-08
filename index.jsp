<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Login</title>
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
                <div class="panel-body" style="background-color: white; padding: 50px 20px 40px 20px; width: 40%; border-radius: 20px; border:solid; border-width: 1px; border-color: #bbbbbb" >

                    <form action="/login" method="post">
                        <p class="font-weight-bold">Welcome to Pinterest 4 Food</p>
                        <div class="alert alert-danger" id="signInError" role="alert">${loginfail}</div>
                        <script>
                            if($("#signInError").text()){
                                $("#signInError").show();                                
                            }else{
                                $("#signInError").hide();
                            }                           
                        </script>
                                            
                        <div class="form-group">
                          
                          <input type="text" class="form-control" id="exampleDropdownFormEmail2" placeholder="Username" name="username">
                        </div>
                        <div class="form-group">
                         
                          <input type="password" class="form-control" id="exampleDropdownFormPassword2" placeholder="Password" name="password">
                        </div>
                        <div class="dropdown-divider"></div>
                        <button type="submit" class="btn btn-primary">Sign In</button>
                        
                      </form>
                    <p style="padding-top: 20px">No account yet? <a href="Registration">Sign up</a></p>
                    <div class="dropdown-divider"></div>
                    <a href="#" class="btn btn-lg btn-block omb_btn-facebook">
                        <i class="fab fa-google-plus-g"></i>
                        <span class="hidden-xs">Login with Google</span>
                    </a>
                </div>
            </div>
        </div>
    </body>
</html>