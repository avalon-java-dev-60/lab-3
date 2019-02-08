<%-- 
    Document   : login
    Created on : 07.02.2019, 12:23:21
    Author     : MultatulyIM
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="my" tagdir="/WEB-INF/tags/auth/" %>

<%@attribute name="login" %>
<%@attribute name="error" %>
<%@attribute name="password"%>>

<c:if test="${not empty error}">
    <my:error message="${error}"/>  
</c:if>

<form method="post" action="comserv">
    <label>Login</label> <br>
    <input type="text" name="login" value="${login}"/>
    <br/>
    <label>Password</label> <br>
    <input type="password" name="password"/>
    <br>
    <button>Sign in</button>
</form>