package ocp;

public class Delete implements SqlOperation {

	public String generate() {
		return "DELETE FROM ...";
	}

}
