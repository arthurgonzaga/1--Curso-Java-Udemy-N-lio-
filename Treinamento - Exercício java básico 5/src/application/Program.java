package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*5. Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor do sal�rio de um usu�rio,
calcule a quantidade de sal�rios m�nimos esse usu�rio ganha e imprima o resultado.
(1SM=R$788,00)*/


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor atual do sal�rio m�nimo");
		double sM = scan.nextDouble();
		
		System.out.println("Digite o sal�rio atual do usu�rio");
		double sU = scan.nextDouble();
	
		double somaS = sU / sM;
		
		System.out.println("O usu�rio ganha: "+String.format("%.1f", somaS)+" sal�rios m�nimos");
		
		
	}

}
