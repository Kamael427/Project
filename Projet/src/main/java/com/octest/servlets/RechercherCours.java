package com.octest.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RechercherCours")
public class RechercherCours extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RechercherCours() {
        super();
    }

    @Override
    public void init() throws ServletException {
    	super.init();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/rechercherCours.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EDT edt = (EDT) getServletContext().getAttribute("edt");
        //List<Cours> listeCours = edt.getCours();
		
		// Récupération de l'intitulé à rechercher
        String intitule = request.getParameter("intitule");

        if(intitule != null) {
        	
	        List<Cours> coursTrouver = edt.getCoursByIntitule(intitule);
	        request.setAttribute("coursTrouver", coursTrouver);
        
        }
        
        request.getRequestDispatcher("/rechercherCours.jsp").forward(request, response);;

        
	}

        
}

