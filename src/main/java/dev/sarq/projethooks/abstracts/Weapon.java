package dev.sarq.projethooks.abstracts;

public abstract class Weapon {

	private String name;
	private int calibre;
	private int maxMunition;
	private int munitions;
	
	public Weapon(String name, int calibre, int maxMunition, int munitions) {
		this.name = name;
		this.calibre = calibre;
		this.maxMunition = maxMunition;
		this.munitions = munitions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalibre() {
		return calibre;
	}

	public void setCalibre(int calibre) {
		this.calibre = calibre;
	}

	public int getMaxMunition() {
		return maxMunition;
	}

	public void setMaxMunition(int maxMunition) {
		this.maxMunition = maxMunition;
	}

	public int getMunitions() {
		return munitions;
	}

	public void setMunitions(int munitions) {
		this.munitions = munitions;
	}
	
	public void shoot() {
		if (this.munitions > 0) {
			System.out.println("PAN !");
			this.munitions--;
		} else {
			System.out.println("CLIC !");
		}
	}
}
