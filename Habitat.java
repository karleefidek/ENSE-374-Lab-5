import java.util.Scanner;

/**
 * class to represent the habitat of the food chain
 * using a 2D simulation world
 * @author Karlee Fidek
 */
public class Habitat 
{
	/**
	 * holds length and width of habitat
	 */
	int width;
	int length;
	
	/**
	 * holds maximum amount of Organisms that can be in a habitat
	 */
	int capacity;
	
	/**
	 * holds the number of Organisms that are in the habitat
	 */
	int organismCount;
	
	/**
	 * 2D array to represent 2D world with positions for organisms
	 */
	Organism[][] world;
	
	/**
	 * Constructor
	 * @param x the width of the habitat
	 * @param y the length of the habitat
	 */
	public Habitat(int x, int y) {
		width = x;
		length = y;
		
		capacity = x * y;
		organismCount = 0;
		
		world = new Organism[width][length];
		
		for (int i = 0; i < width; i++)
		{
			for (int j = 0; j < length; j++)
			{
				world[i][j] = null;
			}
		}
	}
	
	/**
	 * Displays the habitat and the organisms within it
	 */
	public void printHabitat()
	{
		for (int i = 0; i < width; i++)
		{
			System.out.print("| ");
			
			for(int j = 0; j < length; j++)
			{
				if(world[i][j] == null)
				{
					System.out.format("%15s", " | ");
				}
				else
				{
					System.out.format("%15s", (world[i][j].getType() + " | "));
				}
			}
			
			System.out.println();
		}
	}
	
	/**
	 * Inserts an organism into the habitat at a random location
	 * @param newOrganism the organism to insert
	 */
	public void insert(Organism newOrganism)
	{
		int xRandom;
		int yRandom;
		
		if(organismCount < capacity)
		{
			organismCount++;
			
			do 
			{
				xRandom = (int)(Math.random() * (width));
				yRandom = (int)(Math.random() * (length));
			} while(world[xRandom][yRandom] != null);
			
			world[xRandom][yRandom] = newOrganism;
		}
		else
		{
			System.out.println("Habitat has reached capacity. Organism not added.");
		}
	}
	
	/**
	 * Displays each organism's food from the food chain
	 */
	public void printFood()
	{
			Animal animal = new Caterpillar();
			System.out.println("Caterpillar's Food: " + animal.getFood());
			animal = new Bluejay();
			System.out.println("Bluejay's Food: " + animal.getFood());
			animal = new Hawk();
			System.out.println("Hawk's Food: " + animal.getFood());
			animal = new Grasshopper();
			System.out.println("Grasshopper's Food: " + animal.getFood());
			animal = new Mouse();
			System.out.println("Mouse's Food: " + animal.getFood());
			animal = new Fox();
			System.out.println("Fox's Food: " + animal.getFood());
			animal = new Squirrel();
			System.out.println("Squirrel's Food: " + animal.getFood());
			animal = new Rabbit();
			System.out.println("Rabbit's Food: " + animal.getFood());
			animal = new Deer();
			System.out.println("Deer's Food: " + animal.getFood());
			animal = new Wolf();
			System.out.println("Wolf's Food: " + animal.getFood());
	}
	
	/**
	 * test organism and habitat classes and functionality
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the width of the habitat:");
		int width = input.nextInt();
		System.out.println("Please enter the length of the habitat:");
		int length = input.nextInt();
		input.nextLine();
		Habitat testHabitat = new Habitat(width,length);
		
		String userChoice;
		boolean insertOrganism;
		do
		{
			System.out.println("What type of organism would you like to add to the habitat? (ex. Bluejay)");
			userChoice = input.nextLine();
			
			Organism newOrganism = null;
			insertOrganism = true;
			
			if(userChoice.equals("Caterpillar"))
			{
				newOrganism = new Caterpillar();
			}
			else if(userChoice.equals("Tree"))
			{
				newOrganism = new Tree();
			}
			else if(userChoice.equals("Shrub"))
			{
				newOrganism = new Shrub();
			}
			else if(userChoice.equals("Bluejay"))
			{
				newOrganism = new Bluejay();
			}
			else if(userChoice.equals("Hawk"))
			{
				newOrganism = new Hawk();
			}
			else if(userChoice.equals("Grasshopper"))
			{
				newOrganism = new Grasshopper();
			}
			else if(userChoice.equals("Mouse"))
			{
				newOrganism = new Mouse();
			}
			else if(userChoice.equals("Fox"))
			{
				newOrganism = new Fox();
			}
			else if(userChoice.equals("Squirrel"))
			{
				newOrganism = new Squirrel();
			}
			else if(userChoice.equals("Rabbit"))
			{
				newOrganism = new Rabbit();
			}
			else if(userChoice.equals("Grass"))
			{
				newOrganism = new Grass();
			}
			else if(userChoice.equals("Deer"))
			{
				newOrganism = new Deer();
			}
			else if(userChoice.equals("Wolf"))
			{
				newOrganism = new Wolf();
			}
			else
			{
				System.out.println("Invalid organism");
				insertOrganism = false;
			}
			
			if(insertOrganism)
			{
				testHabitat.insert(newOrganism);
				testHabitat.printHabitat();
			}
			
			System.out.println("Would you like to add an organism to the habitat? (y/n) ");
			userChoice = input.nextLine();
		}
		while(userChoice.equals("y"));
		
		System.out.println("Would you like to see each organism's food from the food chain? (y/n) ");
		userChoice = input.nextLine();

		if(userChoice.equals("y"))
		{
			testHabitat.printFood();
		}
		
		input.close();
	}
}