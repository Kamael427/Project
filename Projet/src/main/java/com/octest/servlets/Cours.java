package com.octest.servlets;

import java.util.*;

public class Cours {
	private int id;
	private String intitule;
	private String professeur;
	private String salle;
	private String promotion;
	private String remarque;
	private String jour;
	private String date;
	private int heure;
	private int minute;
	
	public Cours() {
		
	}
	
	public Cours(int id, String intitule, String promotion, String salle, String professeur, String remarque, String jour,String date, int heure, int minute) {
			this.id = id;
			this.intitule = intitule;
	        this.promotion = promotion;
	        this.salle = salle;
	        this.professeur = professeur;
	        this.remarque = remarque;
	        this.jour = jour;
	        this.date = date;
	        this.heure = heure;
	        this.minute = minute;
	}
	
	public void setIntitule (String i) {
		this.intitule = i;
	}
	
	public String getIntitule () {
		return intitule;
	}
	
	public void setPromotion (String p) {
		this.promotion = p;
	}
	
	public String getPromotion () {
		return promotion;
	}
	
	public void setSalle(String s) {
		this.salle = s;
	}
	
	public String getSalle() {
		return salle;
	}
	
	public void setProfesseur (String p) {
		this.professeur = p;
	}
	
	public String getProfesseur () {
		return professeur;
	}
	
	public void setRemarque(String r) {
		this.remarque = r;
	}
	
	public String getRemarque() {
		return remarque;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int i) {
		this.id = i;
	}
	
	public String getJour() {
		return jour;
	}
	
	public void setJour(String j) {
		this.jour = j;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String d) {
		this.date= d;
	}
	
	public int getHeure() {
		return heure;
	}
	
	public void setHeure(int h) {
		this.heure = h;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int m) {
		this.minute = m;
	}
	
	public String toString() {
		return "id : " + id + ", intitule : " + intitule + ", promotion : " + promotion + ", salle : " + salle + ", professeur : " + professeur + ", remarque : " + remarque + ", jour : " + jour + ", heure et minute : " + heure + ":" + minute;
		
	}
}
