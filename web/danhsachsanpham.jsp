<%-- 
    Document   : danhsachsanpham
    Created on : Jul 12, 2017, 3:53:32 PM
    Author     : anh.leuduc.sv
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html-el" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    </head>
    <body>
        <table border="1">
            <tr>
                <th>
                    <td>a</td>
                    <td>b</td>
                    <td>c</td>
                    <td>d</td>
                </th>
            </tr>
        <c:forEach var="sp" items="${dssp}">
        <tr>
            <td>${sp.ma}</td>
            <td>${sp.tensp}</td>
            <td>${sp.gia}</td>
            <td>${sp.soluong}</td>
            <td><html:link action="sp.do?action=chitiet&masp=${sp.ma}">Chi tiet</html:link></td>
        </tr>
        </c:forEach>
                </table>

    </body>
</html>
