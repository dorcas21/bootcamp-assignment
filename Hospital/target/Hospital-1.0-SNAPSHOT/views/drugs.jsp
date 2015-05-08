<%--
  Created by IntelliJ IDEA.
  User: kinyua
  Date: 5/7/15
  Time: 11:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>
<html>
<head>
    <title></title>
</head>
<c:if test="${not empty error}">
  <div class="error">${error}</div>
</c:if>
<c:if test="${not empty msg}">
  <div class="msg">${msg}</div>
</c:if>
<body>
<form action="<c:url value='/enterDrug' />" method='POST'>
<input type="text" placeholder="patient name" name="pname" >
<input type="text" placeholder="drug name" name="dname" >
<button> enterDrug </button>
</form>
</body>
</html>
