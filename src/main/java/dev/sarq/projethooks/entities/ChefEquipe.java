package dev.sarq.projethooks.entities;
import dev.sarq.projethooks.abstracts.Pax;
import dev.sarq.projethooks.enums.Grades;

public class ChefEquipe extends Pax{
	
	public ChefEquipe(String nom, String prenom, int age, Grades grade) {
		super(nom, prenom, age, grade);
	}
	
	public static void OrdreDeDéplacement(String pointAtteindre,String itinéraire,String formation) {
		
		System.out.println("Le point à atteindre est " + pointAtteindre + itinéraire + " en " + formation);
	}
}
