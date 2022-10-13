/*
 * Recursive die roller driver that uses the RecDieRoller class to roll a die and print the rolls as well as determine the average amount of times a 2 is rolled out of 1000 rolls
 * 
 * @author Jim Farese
 * @version 10/12/2022
 * 
 * Fall 2022
 */

public class RecDieRollerDriver {

	//main method
	public static void main(String[] args) {
		
		//instantiates a die to be rolled
		RecDieRoller dieRoll = new RecDieRoller();
		
		//rolls the die and prints the results
		dieRoll.roll();	
		dieRoll.numRolls();
		
		//rolls the die 1000 times and gives the average number of rolls for a 2 to be rolled
		dieRoll.averageRolls();
		
	}//end main
	
}//end RecDieRollerDriver class
