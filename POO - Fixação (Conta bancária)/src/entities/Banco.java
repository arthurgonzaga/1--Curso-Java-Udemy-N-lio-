package entities;

public class Banco {
	private final int CONTA;
	private String nome;
	private double saldo;
	
	public Banco(int numConta, String nome) {
		this.CONTA = numConta;
		this.nome = nome;
	}
	
	public Banco(int numConta, String nome, double valorDepositoIni) {
		super();
		this.CONTA = numConta;
		this.nome = nome;
		deposito(valorDepositoIni);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome += nome;
	}
	
	public double getSaldo() { // setSaldo n�o foi colocado pois ele s� pode ser alterado pelo m�todo deposito ou saque!
		return saldo;
	}
	
	
	public int getConta() {
		return CONTA;
	}
	
	public void deposito(double valorDeposito) {//VOID porque o SALDO que est� sendo alterado.
		saldo += valorDeposito;
	}
	
	public void saque(double valorSaque) {//VOID PORQUE O SALTO EST� SENDO ALTERADO TAMB�M.
		saldo -= valorSaque + 5;
	}
	
	
}
