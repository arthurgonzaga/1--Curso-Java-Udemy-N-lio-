package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de produtos que deseja registrar");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		for (int i = 0; i < vect.length; i++) {//o length significa a mesma coisa da vari�vel n, por�m n�o ficamos dependendo da vari�vel n.
			System.out.println("Digite o nome do produto: "+i);
			String name = sc.next();
			System.out.println("Digite o pre�o do produto: "+i);
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("A m�dia dos pre�os � = %.2f%n", avg);
		sc.close();
	}
}
