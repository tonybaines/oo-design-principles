package injection;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalsTest {
    @Test
    public void shouldWalkLikeAnAnimal() {
      AnimalFactory factory = new AnimalFactory();
      Animal human = factory.createNew("Human");
      Animal dolphin = factory.createNew("Dolphin");
      Animal bear = factory.createNew("Bear");
      Animal monkey = factory.createNew("Monkey");

      assertEquals("Walk", human.move());
      assertEquals("Swim", dolphin.move());
      assertEquals("Walk", bear.move());
      assertEquals("Run", monkey.move());
    }
}
