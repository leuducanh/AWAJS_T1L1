<%-- 
    Document   : loginjsp
    Created on : Jul 12, 2017, 2:45:39 PM
    Author     : anh.leuduc.sv
--%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html-el" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <br>${message}
        <html:form method="post" action="login">
            Username <html:text property="username"></html:text><br>
            Password <html:password property="password"></html:password><br>
            <html:submit value="login"></html:submit>
        </html:form>
    </body>
</html>
