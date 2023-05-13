package com.octest.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AfficherCours")
public class AfficherCours extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private EDT edt;

    public AfficherCours() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
    	edt = new EDT();
    	Cours cours001 = new Cours(1,"Info","L1","s2","Aaron Aaron","","Lundi","13-05-2023",8,00);
    	Cours cours002 = new Cours(2,"Prog","L1","s2","Aaron Aaron","","Lundi","13-05-2023",9,00);
    	Cours cours003 = new Cours(3,"Secu","L1","s2","Aaron Aaron","","Lundi","13-05-2023",10,00);
    	Cours cours004 = new Cours(4,"Info","L1","s2","Aaron Aaron","","Lundi","13-05-2023",11,00);
    	Cours cours005 = new Cours(5,"Info","L1","s2","Aaron Aaron","","Lundi","13-05-2023",12,00);


    	edt.ajouterCours(cours001);
    	edt.ajouterCours(cours002);
    	edt.ajouterCours(cours003);
    	edt.ajouterCours(cours004);
    	edt.ajouterCours(cours005);

    	getServletContext().setAttribute("edt", edt);
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Récupération de la liste des cours
		EDT edt = (EDT) getServletContext().getAttribute("edt");
        List<Cours> listeCours = edt.getCours();
        
        // Envoi de la liste des cours à la JSP
        request.setAttribute("listeCours", listeCours);
        request.getRequestDispatcher("/afficherCours.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
