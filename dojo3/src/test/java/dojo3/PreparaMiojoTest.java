package dojo3;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PreparaMiojoTest {
	PreparaMiojo preparaMiojo;

	@Before
	public void setUp() {
		preparaMiojo = new PreparaMiojo();
	}

	@Test
	public void testaValidacaoDeNegocio() {
		Miojo miojo = new Miojo(3);
		Ampulheta a1 = new Ampulheta(2);
		Ampulheta a2 = new Ampulheta(7);

		try {
			preparaMiojo.contaTempo(miojo, a1, a2);
			fail();
		} catch (RuntimeException e) {
		}
	}

	@Test
	public void testaTempoPreparoIgualDiferenca() {
		Miojo miojo = new Miojo(3);
		Ampulheta a1 = new Ampulheta(7);
		Ampulheta a2 = new Ampulheta(5);

		assertEquals(0, preparaMiojo.contaTempo(miojo, a1, a2));
	}

	@Test
	public void testaTempoPreparoIgualDiferenca2() {
		Miojo miojo = new Miojo(3);
		Ampulheta a1 = new Ampulheta(8);
		Ampulheta a2 = new Ampulheta(5);

		assertEquals(0, preparaMiojo.contaTempo(miojo, a1, a2));
	}
}
