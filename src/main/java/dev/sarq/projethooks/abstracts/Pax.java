package dev.sarq.projethooks.abstracts;

import dev.sarq.projethooks.enums.Grades;

public abstract class Pax {
		
	private String nom;
	private String prenom;
	private int age;
	private Grades grade;
	
	public Pax(String nom, String prenom, int age, Grades grade) {
		
		 this.nom = nom;
	     this.prenom = prenom;
	     this.age = age;
	     this.grade = grade;
	   
	}

	public void afficherPax() {
		
		System.out.println("Je suis " + nom + " " + prenom + " et j'ai " + age);
	}
  	
}