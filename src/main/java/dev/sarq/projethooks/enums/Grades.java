package dev.sarq.projethooks.enums;

public enum Grades {
	
	MAJ("Major"),
	ADC("Adjudant-Chef"),
	ADJ("Adjudant"),
	SCH("Sergent-Chef"),
	SGT("Sergent"),
	
	CCH("Caporal-Chef"),
	CPL("Caporal"),
	SDT("Soldat");

	private String name;
	
	Grades(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
