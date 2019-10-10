package PracticasScrum;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testMostrarUltimaLetra() {
	char resultado = ' ';
	resultado = Utilidades.mostrarUltimaLetra("Hola que tal");
		assertEquals(resultado, 'l');
		resultado = Utilidades.mostrarUltimaLetra("Hola que tal estas mi querido amigo");
		assertEquals(resultado, 'o');
	}

	@Test
	public void test() {

		assertEquals(22, Utilidades.contarVocales("Ejemplo de texto de prueba con valores mayUsculAs y mInuscUlas"));
		assertEquals(1, Utilidades.contarVocales("a"));
		assertEquals(2, Utilidades.contarVocales("ae"));
		assertNotEquals(0, Utilidades.contarVocales("a"));
		assertEquals(0, Utilidades.contarVocales("ccc"));

		assertEquals(5, Utilidades.contarVocales("cácécícócú"));
		assertEquals(5, Utilidades.contarVocales("CÁCÉCÍCÓCÚ"));

		assertEquals(5, Utilidades.contarLetrasA("aaaaa"));
		assertEquals(1, Utilidades.contarLetrasA("a"));
		assertEquals(0, Utilidades.contarLetrasA(""));
		assertEquals(2, Utilidades.contarLetrasA("aa"));
		assertEquals(2, Utilidades.contarLetrasA("Áa"));
		assertEquals(3, Utilidades.contarLetrasA("Áaá"));

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
