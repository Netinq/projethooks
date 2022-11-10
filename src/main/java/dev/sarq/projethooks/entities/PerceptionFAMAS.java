package dev.sarq.projethooks.entities;

import dev.sarq.projethooks.abstracts.Pax;

public class PerceptionFAMAS {
	
	@SuppressWarnings("unused")
	private boolean isReintegrer;
	public FAMAS famas;
	public Pax pax;
	
	public PerceptionFAMAS(FAMAS famas, Pax pax) {
		this.famas = famas;
		this.pax = pax;
		this.isReintegrer = false;
	}
	
	public void reintegrer() {
		this.isReintegrer = true;
	}
}
