package com.octest.servlets;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SupprimerCours")
public class SupprimerCours extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public SupprimerCours() {
        super();
    }

    @Override
    public void init() throws ServletException {
    	super.init();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/supprimerCours.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Reception edt
		EDT edt = (EDT) getServletContext().getAttribute("edt");
		
		List<Cours> listeCours = edt.getCours();
		
		
		// Récupération de l'identifiant du cours à supprimer
        int idCours = Integer.parseInt(request.getParameter("id"));
        

        
        // Suppression du cours de la liste des cours
        edt.supprimerCours(edt.getCoursByID(idCours));
        

        request.getRequestDispatcher("/AfficherCours");
        
        // Redirection vers la page d'accueil
        response.sendRedirect(request.getContextPath() + "/afficherCours");
	}

}
