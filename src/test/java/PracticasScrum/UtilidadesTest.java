package PracticasScrum;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void test() {

		assertEquals(22, Utilidades.contarVocales(
				"Ejemplo de texto de prueba con valores mayUsculAs y mInuscUlas"
				));
		assertEquals(1, Utilidades.contarVocales("a"));
		assertEquals(2, Utilidades.contarVocales("ae"));
		assertNotEquals(0, Utilidades.contarVocales("a"));
		assertEquals(0, Utilidades.contarVocales("ccc"));
		assertEquals(5, Utilidades.contarVocales("c�c�c�c�c�"));
		assertEquals(5, Utilidades.contarVocales("c�c�c�c�c�"));

		assertEquals("abcdefg", Utilidades.textoMinuscula("ABCDEFG"));
		assertEquals("111aa1", Utilidades.textoMinuscula("111Aa1"));
		assertEquals("ñññ", Utilidades.textoMinuscula("ÑÑÑ"));
		assertEquals("áéíóú", Utilidades.textoMinuscula("ÁÉÍÓÚ"));
		
		assertEquals(5,  Utilidades.contarLetrasA("aaaaa"));
		assertEquals(1,  Utilidades.contarLetrasA("a"));
		assertEquals(0,Utilidades.contarLetrasA(""));
		assertEquals(2,  Utilidades.contarLetrasA("aa"));
		

	}

}
