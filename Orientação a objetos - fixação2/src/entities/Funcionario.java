package entities;

import java.util.Scanner;

public class Funcionario {
	public String nome;
	public double salarioBruto, impostos;
	
	public double SalarioLiquido() {
		return salarioBruto - impostos;
	}
	
	public void SalarioAumentado(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome+", $"+String.format("%.2f", SalarioLiquido());
	}
		
		

	

}
