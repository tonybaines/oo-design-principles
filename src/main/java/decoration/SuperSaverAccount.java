package decoration;

public class SuperSaverAccount implements Account {

	private final Account delegate;

	public SuperSaverAccount(Account delegate) {
		this.delegate = delegate;
	}

	public void credit(double amt) {
		this.delegate.credit(amt);
	}

	public void debit(double amt) {
		if (getBalance() <= amt) {
			throw new IllegalStateException("Insufficient funds");
		}
        this.delegate.debit(amt);
	}

	public double getBalance() {
		return this.delegate.getBalance();
	}

}
