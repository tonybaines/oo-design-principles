package decoration;

public interface Account {
	public void credit(double amt);
	public void debit(double amt);
	public double getBalance();
}
