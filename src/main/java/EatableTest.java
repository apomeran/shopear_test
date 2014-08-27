import static org.junit.Assert.*;

import org.junit.Test;


public class EatableTest {

	 @Test
	   public void comerDeMenos() {
	       System.out.println("Comiendo 4 gramos de un Queso de 5 gramos");
	       Queso q = new Queso(5);
	       assertTrue(q.bite(4) == 1);
	   }
	 @Test
	   public void comerDeMas() {
	       System.out.println("Comiendo 4 gramos de un Queso de 3 gramos");
	       Queso q = new Queso(3);
	       assertTrue(q.bite(4) == 0);
	   }

}
