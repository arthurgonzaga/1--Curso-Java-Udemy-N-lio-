package entities;

public class Charmander {
	public double vida = 5000;
	public double ataque = 44;
	public double defesa = 18;
	public double agilidade = 15;
	public double magia = 30;

	public double Ember() {
		double danoBaseEmber = 60;
		return danoBaseEmber + this.ataque + this.agilidade;
		
		
	}
	

}



