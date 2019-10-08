package PracticasScrum;

import java.io.File;

public class Utilidades {
	
	private final static String NOMBRE_FICHERO = "historial.txt";
	
	public static void eliminarHistorial() {
		try {
		File f = new File (NOMBRE_FICHERO);
		f.delete();
		}catch(Exception e){
			System.out.println("El archivo no existe");
		}
	}
	

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
	
	
	
	
}
