package application;

import java.util.Scanner;
import util.PilhaEncadeada;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PilhaEncadeada pilha = new PilhaEncadeada();

		System.out.println("Qual numero decimal quer converter?");
		int numeroDecimal = sc.nextInt();
		System.out.println("Para qual base deseja converter?");
		int base = sc.nextInt();
		
		while(numeroDecimal > 0) {
			int resto = numeroDecimal % base;
			pilha.push(resto);				
			numeroDecimal = numeroDecimal / base;
		}
		
		System.out.println("Numero convertido para a base " + base + " :");
		
		while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
	}
	
}
