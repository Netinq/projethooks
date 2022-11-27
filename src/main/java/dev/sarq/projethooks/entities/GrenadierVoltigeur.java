package dev.sarq.projethooks.entities;
import dev.sarq.projethooks.abstracts.Pax;
import dev.sarq.projethooks.enums.Grades;

public class GrenadierVoltigeur extends Pax {

	public GrenadierVoltigeur(String nom, String prenom, int age, Grades grade) {
		super(nom, prenom, age, grade);
		
		
	}

	public static void RendreCompte(String nature,int volume,String attitude,int distance) {
		
		System.out.println("Je vois " + volume + " " + nature + " " + attitude + " à " + distance);
	}
}
