package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	  /*3. Escreva um programa que imprima na tela a soma dos n�meros �mpares entre 0
	  e 30 e a multiplica��o dos n�meros pares entre 0 e 30.
	 
	
	  NESTE EXERC�CIO TEMOS QUE PERCORRER AS 2 LISTAS, PRIMEIRO PERCORRER PARA
	  ADICIONAR NA LISTA SOMENTE OS N�MEROS PARES/IMPARES DE 0-30 , E DEPOIS
	  PERCORRER NOVAMENTE PARA SOMA-LOS
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Integer> impares = new ArrayList<>();
		List<Integer> pares = new ArrayList<>();

		int somaImpares = 0;
		int somaPares = 0;
		for (int i = 0; i <= 30; i++) {
			if (i % 2 != 0) {
				impares.add(i);

			}
		}
		for (int i = 0; i < impares.size(); i++) {
			somaImpares += impares.get(i);
		}
		System.out.println("A soma dos n�meros �mpares de 0 a 30: " + somaImpares);

		for (int i = 0; i <= 30; i++) {
			if ((i % 2) == 0) {
				pares.add(i);
			}
		}
		for (int i = 0; i < impares.size(); i++) {
			somaPares += pares.get(i);
		}

		System.out.println("A soma dos n�meros pares de 0 a 30: " + somaPares);

	}
}

