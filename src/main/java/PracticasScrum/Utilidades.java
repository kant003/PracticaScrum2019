package PracticasScrum;

import java.io.File;

public class Utilidades {


		public static char mostrarPrimeraletra(String texto) {
			return texto.charAt(0);
		}


	
	private final static String NOMBRE_FICHERO = "historial.txt";
	
	public static void eliminarHistorial() {
		try {
		File f = new File (NOMBRE_FICHERO);
		f.delete();
		}catch(Exception e){
			System.out.println("El archivo no existe");
		}
	}
	

	public static char mostrarUltimaLetra(String texto) {

		return texto.charAt(texto.length()-1);
	}

	void hola() {

	}

	public static int contarLetrasA(String texto) {
		int contador = 0;

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A' || texto.charAt(i) == 'á' || texto.charAt(i) == 'Á') {
				contador++;
			}
		}
		return contador;

	}

	String saluda() {
		return "Hola";
	}

	public static int contarVocales(String txt) {
		final char[] VOCALES = {
				'a','e','i','o','u',
				'á','é','í','ó','ú',
				'à','è','ì','ò','ù',
				'ä','ë','ï','ö','ü',
				'ã','õ',
				'A','E','I','O','U',
				'Á','É','Í','Ó','Ú',
				'À','È','Ì','Ò','Ù',
				'Ä','Ë','Ï','Ö','Ü',
				'Ã','Õ'};

		int contador = 0;
		for (int i = 0; i < txt.length(); i++) {
			for (int x = 0; x < VOCALES.length; x++) {
				if (txt.charAt(i) == VOCALES[x]) {
					contador++;
					break;
				}
			}
		}
		return contador;
	}

	public static String textoMinuscula(String texto) {

		return texto.toLowerCase();

	}
	
	public static String quitaEspacios(String frase) {

		return frase.replace(" ", "");

	}

	public static boolean caracteresPares(String texto) {

		String textoSinEspacios = texto.replaceAll("\\s", "");

		return textoSinEspacios.length() % 2 == 0;

	}
	
	public static String tipoCaracter(String cadena) {

		int contNum = 0;
		int contLetra = 0;

		cadena = cadena.replace(" ", "");

		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			if (Character.isDigit(letra)) {
				contNum++;
			} else if (Character.isLetter(letra)) {
				contLetra++;
			}
		}

		if (cadena.length() == contNum) {
			return "La frase solo contiene caracteres numéricos";
		} else if (cadena.length() == contLetra) {
			return "La frase solo contiene letras";
		} else if (cadena.length() == (contLetra + contNum)) {
			return "La frase esta formada por caracteres alfanuméricos";
		}else {
			return "";
		}
	}

	
	public static int extensionDeCaracteres(String texto ) {
		int longitud = 0;
		String extensionCaracteres= texto.replaceAll("\\s", "");
		for(int i=0;i<extensionCaracteres.length();i++) {
			longitud++;
		}
		
		return longitud;
	}
	
	public static int porcentajeDeletrasA(String frase){
		return (contarLetrasA(frase)*100)/extensionDeCaracteres(frase);
	}

}
