package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
@WebServlet("/AjouterCours")
public class AjouterCours extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AjouterCours() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/ajouterCours.jsp").forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recevoir l'attribut edt.
		EDT edt = (EDT) getServletContext().getAttribute("edt");
		
		// Récupération des données du formulaire
        String intitule = request.getParameter("intitule");
        String promotion = request.getParameter("promotion");
        String salle = request.getParameter("salle");
        String professeur = request.getParameter("professeur");
        String remarque = request.getParameter("remarque");
        int id = Integer.parseInt(request.getParameter("id"));
        String jour = request.getParameter("jour");
        String date = request.getParameter("date");
        int heure = Integer.parseInt(request.getParameter("heure"));
        int minute = Integer.parseInt(request.getParameter("minute"));
        
        
        

        // Création d'un nouvel objet Cours avec les données saisies
        Cours nouveauCours = new Cours(id, intitule, promotion, salle, professeur, remarque, jour, date, heure, minute);

        // Ajout du nouveau cours à la liste des cours
        edt.ajouterCours(nouveauCours);
        
        request.getRequestDispatcher("AfficherCours");

        // Redirection 
        response.sendRedirect(request.getContextPath() + "/afficherCours");
	}

}
