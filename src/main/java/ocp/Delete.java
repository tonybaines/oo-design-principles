package ocp;

public class Delete implements SqlOperation {

	@Override
	public String generate() {
		return "DELETE FROM ...";
	}

}
