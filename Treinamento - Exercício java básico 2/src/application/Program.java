package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class Program {
	/*2. Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos
	n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.*/
	
	//Exerc�cio resolvido sem classe pois fica mais r�pido. Mas poderia resolver com classe normalmente.

	public static double mediaUm() {
		double somaMediaUm;
		return somaMediaUm = (8+9+7) / 3;
	}
	
	public static double mediaDois() {
		double somaMediaDois;
		return (4+5+6) / 3;
	}
	
	public static double mediaTotal() {
		double medTotal;
		return medTotal = (mediaUm() + mediaDois()) / 2;
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("M�dia de 8, 9, 7 = "+mediaUm());
		System.out.println("M�dia de 4, 5, 6 = "+mediaDois());
		System.out.println("M�dia das m�dias acima = "+mediaTotal());
		

	}

}
