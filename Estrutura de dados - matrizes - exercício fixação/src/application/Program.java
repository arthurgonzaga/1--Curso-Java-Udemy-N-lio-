package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o tamanho da linha?");
		int l = scan.nextInt();
		System.out.println("Qual o tamanho da coluna?");
		int c = scan.nextInt();
		int[][] mat = new int[l][c];
		System.out.print("Digite os n�meros da matriz:");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = scan.nextInt();

			}
		}
		System.out.println("Digite o n�mero que deseja encontrar na matriz:");
		int x = scan.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);

					}
				}

			}
		}
	}
}