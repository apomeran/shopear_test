import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Food implements Eatable {
	private List<Ingredient> ingredients;
	private String name;

	public Sandwich() {
		this.ingredients = new ArrayList<Ingredient>();

	}

	public Sandwich(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
		this.name = "Sandwich Especial de " + this.ingredients.size()
				+ " ingredientes";

	}

	@Override
	public int getWeight() {
		int result = 0;
		for (Ingredient ing : ingredients) {
			result += ing.getWeight();

		}
		return result;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void addIngredient(Ingredient i) {
		this.ingredients.add(i);
	}

	public int bite(int grams) {
		System.out.println("About to eat " + grams + " from the " + name);
		int oldWeight = getWeight();
		int eaten = 0;
		for (Ingredient ing : ingredients) {
			eaten += ing.bite(grams / ingredients.size());
		}
		System.out.println("Finally eaten " + (oldWeight - eaten)
				+ " from the " + name);
		return eaten;
	}

}
