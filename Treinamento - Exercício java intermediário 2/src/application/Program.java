package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NumeroDecrescente;

public class Program {
	/*2. Crie uma classe java NumeroDecrescente que contenha um m�todo que receba
um n�mero inteiro e imprima, em ordem decrescente, o valor do n�mero at�
0.*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		NumeroDecrescente numero = new NumeroDecrescente();
		
		System.out.println("Digite um n�mero inteiro");
		int n = scan.nextInt();
		
		numero.imprimeNumero(n);
		
	}

}
