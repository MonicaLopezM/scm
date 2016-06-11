package co.edu.usbcali.scm;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.usbcali.scm.Calculadora;
import co.edu.usbcali.scm.CalculadoraImpl;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora c = new CalculadoraImpl();
		c.sumar(4,4);
		assertTrue(c.getResultado()==8);
	}

	@Test
	public void testRestar() {
		Calculadora c = new CalculadoraImpl();
		c.restar(4,4);
		assertTrue(c.getResultado()==0);
	}

}
