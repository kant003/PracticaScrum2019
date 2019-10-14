package PracticasScrum;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testMostrarPrimeraLetra() {
		char resultado=' ';
		resultado=Utilidades.mostrarPrimeraletra("Buenas tardes");
		assertEquals(resultado,'B');
		resultado=Utilidades.mostrarPrimeraletra("Maricarmen");
		assertEquals(resultado,'M');
  }
  
  @Test
	public void testMostrarUltimaLetra() {
	char resultado = ' ';
	resultado = Utilidades.mostrarUltimaLetra("Hola que tal");
		assertEquals(resultado, 'l');
		resultado = Utilidades.mostrarUltimaLetra("Hola que tal estas mi querido amigo");
		assertEquals(resultado, 'o');
	}

	@Test
	public void testContarVocales() {

		assertEquals(22, Utilidades.contarVocales("Ejemplo de texto de prueba con valores mayUsculAs y mInuscUlas"));
		assertEquals(1, Utilidades.contarVocales("a"));
		assertEquals(5, Utilidades.contarVocales("aeiou"));
		assertNotEquals(0, Utilidades.contarVocales("a"));
		assertEquals(5, Utilidades.contarVocales("abcdefghijklmnñopqrstuvwxyz"));
		assertEquals(5, Utilidades.contarVocales("ABCDEFGHIJKLMNÑOPQRSTUVQXYZ"));

		assertEquals(5, Utilidades.contarVocales("áéíóú"));
		assertEquals(5, Utilidades.contarVocales("ÁÉÍÓÚ"));

		assertEquals(5, Utilidades.contarVocales("àèìòù"));
		assertEquals(5, Utilidades.contarVocales("ÁÉÍÓÚ"));
		
		assertEquals(5, Utilidades.contarVocales("äëïöü"));
		assertEquals(5, Utilidades.contarVocales("ÄËÏÖÜ"));
		
		assertEquals(4, Utilidades.contarVocales("ãõÃÕ"));
	}

	@Test
	public void testearMinusculas() {
		assertEquals("abcdefg", Utilidades.textoMinuscula("ABCDEFG"));
		assertEquals("111aa1", Utilidades.textoMinuscula("111Aa1"));
		assertEquals("ñññ", Utilidades.textoMinuscula("ÑÑÑ"));
		assertEquals("áéíóú", Utilidades.textoMinuscula("ÁÉÍÓÚ"));

	}

	@Test
	public void testCaracteresPares() {

		assertTrue(Utilidades.caracteresPares("Cadena con caracteres pares"));
		// Mismo texto con espacios intercalados que deberan ser obviados
		assertTrue(Utilidades.caracteresPares("Cadena     con      caracteres    pares"));
		assertFalse(Utilidades.caracteresPares("Cadena con caracteres impares."));
		// Mismo texto con espacios intercalados que deberan ser obviados
		assertFalse(Utilidades.caracteresPares("Cadena        con   caracteres    impares."));

	}

	@Test
	public void testExtensionCaracteres() {
		assertEquals(10, Utilidades.extensionDeCaracteres("Cabra al sol"));
		assertEquals(10, Utilidades.extensionDeCaracteres("Cab   ra  a  l    sol"));
	}

}
