package dev.sarq.projethooks;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import dev.sarq.projethooks.entities.HK416;

public class TestWeapon {
	
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@Before
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Test
	public void pan() {
		final HK416 hk416 = new HK416("HK416", 556, 30, 5);
		hk416.shoot();
		assertEquals("PAN !", outputStreamCaptor.toString().trim());
	}
	
	@Test
	public void clic() {
		final HK416 hk416 = new HK416("HK416", 556, 30, 0);
		hk416.shoot();
		assertEquals("CLIC !", outputStreamCaptor.toString().trim());
	}
}
