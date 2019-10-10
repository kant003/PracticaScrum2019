package PracticasScrum;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testMostrarpRIMERALetra() {
		char resultado=' ';
		resultado=Utilidades.mostrarPrimeraletra("Buenas tardes");
		assertEquals(resultado,'B');
		resultado=Utilidades.mostrarPrimeraletra("Maricarmen");
		assertEquals(resultado,'M');
	}

}
