package entities;

public class MaiorNumero {
	
	
	public void mostraOMaiorNumero(int n1, int n2) {
		if(n1 > n2) {
			System.out.println("O n�mero "+n1+" � maior que "+n2);
			
		}
		else if(n1 < n2) {
			System.out.println("O n�mero "+n2+" � maior que "+n1);
		}
		else {
			System.out.println("Os n�meros s�o iguais");
		}	
		
	}
}