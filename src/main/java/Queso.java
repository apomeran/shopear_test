
public class Queso extends Ingredient {

	public Queso(){
		setName("Queso");
		setWeight(250);
	}
	
	public Queso(int grams){
		this();
		setWeight(grams); // THE WEIGHT IS SETTED TWO TIMES. I KNOW. BUT JUST FOR THE EATABLE TEST !!!
		
	}
}
