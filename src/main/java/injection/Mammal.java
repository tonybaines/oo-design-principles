package injection;

public abstract class Mammal implements Animal {
	protected Movement movement;

	public Mammal(Movement movement) {
		this.movement = movement;
	}

	public String move() {
		return this.movement.move();
	}
}
