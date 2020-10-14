package application;

import java.util.Scanner;

import entities.Dollar;
import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dollar dollar = new Dollar();
		
		
		System.out.println("Digite a cota��o atual do dolar: ");
		dollar.valorDollar = scan.nextDouble();
		System.out.println("Valor do dollar com impostos: "+dollar.valorFinalDolar());
		
		System.out.println("Quantos dolares deseja comprar?");
		double quantidade = scan.nextDouble();
		
		
		System.out.println("Valor final a pagar: "+CurrencyConverter.calculoFinal(quantidade));
		
		

	}

}
