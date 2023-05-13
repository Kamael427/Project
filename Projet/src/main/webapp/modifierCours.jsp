<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifier un cours</title>
</head>
<body>
	<h1>Modifier un cours</h1>
	<form method="post" action="ModifierCours">
		<label>ID du cours à modifier : <input type ="number" name="id" required></label><br>
        <label>Intitule : <input type ="text" name="intitule" ></label><br>
		<label>Promotion : <input type ="text" name="promotion" ></label><br>
		<label>Salle : <input type ="text" name="salle" ></label><br>
		<label>Professeur : <input type ="text" name="professeur" ></label><br>
		<label>Remarque : <input type ="text" name="remarque"></label><br>
		<label>Jour : <input type ="text" name="jour" ></label><br>
		<label>Date : <input type ="text" name="date" placeholder="JJ-MM-AAAA" ></label><br>
		<label>Heure : <input type ="number" name="heure" placeholder="0-24" ></label><br>
		<label>Jour : <input type ="number" name="minute" placeholder="0-60" ></label><br>
		
        <input type="submit" value="Modifier">
    </form>

</body>
</html>