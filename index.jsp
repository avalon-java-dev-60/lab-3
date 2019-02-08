<%-- 
    Document   : index
    Created on : 07.02.2019, 12:10:08
    Author     : MultatulyIM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="my" tagdir="/WEB-INF/tags/" %>
<%@taglib prefix="auth" tagdir="/WEB-INF/tags/auth/" %>
<!DOCTYPE html>
<my:master>
    <jsp:attribute name="title">
        Home page
    </jsp:attribute>

    <jsp:body>
      
        <center>
            <auth:login>
                <jsp:attribute name="login">
                    ${requestScope.login}
                </jsp:attribute>
                <jsp:attribute name="password">
                    ${requestScope.password}
                </jsp:attribute>
            </auth:login>
        </center>
        
    </jsp:body>    


</my:master>
