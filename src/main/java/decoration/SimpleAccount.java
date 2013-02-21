package decoration;

public class SimpleAccount implements Account {
	
	private double balance;

	public SimpleAccount(double openingBalance) {
		this.balance = openingBalance;
	}
	
	public double getBalance() {
		return this.balance;
	}

	public void credit(double amt) {
		this.balance += amt;
	}

	public void debit(double amt) {
		this.balance -= amt;
	}

}
