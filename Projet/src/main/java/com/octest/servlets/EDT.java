package com.octest.servlets;

import java.util.*;

public class EDT {
	private List<Cours> edt;
	
	public EDT() {
		edt = new ArrayList<>();
	}
	
	//Ajouter un cours dans l'EDT
	public void ajouterCours(Cours c) {
		edt.add(c);
	}
	
	//Supprimer un cours de l'EDT
	public void supprimerCours(Cours c) {
		edt.remove(c);
	}
	
	//Donne la liste de cours
	public List<Cours> getCours(){
		return edt;
	}
	
	//Update un cours selon son ID
	public void updateCours(Cours c) {
		for (int i = 0; i< edt.size(); i++) {
			if (edt.get(i).getId() == c.getId()) {
				edt.set(i, c);
				break;
			}
		}
	}
	
	//Recoit une liste de cours si même nom
	public List<Cours> getCoursByIntitule(String t){
		List<Cours> result = new ArrayList<>();
		for(Cours c : edt) {
			if (c.getIntitule().equals(t)) {
				result.add(c);
			}
		}
		return result;
	}
	
	//Donne liste de cours d'une date précise
	public List<Cours> getCoursByDate(String date, String jour, int heure, int minute){
		List<Cours> result = new ArrayList<>();
		for (Cours c : edt) {
			if (c.getJour().equals(jour) && c.getDate().equals(date) && c.getHeure() == heure && c.getMinute() == minute) {
				result.add(c);
			}
		}
		return result;
	}
	
	
	//Donne cours selon ID.
	public Cours getCoursByID(int id){
		Cours result = new Cours();
		for (Cours c : edt) {
			if (c.getId() == id) {
				result = c;
				break;
			}
		}
		return result;
	}


}
	

