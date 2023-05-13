<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter un Cours</title>
</head>
<body>
	<h1>Ajouter un cours</h1>
	<form method="post" action="${pageContext.request.contextPath}/AjouterCours">
		<label>ID : <input type ="number" name="id" required></label><br>
		<label>Intitule : <input type ="text" name="intitule" required></label><br>
		<label>Promotion : <input type ="text" name="promotion" required></label><br>
		<label>Salle : <input type ="text" name="salle" required></label><br>
		<label>Professeur : <input type ="text" name="professeur" required></label><br>
		<label>Remarque : <input type ="text" name="remarque"></label><br>
		<label>Jour : <input type ="text" name="jour" required></label><br>
		<label>Date : <input type ="text" name="date" placeholder="JJ-MM-AAAA" required></label><br>
		<label>Heure : <input type ="number" name="heure" required></label><br>
		<label>Minute : <input type ="number" name="minute" required></label><br>
		<input type="submit" value="ajouter">
	</form>
<!--	<c:if test="${not empty message}">
		<p>${message}</p>
	</c:if>
	  -->
</body>
</html>	
