package dev.sarq.projethooks.entities;


public class Pax {
		
	private String nom;
	private String prenom;
	private int age;
	
	public Pax(String nom, String prenom, int age) {
		
		 this.nom = nom;
	     this.prenom = prenom;
	     this.age = age;
	   
	}

	public void afficherPax() {
		
		System.out.println("Je suis " + nom + " " + prenom + " et j'ai " + age);
	}
  	
}