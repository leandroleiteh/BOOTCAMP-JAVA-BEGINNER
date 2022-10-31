package edu;

public class Operadores_Logicos_relacionais_similares {

	public static void main(String[] args) {

		// UNÁRIOS: ++, --, +, -, !

		// ARITIMÉTICOS: *, /, %, +, -

		// COMPARAÇÃO: <, <=, >, >=, ==, !=

		// LÓGICOS: &&, ||, ^, !

		// CONDICIONAL/ TERNÁRIOS: ?, :

		// ATRIBUIÇÃO: =

		int a, b, c, d, e;

		a = 10;
		b = 10;
		c = 20;
		d = 5;
		e = 1;

		if (a == b) {
			System.out.println("a igual a b");
		}

		if (c != d) {
			System.out.println("c diferente de d");

		}

		if (a < c) {
			System.out.println("a é menor que c");

		}

		if (a <= c) {
			System.out.println("a é menor ou igual a c");
		}

		if (a >= e) {
			System.out.println("a é maior ou igual a e");
		}

		if (a > d) {
			System.out.println("a é maior que d");
		}
		
		if (a == b && true) {
			System.out.println("se a for igual a b o resultado é verdadeiro");
		}
		
		if (a != c) {
			System.out.println("se a for diferente de c o resultado é VERDADEIRO");
		}
		
		if (a == b || c != d) {
			System.out.println("se a for igual a b e for diferente de c e d o resultado é verdadeiro"); 
		}
	}

}
