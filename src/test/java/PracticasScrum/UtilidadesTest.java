package PracticasScrum;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void test() {
		
		assertEquals(5,  Utilidades.contarLetrasA("aaaaa"));
		assertEquals(1,  Utilidades.contarLetrasA("a"));
		assertEquals(0,Utilidades.contarLetrasA(""));
		assertEquals(2,  Utilidades.contarLetrasA("aa"));
		
	}

}
