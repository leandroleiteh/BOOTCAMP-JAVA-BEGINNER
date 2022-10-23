package edu;

public class AnatomiaClasses {

	public static void main(String[] args) {
		
		//MEU PRIMEIRO METODO
		
		String noivo = "Leandro";
		String noiva = "Learisa";
		
		String noivos = casamento(noivo, noiva);
		
		System.out.println(noivos);
	}

	public static String casamento (String noivo, String noiva) {
		
		return "Os noivos serão " + noivo.concat(" ") + "e".concat(" ").concat(noiva); 


	}

}
