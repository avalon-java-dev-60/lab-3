<%-- 
    Document   : message
    Created on : 07.02.2019, 14:25:32
    Author     : MultatulyIM
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="my" tagdir="/WEB-INF/tags/auth/" %>

<%@attribute name="error" %>

<c:if test="${not empty error}">
    <my:error message="${error}"/>  
</c:if>

<form method="post" action="getMessage">
    
    <button>Get Message</button>
</form>