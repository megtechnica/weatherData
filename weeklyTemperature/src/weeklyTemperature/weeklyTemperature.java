package weeklyTemperature;
import java.util.Scanner;
import java.util.*;

public class weeklyTemperature {
	public static void main(String [] args) { 
	      Scanner scnr = new Scanner(System.in);
	      // instantiate variables
	      String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	      double[] temperatures = {78.9, 75.6, 73.4, 68.9, 72.4, 74.5, 73.4};
	      String sentinel = "y";
	      
	      int i;
	      double dailyTemperature;
	      
	      // output instructions to user
	      System.out.println("--Welcome to the Weather App--");
	      System.out.println("         Intructions:         ");
	      System.out.println("Either enter the day of the week ");
	      System.out.println("you would like to see temp data for ");
	      System.out.println("OR enter 'Week' and see the whole week. ");
	      
	      
	      while (sentinel.equalsIgnoreCase("y")) {
	    	  System.out.println("What would you like to do? ");
	          String answer = scnr.nextLine();
	          // if week is entered, display each day of the week
	          // and the temperature entered as well as the average
	          if (answer.equalsIgnoreCase("week")) {
	        	  double sum = 0;
	        	  for (i=0; i < days.length; i ++) {
	        		  System.out.println(days[i] + ": " + temperatures[i] + " degrees farenheit. ");
	        		  sum = temperatures[i] + sum;
	        		  }
	        	  double averageTemperature = sum / temperatures.length;
	        	  System.out.println("Average temperature: " + averageTemperature + " degrees farenheit. ");
	        	  }
	          else if (answer.equalsIgnoreCase("monday")) {
	        	  System.out.println("The temperature on " + answer +" was " + temperatures[1]);
	          }
	          else if (answer.equalsIgnoreCase("tuesday")) {
	        	  System.out.println("The temperature on " + answer +" was " + temperatures[2]);
	          }
	          else if (answer.equalsIgnoreCase("wednesday")) {
	        	  System.out.println("The temperature on " + answer +" was " + temperatures[3]);
	          }
	          else if (answer.equalsIgnoreCase("thursday")){
	        	  System.out.println("The temperature on " + answer +" was " + temperatures[4]);
	          }
	          else if (answer.equalsIgnoreCase("friday")) {
	        	  System.out.println("The temperature on " + answer +" was " + temperatures[5]);
	          }
	          else if (answer.equalsIgnoreCase("saturday")) {
	        	  System.out.println("The temperature on " + answer +" was " + temperatures[6]);
	          }
	          else if (answer.equalsIgnoreCase("sunday")) {
	        	  System.out.println("The temperature on " + answer +" was " + temperatures[0]);
	          }
	          else {
	        	  // error message upon receiving erroneous input
	        	  System.out.println("Uh oh!  You entered something unexpected!");
	        	  System.out.println("You can try again, just make sure to enter ");
	        	  System.out.println("either the day of the week you want to see ");
	        	  System.out.println("weather for OR just 'week' for data from the ");
	        	  System.out.println("entire week! ");
	          }
	          System.out.println("Would you like to enter something else? (y or n) ");
	          sentinel = scnr.nextLine();
	}
	System.out.println("Goodbye!");
	return;
}
}
