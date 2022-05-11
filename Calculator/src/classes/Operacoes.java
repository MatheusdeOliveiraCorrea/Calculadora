package classes;

import java.util.Scanner;

public class Operacoes {
	Scanner input = new Scanner(System.in);

	public void somar() {

		long continuarsomar = -1;
		long total = 0;

		while (continuarsomar != 0) {

			System.out.println("Some o(s) numero(s):  (para parar digite 0)  ");
			long numero = input.nextLong();
			total += numero;

			continuarsomar = numero;
		}

		System.out.println("\nO resultado da soma e: " + total);

	}

	public void subtrair() {

		while (0 == 0) {

			System.out.println("subtraia os seguintes numeros: ");
			long numero = input.nextLong();

			System.out.println("subtraia os seguintes numeros: ");
			long numero2 = input.nextLong();

			long total = numero - numero2;

		}

	}

	public void dividir() {

		System.out.println("Qual numero voce quer dividir? (zero para parar) ");
		long numero = input.nextLong(); // pega o primeiro

		System.out.println("Qual numero voce quer dividir? (zero para parar) ");
		long numero2 = input.nextLong(); // o segundo

		long resultado = numero / numero2; // divide

		while (numero != 0) {

			System.out.println("Qual numero voce quer dividir? ");
			long pronumero = input.nextLong();

			if (pronumero == 0) {
				System.out.println("resultado: " + resultado);
				break;
			} else {

				resultado /= pronumero;

			}

			numero = pronumero;

		}

	}

	public void multiplicar() {

		System.out.println("Qual numero voce quer multiplicar? (zero para parar) ");
		long numero = input.nextLong();

		System.out.println("Voce quer multiplicar por qual outro numero? (zero para parar) ");
		long numero2 = input.nextLong();

		long resultado = numero * numero2;

		while (numero != 0) {
			System.out.println("Voce quer multiplicar por qual outro numero? (zero para parar) ");
			long pronumero = input.nextLong();

			if (pronumero == 0) {

				System.out.println("resultado: " + resultado);

			} else {

				resultado *= pronumero;

			}

			numero = pronumero;
		}

	}
	
	public void aoQuadrado() {
		
		System.out.println("Qual numero voce quer elevar ao quadrado? ");
		double numero = input.nextLong();
		
		
		double resultado = Math.pow(numero, 2);
		
		System.out.println("Resultado " + resultado);
	}
	
	
	
	

}
