package PracticasScrum;

public class Utilidades {
	

	private final static char[] VOCALES = {'a','e','i','o','u','A','E','I','O','U','�', '�', '�','�','�','�','�','�','�','�' };
	


	public static char mostrarUltimaLetra() {
		
		return ' ';
	}


	void hola() {
	
	}
	
	public static int contarLetrasA(String texto) {
		int contador=0;
		
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i)=='a'|| texto.charAt(i)== 'A') {
				 contador ++;
			}
		}
		return contador;
		
	}

	String saluda(){
		return "Hola";
	}


	public static int contarVocales( String txt ) {
		int contador = 0;
		for(int i=0; i<txt.length(); i++) {
			for( int x=0; x < VOCALES.length; x++) {
				if(txt.charAt(i) == VOCALES[x]) {
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

	public static boolean caracteresPares(String texto) {
		
		boolean pares = false;
		String textoSinEspacios=texto.replaceAll("\\s","");
		
		if(textoSinEspacios.length()%2==0) {
			pares=true;
		}
		
		return pares;
		
	}
	

}
