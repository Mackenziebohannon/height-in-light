/**
 * Class HeightInLight: a class to find out your height in light-time.
 * 
 * @author mackenziebohannon
 *
 */
import java.util.*;
import java.math.*;

public class HeightInLight {

	private double height; //your height in inches
	private double lightNanosecond = 11.8; //one light nanosecond is 11.8 inches

	/**
	 * Constructor, turns feet and inches into inches, saves them as height
	 * @param feet
	 * @param inches
	 */
	public HeightInLight(double feet, double inches){
		//for every foot, there are 12 inches
		height += (feet * 12);
		height += inches;
	}

	/**
	 * computes how much time it takes light to traverse your body
	 * @return seconds
	 */
	public double getHeightInLight() {
		//height in seconds is the height divided by the distance
		double time = height/lightNanosecond;		
		return time;
	}

	public static double round(double number, int decimals)
	{
		double mod = Math.pow(10.0, decimals);
		return Math.round(number * mod ) / mod;
	}

	public static void main (String [] args) {

		//let's get interactive
		double feet; //feet input
		double inches;
		Scanner input = new Scanner(System.in);

		//run the program
		System.out.print("Hi there! (Press enter to start, type 'quit' to quit)");

		while(!input.nextLine().toLowerCase().equals("quit")) {
			System.out.print("What is your height? (just the feet!): ");
			feet = Double.parseDouble(input.nextLine());
			System.out.print("Okay, now the inches: ");
			inches = Double.parseDouble(input.nextLine());
			HeightInLight yourHeight = new HeightInLight(feet, inches);
			double answer = yourHeight.getHeightInLight();
			answer = round(answer, 1);
			System.out.println("It takes "+ answer + " nanoseconds for light to get from your head to your feet.");
			System.out.println("Go again? Press enter to try another height, type 'quit' to end the game.");

		}
	}	
}
