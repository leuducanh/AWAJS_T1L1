<%-- 
    Document   : index
    Created on : Jul 12, 2017, 8:40:16 AM
    Author     : anh.leuduc.sv
--%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <html:link href="hienthi.jsp">Hien thi</html:link>
        <html:link action="hello.do?page=hienthi">hienthi</html:link> |
        <html:link action="hello.do?page=tintuc">tintuc</html:link>
        <html:link action="sp.do?action=dssp">Danh sach san pham</html:link>
    </body>
</html>
