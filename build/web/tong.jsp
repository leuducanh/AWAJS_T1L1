<%-- 
    Document   : tong
    Created on : Jul 12, 2017, 3:19:41 PM
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
        
        <html:form method="post" action="tong">
            So 1<html:text property="a"></html:text><br>
            So 2<html:text property="b"></html:text><br>
            Ket qua ${ketqua}<br>
            <html:submit value="Tong"></html:submit>
        </html:form>
    </body>
</html>
