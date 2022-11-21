package estruturaLoopsArrays;

import java.util.Scanner;

public class Estrutura_de_repeticao {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;

		while (true) {

			System.out.println("Nome: ");

			nome = sc.next();

			if (nome.equals("0")) {
				System.out.println("O Loop Terminou");
				break;

			}

			System.out.println("Idade: ");

			idade = sc.nextInt();

		}
		System.out.println("Continua aqui...");
	}

}
