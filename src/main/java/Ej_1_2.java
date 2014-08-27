import java.util.ArrayList;
import java.util.List;


public class Ej_1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			List<Ingredient> l = new ArrayList<Ingredient>();
			l.add(new JamonCocido());
			l.add(new JamonCocido());
			l.add(new Manteca());
			l.add(new PanMigaNegro());
			l.add(new Queso());
			Sandwich s = new Sandwich(l);
			s.bite(20);
	}

}
