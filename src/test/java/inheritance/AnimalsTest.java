package inheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalsTest {
    @Test
    public void testMe() {
      Animal human = new Human();
      Animal dolphin = new Dolphin();
      Animal bear = new Bear();
      Animal monkey = new Monkey();

      assertEquals("Walk", human.move());
      assertEquals("Swim", dolphin.move());
      assertEquals("Walk", bear.move());
      assertEquals("Run", monkey.move());
    }
}
