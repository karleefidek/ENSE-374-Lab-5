/**
 * class to represent an animal which is a subclass
 * of Organism
 * @author Karlee Fidek
 */
public class Animal extends Organism
{
	/**
	 * food holds a list of appropriate organisms from
	 * the food chain
	 */
	String food;
	
	/**
	 * Constructor -
	 * sets organism type as Caterpillar
	 * sets food as list of appropriate organisms
	 * @param typeVal a value for the type of organism
	 * @param foodVal a value for the food of an organism
	 */
	public Animal(String typeVal, String foodVal) 
	{
		super(typeVal);
		
		food = foodVal;
	}
	
	/**
	 * Retrieves the list of organisms that are food for the organism
	 * @return the food of organism
	 */
	String getFood()
	{
		return food;
	}
}
