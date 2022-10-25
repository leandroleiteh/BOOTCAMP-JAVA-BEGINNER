package edu;

public class Operadores {

	public static void main(String[] args) {

		int numero = 5;
		
		
		numero = - numero;
		
		//para tornar o numero negativo, basta colocar o sinal unário de subtração antes do nome da variável ex: (n = - n);
		
		System.out.println(numero);
		
		numero = + numero;
		
		// se usarmos a expressão ex: ( n = + n); depois de estar ou tornar anteriormente o numero em negativo, ele continuara negativo, para resolver é o comentário abaixo
	
		
		System.out.println(numero); 
		
		numero = numero * - 1;
		
		//para tornar o valor negativo em positivo, é necessário multiplicar ele por -1 ex: (n = n * -1); 
		
		System.out.println(numero);
		
		//-------------------------------------------------------------------------------------------------------------
		
		int valor = 5;
		
		//OBS: SERVE TANTO PARA ADICIONAR VALOR COMO PARA SUBTRAIR UM VALOR 
		
		//OBS ADICIONAR: INCREMENTAR EX: (n++;)
		//OBS SUBTRAIR: DECREMENTAR EX: (n--;)
		
		//formas de incrementar um valor a nossa varável. ex:  (n = n + 1; para incrementar penas 1 numero à mais)
		// para incrementar mais que apenas 1 basta fazer assim. ex: (n = n + 2;) irá somar o numero dois ao valor da variável n
		
		valor = valor + 1;
		
		System.out.println(valor);
		
		//para incrementar apenas o valor 1 à variável, basta usar está expressão. ex: (n++;) que seria acrescentar 1 ao valor da variavel n;
		//serve para incrementar ou para diminuir um numero. ex: (n--;) que está tirando o valor 1 da variavel. Se n = 2, usando está expressão, n valeria 1.
		
		valor++;
		
		// É O MESMO QUE (n = n +1;)
		
		System.out.println(valor);
		
		valor--;
		
		System.out.println(valor);
		
		//para poder incrementar direto na linha de output basta fazer assim. ex: System.out.println( ++ n); SERVE TANTO PARA ADICIONAR OU SUBTRAIR.
		
		System.out.println( ++ valor);
		System.out.println( -- valor);
		
		//-----------------------------------------------------------------------------------------------------------------------------
		
		boolean variavel = false;
		
		// usando este caracter "!" antes da varaivel do tipo boolean, nó trasemos negação invertendo o valor dele, se for "true" ele muda para "false" e vice-versa
		// ex: boolean varialvel = true e atribuirmos "!" ela ficará  varialvel = false  vice versa
		
		System.out.println(!variavel);
		
		//se a variavel for true e dentro do output colocarmos "!" antes da variavel ex: System.out.println(!variavel); o resultado será: false
		// porem, só surtirá efetia nessa linha de código. Caso usarmos novameten o output sem o "!" a variavel volta ao valor original dela, true.
		// para inverter o valor original da variavel, basta ultilizar o exemplo acima e código em ex: (variavel = !variavel;) se for false, muda originalmente para true, e se for true muda para false 
		
		variavel = !variavel;
		
		System.out.println(variavel);
		
		System.out.println(!variavel);
		
		//------------------------------------------------------------------------------------------------------------------------------
		
		// Operadores Ternários
		// Nos tipos boolean, "1" = true e "0" = false
		// Abaixo em forma de comentário, está um código representando uma condição com IF e ELSE.
 		
		int a, b;
		a = 5;
		b = 6; 
		
		String resultado = "";
		
		//if (a == b) {
			//resultado = "1";
		//}
		//else 
			//resultado = "0";
		
		//System.out.println(resultado);
		
		//Usando uma expressão ternária, ficaria assim: 
		
		resultado = a==b ?"1" : "0";
				
		System.out.println(resultado);
		
		//RESULTADO = se a for igual a b (O valor é true, ou seja "1") se for diferente (O valor é "0" ou seja, false)
		
		//--------------------------------------------------------------------------------------------------------------
		
		//OPERADORES TIPO BOOLEAN
		
		// == este simbolo, indentifica se há igualdade nos operadores da esquerda ou da direita, retornando um TRUE OU FALSE. ex: (se 5 == 5) o resultado é TRUE. (se 5 == 6) o reusltado é FALSE.
		
		// != este simbolo, indentifica se há diferença nos operadores da esquerda ou da direita, retornando um TRUE OU FALSE. ex: (se 5 != 6) o resultado é TRUE. (se 5 == 5) o reusltado é FALSE.
		
		// >  este simbolo, indentifica se a variavel da esquerda é maior do que à variavel da direita, retornando um TRUE OU FALSE. ex: (se 5 > 4) o resultado é TRUE. (se 5 > 6) o reusltado é FALSE.
		
		// >= este simbolo, indentifcia se a variavel da esquerda é maior ou igual a da direita, retornando um TRUE OU FALSE. ex: (se 5 >= 5) o resultado é TRUE. (se 5 >= 6) o reusltado é FALSE.
		
		// <  este simbolo, indentifica se a variavel da esquerda é menor do que à variavel da direita, retornando um TRUE OU FALSE. ex: (se 5 < 6) o resultado é TRUE. (se 5 < 4) o reusltado é FALSE.
		
		// <= este simbolo, indentifcia se a variavel da esquerda é menor ou igual a da direita, retornando um TRUE OU FALSE. ex: (se 5 <= 5) o resultado é TRUE. (se 5 <= 6) o reusltado é FALSE.

	
	}

}
