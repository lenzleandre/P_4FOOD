<%-- 
    Document   : calculation
    Created on : Aug 7, 2018, 6:57:12 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>     
        <title>Basic Calculation</title><meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
         <script src="js/resultInModal.js"></script>
        
        
    </head>
    <body>
        <center>
            <div class="jumbotron text-center">
                <form id="form1">
                    <label for="num1"><b>Number 1</b></label>
                    <input id="num1" type="text" name ="num1" value="0"><br><br>

                    <label for = "num2"><b>Number 2</b></label>
                    <input id="num2" type="text" name ="num2" value="0"><br><br>

                    <input id="r1" type ="radio" name = "r1" value="Add">+ 
                    <input id="r2" type = "radio" name = "r1" value="Sub">-<br>
                    <input id="r3" type="radio" name="r1" value ="mul">* 
                    <input id="r4" type = "radio" name="r1" value="div">/<br><br>

                    <p>Do you want to store the result in the DB 
                    <select id = "s1" name = "s1">
                        <option value="Yes">Yes</option>
                        <option value="No">No</option>
                    </select>
                    </p><br>
                    <!-- Button trigger modal -->
<!--                    <button type="buttom" class="btn btn-primary" >Submit</button>-->
                </form>
            </div>
            <input id="submit" type="submit" value="submit" class="btn btn-primary" onclick="sendAndUseModal()">

<!--            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                Open modal
            </button>-->

            <!-- The Modal -->
            <div class="modal fade" id="myModal">
              <div class="modal-dialog">
                <div class="modal-content">

                  <!-- Modal Header -->
                  <div class="modal-header">
                    <h4 class="modal-title">Results</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                  </div>

                  <!-- Modal body -->
                  <div class="modal-body">
                    <h1>Calculation executed </h1>
                    <p id="operation"></p>
                    <p id="operationResult"></p>
                  </div>

                  <!-- Modal footer -->
                  <div class="modal-footer">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                  </div>

                </div>
              </div>
            </div>
        </center>
    </body>
</html>
