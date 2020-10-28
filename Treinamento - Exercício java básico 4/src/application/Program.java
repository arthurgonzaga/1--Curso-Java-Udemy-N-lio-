package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	/*
	 * 4. Escrever um algoritmo que l�: - a porcentagem do IPI a ser acrescido no
	 * valor das pe�as - o c�digo da pe�a 1, valor unit�rio da pe�a 1, quantidade de
	 * pe�as 1 - o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2
	 * O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
	 * F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Digite a % do IPI: ");
		double ipi = scan.nextDouble();
		for (int i = 1; i <= 2; i++) {
			System.out.println("Pe�a #" + i);
			System.out.print("C�digo: ");
			int id = scan.nextInt();
			while (hasId(list, id)) {
				System.out.println("O c�digo digit�do j� existe, digite outro");
				id = scan.nextInt();
			}

			System.out.print("Valor unit�rio: ");
			double preco = scan.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = scan.nextInt();
			list.add(new Product(id, preco, quantidade));

		}
		
		double soma1 = list.get(0).getPreco() * list.get(0).getQuantidade();
		double soma2 = list.get(1).getPreco() * list.get(1).getQuantidade();
		double precoFinal = (soma1 + soma2) * (ipi/100+1);
		
		System.out.println(precoFinal);
	
	}

	public static boolean hasId(List<Product> list, int id) {
		Product product = list.stream().filter(x -> x.getCodigo() == id).findFirst().orElse(null);
		return product != null;
	}
}