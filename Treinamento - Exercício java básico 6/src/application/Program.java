package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*6. Desenvolva um algoritmo em Java que leia um n�mero inteiro e imprima o seu
antecessor e seu sucessor.*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int n = scan.nextInt();
		
		System.out.println("Voc� digitou: "+n);
		System.out.println("Seu antecessor �: "+(n-1));
		System.out.println("Seu sucessor �: "+(n+1));
		

	}

}
