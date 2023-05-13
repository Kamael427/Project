<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rechercher un cours</title>
</head>
<body>
    <h1>Recherche de cours</h1>

    <form method="post" action="rechercherCours">
		<label>Cours à rechercher : <input type ="text" name="intitule" required></label><br>
        <input type="submit" value="Chercher">
    </form>

	<br>

    <h2>Liste des cours</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Intitulé</th>
                <th>Promotion</th>
                <th>Salle</th>
                <th>Professeur</th>
                <th>Remarque</th>
                <th>Date</th>
                <th>Jour</th>
                <th>Heure</th>
                <th>Minute</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cours" items="${coursTrouver}">
                <tr>
                    <td>${cours.id}</td>
                    <td>${cours.intitule}</td>
                    <td>${cours.promotion}</td>
                    <td>${cours.salle}</td>
                    <td>${cours.professeur}</td>
                    <td>${cours.remarque}</td>
                    <td>${cours.date}</td>
                    <td>${cours.jour}</td>
                    <td>${cours.heure}</td>
                    <td>${cours.minute}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>