package injection;

public class AnimalFactory {
	public Animal createNew(final String name) {
		if (Human.class.getSimpleName().equals(name)) {
			return new Human(new WalkMovement());
		}
		else if (Monkey.class.getSimpleName().equals(name)) {
			return new Monkey(new RunMovement());
		}
		else if (Dolphin.class.getSimpleName().equals(name)) {
			return new Dolphin(new SwimMovement());
		}
		else if (Bear.class.getSimpleName().equals(name)) {
			return new Bear(new WalkMovement());
		}
		throw new IllegalArgumentException("Unknown Animal: " + name);
	}
}
