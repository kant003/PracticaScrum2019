package PracticasScrum;

public class Utilidades {
	

	public static char mostrarUltimaLetra() {
		
		return ' ';
	}

	void hola() {
	
	}

	String saluda(){
		return "Hola";
	}


	public static boolean caracteresPares(String texto) {
		
		boolean pares = false;
		String textoSinEspacios=texto.replaceAll("\\s","");
		
		if(textoSinEspacios.length()%2==0) {
			pares=true;
		}
		
		return pares;
		
	}
	
	public static int extensionDeCaracteres(String texto ) {
		int longitud = 0;
		String extensionCaracteres= texto.replaceAll("\\s", "");
		for(int i=0;i<extensionCaracteres.length();i++) {
			longitud++;
		}
		
		return longitud;
	}
	
}
