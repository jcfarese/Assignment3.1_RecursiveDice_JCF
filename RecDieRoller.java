/*
 * Recursive die roller to be used with the driver class to roll a die and print the rolls as well as determine the average amount of times a 2 is rolled out of 1000 rolls
 * 
 * @author Jim Farese
 * @version 10/12/2022
 * 
 * Fall 2022
 */

import java.util.Random;
import java.text.DecimalFormat;

public class RecDieRoller {

	int roll;
	Random random = new Random();
	int count;
	DecimalFormat df = new DecimalFormat("0.00");
	
	//consturctors
	public RecDieRoller() {
		
		roll=0;
		count = 0;
		random = new Random();
		
	}//end RecDieRoller
	
	//Method used to roll a die until it rolls a 2 
	public void roll() {
		
		if(roll != 2) {
			
			roll = random.nextInt(6)+1;
			System.out.println("You rolled a: " + roll);
			count++;
			roll();
		}
				
	}//end roll
	
	//Method to print the number of rolls required until a 2 was rolled
	public void numRolls() {
		
	System.out.println("The number of rolls until a 2 was rolled was: " + count);
	
	}//end numRolls
	
	//counts all the times a 2 is rolled and adds them up and divides by 1000 since it is out of 1000 roll and then prints the average number of rolls required to roll a 2
	public void averageRolls() {
		
		for(int i=0; i<=1000; i++) {
			
			roll = random.nextInt(6)+1;
			if(roll == 2) {
				count++;
				
			}
		}
		
		double average=1000.0/count;
		double mean=count/1000.0;
		
		System.out.println("\n2 was rolled " + count + " times.  This means that on average a 2 was rolled every " + df.format(average) + "th time.  The probability to roll a 2 is " + df.format(mean));
		
	}//end averageRolls
	
}//end RecDieRoller class
