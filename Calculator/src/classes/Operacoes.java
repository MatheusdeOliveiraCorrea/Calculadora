package classes;

import java.util.Scanner;

import interfaces.ContratoOperacoes;

public class Operacoes implements ContratoOperacoes {
	Scanner input = new Scanner(System.in);
	
	@Override
	public void somar() {

		double continuarsomar = -1;
		double total = 0;

		while (continuarsomar != 0) {

			System.out.println("Some o(s) numero(s):  (para parar digite 0)  ");
			double numero = input.nextDouble();
			total += numero;

			continuarsomar = numero;
		}

		System.out.println("\nO resultado da soma e: " + total);

	}
	@Override
	public void subtrair() {

		while (true) {

			System.out.println("subtraia os seguintes numeros: ");
			double numero = input.nextDouble();

			System.out.println("subtraia os seguintes numeros: ");
			double numero2 = input.nextDouble();

			double total = numero - numero2;

		}

	}

	@Override
	public void dividir() {

		System.out.println("Qual numero voce quer dividir? (digite zero para parar) ");
		double numero = input.nextDouble(); // pega o primeiro

		System.out.println("Qual numero voce quer dividir? (digite zero para parar) ");
		double numero2 = input.nextDouble(); // o segundo

		double resultado = numero / numero2; // divide

		
		//Caso se tenha nescessidade de dividir mais que dois numeros
		while (numero != 0) {

			System.out.println("Qual numero voce quer dividir? (digite zero para parar) ");
			double pronumero = input.nextDouble();

			if (pronumero == 0) {
				System.out.println("resultado: " + resultado);
				break;
			} else {

				resultado /= pronumero;

			}

			numero = pronumero;

		}

	}

	@Override
	public void multiplicar() {

		System.out.println("Qual numero voce quer multiplicar? (zero para parar) ");
		double numero = input.nextDouble();

		System.out.println("Voce quer multiplicar por qual outro numero? (zero para parar) ");
		double numero2 = input.nextDouble();

		double resultado = numero * numero2;

		while (numero != 0) {
			System.out.println("Voce quer multiplicar por qual outro numero? (zero para parar) ");
			double pronumero = input.nextDouble();

			if (pronumero == 0) {

				System.out.println("resultado: " + resultado);

			} else {

				resultado *= pronumero;

			}

			numero = pronumero;
		}

	}

	
	@Override
	public void elevarQuadrado() {

		System.out.println("Qual numero voce quer elevar ao quadrado? ");
		double numero = input.nextDouble();
		
		
		double resultado = Math.pow(numero, 2);
		
		System.out.println("Resultado " + resultado);
		
		
	}
	
	
	@Override
	public void binarioDeciamal() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void gerarAleatorio() {
		// TODO Auto-generated method stub
		
	}
	

}
