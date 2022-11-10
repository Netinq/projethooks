package dev.sarq.projethooks.entities;

import dev.sarq.projethooks.abstracts.Pax;

public class PerceptionHK416 {
	
	@SuppressWarnings("unused")
	private boolean isReintegrer;
	public HK416 hk416;
	public Pax pax;
	
	public PerceptionHK416(HK416 hk416, Pax pax) {
		this.hk416 = hk416;
		this.pax = pax;
		this.isReintegrer = false;
	}
	
	public void reintegrer() {
		this.isReintegrer = true;
	}
}
