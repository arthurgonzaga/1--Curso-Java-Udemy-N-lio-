package aplication;

import java.util.Scanner;

import entities.Triangle;

public class Program {
	//programa sem orienta��o a objetos

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas do tri�ngulo X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		System.out.println("Entre com as medidas do tri�ngulo Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.calculoDaArea();
		double areaY = y.calculoDaArea();
	
		System.out.printf("�rea do tri�ngulo X: %.4f%n", areaX);
		System.out.printf("�rea do tri�ngulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A �rea do tri�ngulo X � maior");
			
	}else {
		System.out.println("A �rea do tri�ngulo Y � maior");
	}
		scan.close();
  }
}