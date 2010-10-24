package ocp;

public class Insert implements SqlOperation {

	@Override
	public String generate() {
		return "INSERT ...";
	}

}
