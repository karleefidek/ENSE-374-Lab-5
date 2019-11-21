/**
 * Class representing an organism
 * @author Karlee Fidek
 */
public class Organism 
{	
	/**
	 * type holds the type of organism that is represented
	 */
	String type;
	
	/**
	 * Constructor
	 * @param typeVal a value for the type of organism
	 */
	public Organism(String typeVal)
	{
		type = typeVal;
	}
	
	/**
	 * Retrieves the type of organism
	 * @return the type of organism of the instance
	 */
	String getType()
	{
		return type;
	}
}