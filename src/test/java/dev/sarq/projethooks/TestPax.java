package dev.sarq.projethooks;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dev.sarq.projethooks.entities.ChefDeGroupe;
import dev.sarq.projethooks.entities.ChefEquipe;
import dev.sarq.projethooks.entities.GrenadierVoltigeur;
import dev.sarq.projethooks.enums.Grades;

public class TestPax {
	
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@Before
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Test
	public void afficherPax() {
		final GrenadierVoltigeur pax = new GrenadierVoltigeur("MEHA", "Jathursan", 20, Grades.SDT);
		pax.afficherPax();
        assertEquals("Je suis MEHA Jathursan et j'ai 20", outputStreamCaptor.toString().trim());
	}

	@Test
	public void ordreDeDeplacement() {
		final ChefEquipe cde = new ChefEquipe("SAR", "Quentin", 20, Grades.CPL);
		cde.ordreDeDeplacement("le poteau bleu", "par la piste", "ligne");
        assertEquals("Le point à atteindre est le poteau bleu par la piste en ligne", outputStreamCaptor.toString().trim());
	}

	@Test
	public void lancerGrenade() {
		final ChefDeGroupe cdg = new ChefDeGroupe("DUPON", "Léo", 20, Grades.SGT);
		cdg.lancerGrenade(50, 5, "le tank", "feu !");
        assertEquals("Lancer de 5 grenades sur le tank à 50m feu !", outputStreamCaptor.toString().trim());
	}

}
