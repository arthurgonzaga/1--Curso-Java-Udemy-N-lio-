package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account(int account, String holder) {
		this.number = account;
		this.holder = holder;
	}
	
	public Account(int account, String holder, double initialDeposit) {
		super();
		this.number = account;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder += holder;
	}
	
	public double getBalance() { // setSaldo n�o foi colocado pois ele s� pode ser alterado pelo m�todo deposito ou saque!
		return balance;
	}
	
	
	public int getAccount() {
		return number;
	}
	
	public void deposit(double amount) {//VOID porque o SALDO que est� sendo alterado.
		balance += amount;
	}
	
	public void withdraw(double amount) {//VOID PORQUE O SALTO EST� SENDO ALTERADO TAMB�M.
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+", holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
	
}
