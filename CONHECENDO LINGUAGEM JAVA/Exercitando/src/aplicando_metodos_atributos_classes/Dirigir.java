package aplicando_metodos_atributos_classes;

public class Dirigir {

	public static void main(String[] args) {

		Carro c1 = new Carro();

		c1.marca = "Ford";
		c1.nomeCarro = "Ka";
		c1.motorista = "Jussiara";
		c1.vel = 50;

		System.out.println("A marca do carro é: " + c1.marca);
		System.out.println("O modelo é: " + c1.nomeCarro);
		System.out.println("A motorista é: " + c1.motorista);

		c1.acelerar(10);

		System.out.println(c1.vel);

		c1.freiar(30);

		System.out.println(c1.vel);

	}

}
