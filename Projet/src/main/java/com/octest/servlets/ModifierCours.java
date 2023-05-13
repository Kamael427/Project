package com.octest.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ModifierCours")
public class ModifierCours extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ModifierCours() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	super.init();

    }
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("modifierCours.jsp").forward(request, response);

    }
    	

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	//REcup edt
		EDT edt = (EDT) getServletContext().getAttribute("edt");

    	//Récuperer la liste des cours.
    	List<Cours> listeCours = edt.getCours();
    	
    	//Récuperer l'id du cours à modifier.
    	int idCours = Integer.parseInt(request.getParameter("id"));
    	
        // Chercher le cours correspondant à l'id dans la liste des cours
    	Cours cours = new Cours();
        for (Cours c : listeCours) {
            if (c.getId() == idCours) {
                cours = c;
                break;
            }
        }
        

        if (cours != null) {
            // Modifier les propriétés du cours avec les nouvelles valeurs si modifications.
        	if (request.getParameter("intitule") != "") {
        		cours.setIntitule(request.getParameter("intitule"));
        	}
        	if (request.getParameter("promotion") != "") {
        		cours.setPromotion(request.getParameter("promotion"));
        	}
        	if (request.getParameter("salle") != "") {
        		cours.setSalle(request.getParameter("salle"));
        	}
        	if (request.getParameter("professeur") != "") {
        		cours.setProfesseur(request.getParameter("professeur"));
        	}
        	if (request.getParameter("remarque") != "") {
        		cours.setRemarque(request.getParameter("remarque"));
        	}
        	if (request.getParameter("id") != "") {
        		cours.setId(Integer.parseInt(request.getParameter("id")));
        	}
        	if (request.getParameter("jour") != "") {
        		cours.setJour(request.getParameter("jour"));
        	}
        	
        	if (request.getParameter("date") != "") {
        		cours.setJour(request.getParameter("date"));
        	}
        	if (request.getParameter("heure") != "") {
        		cours.setHeure(Integer.parseInt(request.getParameter("heure")));
        	}
        	if (request.getParameter("min") != null) {
        		cours.setMinute(Integer.parseInt(request.getParameter("min")));
        	}
           
        }
        
        edt.updateCours(cours);
        
        request.getRequestDispatcher("/AfficherCours");
        
        // Redirection vers la page d'accueil
        response.sendRedirect(request.getContextPath() + "/afficherCours");
    }
}
