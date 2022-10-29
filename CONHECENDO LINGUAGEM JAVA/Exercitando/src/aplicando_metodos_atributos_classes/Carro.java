package aplicando_metodos_atributos_classes;

public class Carro {

	String modelo;
	boolean alarme;
	int velocidade;
	String motorista;
	
	public void marca(String qualMarca) {
		modelo = qualMarca;
		System.out.println("A marca do carro é: " + qualMarca);
	}
	
	public void travado() {
		alarme = true;
		System.out.println("O alarme está travado: " + alarme);
	}
	
	public void destravado() {
		alarme = false;
		System.out.println("O alarme está destravado: " + alarme);
	}
	
	public void acelerar(int qntKmh) {
		velocidade += qntKmh;
		System.out.println("Acelerou " + qntKmh  + "Km/h");
	}
	
	public void reduzir(int qntkmh) {
		velocidade -= qntkmh;
		System.out.println("Reduziu " + qntkmh + "Km/h");
	}
	
	public void condutor(String quemDirige) {
		motorista = quemDirige;
		System.out.println("O motorista é: " + quemDirige);
	}
}


