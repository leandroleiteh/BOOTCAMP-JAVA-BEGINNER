package aplicando_metodos_atributos_classes;

public class Carro {

	String nomeCarro;
	String marca;
	String motorista;
	boolean ligado = false;
	int vel;

	public void acelerar(int aceleracao) {
		vel += aceleracao;

	}
	
	public void freiar(int reduzir) {
		vel -= reduzir;
	}
}
