package dev.sarq.projethooks.entities;

import dev.sarq.projethooks.abstracts.Weapon;

public class FAMAS extends Weapon {
	
	@SuppressWarnings("unused")
	private boolean bipied;

	public FAMAS(String name, int calibre, int maxMunition, int munitions) {
		super(name, calibre, maxMunition, munitions);
		this.bipied = false;
	}
	
	public void sortirBipied() {
		this.bipied = true;
	}
	
	public void rangerBipied() {
		this.bipied = false;
	}

}
