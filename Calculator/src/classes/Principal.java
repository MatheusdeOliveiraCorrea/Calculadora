package classes;

import java.util.Scanner;

import javax.xml.crypto.Data;

import tela.Tela;

public class Principal {

	public static void main(String[] args) {
		
		  new Tela(); // CRIA TELA
		  
		  Scanner input = new Scanner(System.in); Operacoes op = new Operacoes();
		  
		  System.out.
		  println("Qual operacao voce quer fazer? \n1-Somar\n2-Subtrair\n3-Dividir" +
		  "\n4-Multiplicar\n5-Numero ao quadrado ");
		  System.out.print("Digite o numero aqui: "); int escolha = input.nextInt();
		  System.out.println("");
		  
		  switch (escolha) {
		  
		  case 1:
		  
		  op.somar(); break;
		  
		  case 2:
		  
		  op.subtrair(); break; case 3:
		  
		  op.dividir(); break;
		  
		  case 4:
		  
		  op.multiplicar(); break;
		  
		  case 5:
		  
		  op.aoQuadrado(); ; break;
		  
		  }
		 

		
		
		
	}
}
