package PracticasScrum;

public class Utilidades {
	
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

}
