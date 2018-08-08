<%-- 
    Document   : UserInfo
    Created on : Aug 7, 2018, 5:42:48 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User information</title>           
    </head>
    <body>
       <form action="register" name="userinfo" method="post">
            <table>
                
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                <tr>
                    <td>First_name:</td>
                    <td><input type="text" name="firstname" ></td>
                </tr>
                    <td>Last_name:</td>
                    <td><input type="text" name="lastname"></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td>Country:</td>
                    <td><input type="text" name="country"></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td><input type="text" name="gender" ></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password"></td>
                </tr>
            </table>
                           
            
         <button type="submit" name="operation" value="Add"> register</button>
         <button type="submit" name="operation" value="Edit">Edit</button>
         <button type="submit" name="operation" value="Delete"> Delete </button>
        </form>
    </body>
</html>
