package application;

import java.util.Scanner;

import entities.Funcionario;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		
		System.out.println("Digite o nome: ");
		funcionario.nome = scan.next();
		System.out.println("Digite o sal�rio bruto: ");
		funcionario.salarioBruto = scan.nextDouble();
		System.out.println("Digite o valor dos impostos: ");
		funcionario.impostos = scan.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println("Nome: "+funcionario.nome);
		System.out.println("Sal�rio L�quido: "+funcionario.SalarioLiquido());
		
		System.out.println("Digite a % de aumento que deseja para o funcion�rio: ");
		double porcentagem = scan.nextDouble();
		funcionario.SalarioAumentado(porcentagem);
		
		System.out.println("Dados atualizados:"+funcionario);
		
		
	
		
	

	}

}
