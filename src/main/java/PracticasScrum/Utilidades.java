package PracticasScrum;

public class Utilidades {

	public static boolean caracteresPares(String texto) {
		
		boolean pares = false;
		String textoSinEspacios=texto.replaceAll("\\s","");
		
		if(textoSinEspacios.length()%2==0) {
			pares=true;
		}
		
		return pares;
		
	}
	
}
