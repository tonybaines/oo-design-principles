package decoration;

public class SuperSaverAccount implements Account {

	private final Account delegate;

	public SuperSaverAccount(Account delegate) {
		this.delegate = delegate;
	}

	@Override
	public void credit(double amt) {
		this.delegate.credit(amt);
	}

	@Override
	public void debit(double amt) {
		if (getBalance() >= amt) {
			this.delegate.debit(amt);
		} else {
			throw new IllegalStateException("Insufficient funds");
		}
	}

	@Override
	public double getBalance() {
		return this.delegate.getBalance();
	}

}
