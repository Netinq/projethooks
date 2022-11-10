package dev.sarq.projethooks.entities;

import dev.sarq.projethooks.abstracts.Pax;

public class Perception {
	
	@SuppressWarnings("unused")
	private boolean isReintegrer;
	public FAMAS famas;
	public HK416 hk416;
	public Pax pax;
	
	public Perception(FAMAS famas, HK416 hk416, Pax pax) {
		this.famas = famas;
		this.hk416 = hk416;
		this.pax = pax;
		this.isReintegrer = false;
	}
	
	public void reintegrer() {
		this.isReintegrer = true;
	}
}
