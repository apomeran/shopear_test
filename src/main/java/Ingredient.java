
public class Ingredient extends Food implements Eatable{
	
	private String name;

	public int bite(int grams){
		System.out.println("About to eat " + grams + " of " + name);
		int w = getWeight();
		w = (grams > w) ? 0 : w-grams; // OR WE CAN THROW A YOU-ARE-EATING-TOO-MUCH-EXCEPTION 
		System.out.println("Finally eaten " + (getWeight() - w) + " grams of " + name);
		setWeight(w);
		return w;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
