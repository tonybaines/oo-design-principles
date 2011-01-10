package inheritance;

import org.junit.Test;

public class AnimalsTest {
    @Test
    public void testMe() {
      Animal human = new Human();
      Animal duck = new Duck();
      Animal dog = new Dog();
      Animal salmon = new Salmon();
      Animal croc = new Crocodile();
      Animal snake = new Snake();

      assertEquals("Walk", human.move());
      assertEquals("Fly", duck.move());
      assertEquals("Swim", salmon.move());
      assertEquals("Walk", croc.move());
      assertEquals("Slither", snake.move());

      /* What about an Orangutan (
       * - climb or walk?
       * - why choose?
       * or an Ostrich ?
       * - duplicate the Horse move() ?
       * or a Dolphin
       * ...
       */

    }
}
