package decoration;

public class SimpleAccount implements Account {
	
	private double balance;

	public SimpleAccount(double openingBalance) {
		this.balance = openingBalance;
	}
	
	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void credit(double amt) {
		this.balance += amt;
	}

	@Override
	public void debit(double amt) {
		this.balance -= amt;
	}

}
