<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="header.jsp" %>
<p></p>
<div class="container">
<div class="card">
 <div class="card-header">
 Confirmation Ajout Parfum
 </div>
 <div class="card-body">
 
 <div class="form-group">
 <label class="control-label">ID :</label>
 <input readonly type="text" name="id" class="form-control" value="${parfum.idParfum}" />
 <label class="control-label">Nom Parfum :</label>
 <input type="text" name="Nom" class="form-control"
value="${parfum.nomParfum }"/>
 </div>
 <div class="control-label">
 <label class="control-label">Marque :</label>
 <input type="text" name="marque" class="form-control"
value="${parfum.marque}"/>
</div>
 <div class="control-label">
 <label class="control-label">Prix :</label>
 <input type="text" name="Prix" class="form-control"
value="${parfum.prix }"/>
 </div>
 </div>
 
 </div>
</div>
</body>
</html>