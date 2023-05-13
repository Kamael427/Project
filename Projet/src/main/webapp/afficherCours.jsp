<%@page import="java.util.*"%>
<%@page import="com.octest.servlets.Cours"%>
<%@page import="com.octest.servlets.EDT"%>
<%@page import="java.time.*" %>
<%@page import="java.text.SimpleDateFormat" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des cours</title>
</head>
<body>
    <%
    // Récupération de l'EDT
    EDT edt = (EDT) request.getServletContext().getAttribute("edt");

    // Récupération de la semaine courante
    Calendar cal = Calendar.getInstance();
    int week = cal.get(Calendar.WEEK_OF_YEAR);
    int year = cal.get(Calendar.YEAR);

    // Récupération des cours de la semaine
    List<Cours> listeCours = new ArrayList<>();
    for (Cours c : edt.getCours()) {
        Calendar date = Calendar.getInstance();
        Date d = new SimpleDateFormat("dd-MM-yyyy").parse(c.getDate());
        date.setTime(d);
        if (date.get(Calendar.WEEK_OF_YEAR) == week && date.get(Calendar.YEAR) == year) {
            listeCours.add(c);
        }
    }
%>
	<h1>EDT</h1>
	<table>
	    <thead>
	        <tr>
	            <th>Jour</th>
	            <th>Date</th>
	            <th>Heure</th>
	            <th>Intitulé</th>
	            <th>Professeur</th>
	            <th>Salle</th>
	            <th>Promotion</th>
	            <th>ID</th>
	            <th>Remarque</th>
	        </tr>
	    </thead>
	    <tbody>
	    <% for (Cours c : listeCours) { %>
	        <tr>
	            <td><%= c.getJour() %></td>
	            <td><%= c.getDate() %></td>
	            <td><%= c.getHeure() %>:<%= c.getMinute() %></td>
	            <td><%= c.getIntitule() %></td>
	            <td><%= c.getProfesseur() %></td>
	            <td><%= c.getSalle() %></td>
	            <td><%= c.getPromotion() %></td>
	            <td><%= c.getId() %></td>
	            <td><%= c.getRemarque() %></td>
	        </tr>
	    <% } %>
	    </tbody>
	</table>
    <!--  <table>
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
            <c:forEach var="cours" items="${listeCours}">
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
    -->
 <!-- 
    <style>
    	.bottomButton{
    		display: inline-block;
    		magin-right: 10px;
    		position: fixed;
    		left: 0;
    		bottom: 0;
    		width: 100%;
    		background-color: #f1f1f1;
    		text-align: center;
    		padding: 10px 0;
    		}
    </style>
	<div class="bottomButton">
    	<form action="ajouterCours.jsp" value="page 1">
    		<button type ="submit">Ajouter un cours</button>
    	</form>
    	
    	<form action="supprimerCours.jsp" value="page 2">
    		   <button type ="submit">Supprimer un cours</button>
    	</form>
    	
    </div>
 -->   
    
</body>
</html>