package dev.sarq.projethooks.entities;
import dev.sarq.projethooks.abstracts.Pax;
import dev.sarq.projethooks.enums.Grades;

public class ChefDeGroupe extends Pax {

	public ChefDeGroupe(String nom, String prenom, int age, Grades grade) {
		super(nom, prenom, age, grade);
	}

	public void lancerGrenade(int distance, int nombre, String objectif, String feu) {
		
		System.out.println("Lancer de " + nombre + " grenades sur " + objectif + " à " + distance + "m " + feu);
	}
}
