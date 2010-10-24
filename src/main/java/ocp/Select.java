package ocp;

public class Select implements SqlOperation {

	@Override
	public String generate() {
		return "SELECT ...";
	}

}
