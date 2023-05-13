<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Supprimer un cours</title>
</head>
<body>
    <h1>Supprimer un cours</h1>

    <form method="post" action="SupprimerCours">
        <label for="id">ID du cours à supprimer :</label>
        <input type="number" id="id" name="id" required><br>
        <input type="submit" value="Supprimer">
    </form>

<!--    <br>

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
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cours" items="${listeCours}">
                <tr>
                    <td>${cours.id}</td>
                    <td>${cours.intitule}</td>
                    <td>${cours.promotion}</td>
                    <td>${cours.salle}</td>
                    <td>${cours.professeur}</td>
                    <td>${cours.remarque}</td>
                    <td>${cours.date}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
-->
</body>
</html>