package application;

import java.util.Scanner;

import entities.Charmander;
import entities.Mewtwo;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Charmander charmander = new Charmander();
		Mewtwo mewtwo = new Mewtwo();
		System.out.println("Bem vindo! \nEscolha uma op��o:"
				+ "\n[1] - JOGAR"
				+ "\n[2] - SAIR");
		int menu = scan.nextInt();
		while(menu == 1) {
		
		System.out.println("Qual pok�mon deseja? "
				+ "\n[1] - Charmander"
				+ "\n[2] - Bulbasaur"
				+ "\n[3] - Squirtle");
		int escolha = scan.nextInt();
		if(escolha == 1) {
			System.out.println("Voc� est� com Charmander.");
		System.out.println("Status do seu Pok�mon atualizados:");
		System.out.println("Vida: "+charmander.vida);
			System.out.println("Voc� enfrentar� Mewtwo! PREPARE-SE");
			System.out.println("Escolha um ataque:"
					+ "\n[1] Ember"
					+ "\n[2] Flame Tower"
					+ "\n[3] Inferno");
			if(escolha == 1) {
				System.out.println("Charmander atacou com Ember causando: "+charmander.Ember());
				System.out.println(mewtwo.Psychic() - charmander.vida);	
		System.out.println("\nVida: "+charmander.vida);		
		
			}
		
		
		
		
		
		}else if(escolha == 2){
				System.out.println("Voc� est� com Bulbasaur.");
			}else if(escolha == 3) {
				System.out.println("Voc� est� com Squirtle");
			}else {
				System.out.println("Op��o inv�lida!");
			}
		
		
		
		
		}
		
		
		
		
	}
}