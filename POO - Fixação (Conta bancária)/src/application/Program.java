package application;

import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valorSaque;
		System.out.println("Informe o n�mero da conta");
		int numConta = scan.nextInt();
		System.out.println("Informe o nome do titular da conta");
		String nome = scan.next();
		System.out.println("Deseja iniciar a conta com algum dep�sito?\n" + "[1] - SIM\n" + "[2] - N�O\n");
		int escolha = scan.nextInt();
		double valorDeposito = 0;
		if (escolha == 1) {
			System.out.println("Entre com o valor de dep�sito");
			valorDeposito = scan.nextDouble();
		} else {
			System.out.println("Voc� depositou: R$00,00");
		}

		Banco banco = new Banco(numConta, nome, valorDeposito);

		boolean loop = true;
		while (loop == true) {
			System.out.println("==================================");
			System.out.println("Dados atualizados:");
			System.out.println("Numero da conta: " + banco.getConta());
			System.out.println("Nome do titular: " + banco.getNome());
			System.out.println("Saldo: R$" + banco.getSaldo());
			System.out.println("==================================");
			System.out.println(
					"O que deseja fazer?\n" 
							+ "[1] - SACAR\n" 
							+ "[2] - DEPOSITAR\n" 
							+ "[3] - CONSULTAR SALDO\n"
							+ "AVISO: taxa de saque: R$5,00\n"
							+ "==================================");
			escolha = scan.nextInt();
			if (escolha == 1) {
				System.out.println("Quanto deseja sacar de sua conta?\n"
						);
				valorSaque = scan.nextDouble();
				banco.saque(valorSaque);
				System.out.println("Voc� sacou: R$" + valorSaque);
			} else if (escolha == 2) {
				System.out.println("Qual o valor do dep�sito?\n");
				valorDeposito = scan.nextDouble();
				banco.deposito(valorDeposito);
				System.out.println("Voc� acaba de depositar R$"+valorDeposito);

			}else if (escolha == 3) {
				System.out.println("");
			}else {
				System.out.println("Op��o inv�lida, tente novamente!");
			}
				

		}
	}
}
