<%-- 
    Document   : getmess
    Created on : 07.02.2019, 13:59:39
    Author     : MultatulyIM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="my" tagdir="/WEB-INF/tags/" %>
<%@taglib prefix="auth" tagdir="/WEB-INF/tags/auth/" %>
<!DOCTYPE html>
<my:master>
    <jsp:attribute name="title">
        Message page
    </jsp:attribute>

    <jsp:body>
      
        <center>
            <auth:message>
                <jsp:attribute name="error">
                    ${requestScope.error}
                </jsp:attribute>
                
            </auth:message>
        </center>
        
    </jsp:body>    


</my:master>
