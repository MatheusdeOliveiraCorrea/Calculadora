package classes;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		// new Tela(); // CRIA TELA

		Scanner input = new Scanner(System.in);

		Operacoes op = new Operacoes();

		System.out.println("Qual operacao voce quer fazer? \n\n  --Basicas--  "
				+ "\n  1-Somar\n  2-Subtrair (em breve) \n  3-Dividir"
				+ "\n  4-Multiplicar \n\n  --Outras-- \n  5-Numero ao quadrado \n  6-Converter Binario para Decimal \n");
		
		
		int escolha = 0;
		
	
		
		try {
			System.out.print("Digite o numero aqui: ");
		    escolha = input.nextInt();
			System.out.println("");
			
		} catch (Exception erro) {
			
			System.out.println("Por favor, digite um valor válido");
			
		}

		
		
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

			op.elevarQuadrado();
			;
			break;

		}

	
	}
	

}
