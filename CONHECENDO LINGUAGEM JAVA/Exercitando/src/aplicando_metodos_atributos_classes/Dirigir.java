package aplicando_metodos_atributos_classes;

public class Dirigir {

	public static void main(String[] args) {

		Carro c2 = new Carro();
		
		c2.velocidade = 50;
		
		c2.travado();
		
		c2.destravado();
		
		c2.condutor("Leandro");
		
		c2.marca("Ford");
		
		System.out.println("Qual à velocidade atual do carro? " + c2.velocidade + "Km/h");
		
		c2.acelerar(10);
		c2.acelerar(5);
		
		System.out.println("O carro esta à: " + c2.velocidade  + "Km/h");
		
		c2.reduzir(25);
		
		System.out.println("O carro esta à: " + c2.velocidade  + "Km/h");
		
		
	}

}
