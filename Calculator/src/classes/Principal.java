package classes;

import java.util.Scanner;

import javax.xml.crypto.Data;

import tela.Tela;

public class Principal {

	public static void main(String[] args) {

		// new Tela(); // CRIA TELA

		Scanner input = new Scanner(System.in);

		Operacoes op = new Operacoes();

		System.out.println("Qual operacao voce quer fazer? \n  1-Somar\n  2-Subtrair\n  3-Dividir"
				+ "\n  4-Multiplicar\n  5-Numero ao quadrado \n ");
		
		System.out.print("Digite o numero aqui: ");
		int escolha = input.nextInt();
		System.out.println("");

		// escolhe a operação chamando o método correto
		switch (escolha) {

		case 1:

			op.somar();
			break;

		case 2:

			op.subtrair();
			break;
		case 3:

			op.dividir();
			break;

		case 4:

			op.multiplicar();
			break;

		case 5:

			op.aoQuadrado();
			;
			break;

		}

	}
}
