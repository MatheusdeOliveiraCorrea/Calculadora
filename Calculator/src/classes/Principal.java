package classes;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		try {
		
		/*Objetos: */
		Scanner input = new Scanner(System.in); //para receber dados do usuário
		Operacoes op = new Operacoes();  //para operar as contas nescessárias
		Conversor con = new Conversor(); //para as conversões de tempo e binário
		
		//quardar opções de operações (somar, subtrair...)
		Queue<String> queue = new LinkedList<String>(); 
		
		queue.add("Somar");
		queue.add("Subtrair (em breve)");
		queue.add("Dividir");
		queue.add("Multiplicar");
		queue.add("Elevar ao quadrado");

		
		
		System.out.println("Qual operacao voce quer fazer?");
		
		//Mostrar as operações que estão guardadas na Queue queue
		int tamanhoQueue = queue.size();
		
		for(int i = 1; i <= tamanhoQueue; i++) {	
			System.out.println("  " + i + "-"+ queue.poll());
			
		}

		
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
			break;

		}

				
			} finally {
				JOptionPane.showMessageDialog(null, "teste");
			}
		
	}
	

}
