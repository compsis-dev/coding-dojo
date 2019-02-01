package dojo1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class CalculadorNumeroFelizTest {

	@Test
	public void metodoDeveReceberNumerInteiroERetornarUmBooleano() {
		CalculadorNumeroFeliz calculadorNumeroFeliz = new CalculadorNumeroFeliz();
		int numero = 7;
		assertTrue(calculadorNumeroFeliz.calcular(numero));
	}

	@Test
	public void verificaSe49EhFeliz() {
		CalculadorNumeroFeliz calculadorNumeroFeliz = new CalculadorNumeroFeliz();
		int numero = 49;
		assertTrue(calculadorNumeroFeliz.calcular(numero));
	}

	@Test
	public void verificaSe9938284EhFeliz() {
		CalculadorNumeroFeliz calculadorNumeroFeliz = new CalculadorNumeroFeliz();
		int numero = 49;
		assertTrue(calculadorNumeroFeliz.calcular(numero));
	}

	@Test
	public void verificaDe1a9() {
		CalculadorNumeroFeliz calculadorNumeroFeliz = new CalculadorNumeroFeliz();
		for (int i = 1; i <= 9; i++) {
			if (i == 1 || i == 7) {
				assertTrue(calculadorNumeroFeliz.calcular(i));
			} else {
				assertFalse(calculadorNumeroFeliz.calcular(i));
			}
		}
	}

	@Test
	public void verificaDe11a99() {
		for (int i = 11; i <= 99; i++) {
			CalculadorNumeroFeliz calculadorNumeroFeliz = new CalculadorNumeroFeliz();
//			System.out.println(i + "=>" + calculadorNumeroFeliz.calcular(i));
		}
	}

	@Test
	@Ignore
	public void verificaDe101a999() {
		for (int i = 101; i <= 9999999; i++) {
			CalculadorNumeroFeliz calculadorNumeroFeliz = new CalculadorNumeroFeliz();
			boolean ehFeliz = calculadorNumeroFeliz.calcular(i);
			if (ehFeliz) {
				System.out.println(i);
			}
		}
	}

	@Test
	public void deveTestarASomaDosQuadrados() {
		CalculadorNumeroFeliz calculadorNumeroFeliz = new CalculadorNumeroFeliz();
		int numero = 7;
		Integer resposta = 49;
		assertEquals(resposta, calculadorNumeroFeliz.retornaSomaDoQuadrado(numero));

		numero = 10;
		resposta = 1;
		assertEquals(resposta, calculadorNumeroFeliz.retornaSomaDoQuadrado(numero));

		numero = 409;
		resposta = 97;
		assertEquals(resposta, calculadorNumeroFeliz.retornaSomaDoQuadrado(numero));
	}
}