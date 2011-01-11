package decoration;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Account simpleAcct;
	
	@Before
	public void setup() {
		simpleAcct = new SimpleAccount(100);
	}
	
	@Test
	public void testSimple() {
		simpleAcct.debit(110);
		assertEquals(-10, simpleAcct.getBalance(), 0);
	}
	
	@Test(expected=IllegalStateException.class)
	public void testSuperSaver() {
		SuperSaverAccount superSaver = new SuperSaverAccount(simpleAcct);
		superSaver.debit(110);
	}

}
