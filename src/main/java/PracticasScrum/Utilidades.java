package PracticasScrum;

public class Utilidades {
	
	private final static char[] VOCALES = {
			'a','e','i','o','u',
			'A','E','I','O','U',
			'á', 'é', 'í','ó','ú',
			'Á','É','Í','Ó','Ú' };
	
	void hola() {
	
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
}
