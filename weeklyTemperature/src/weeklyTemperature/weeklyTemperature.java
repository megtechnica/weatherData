package weeklyTemperature;
import java.util.Scanner;
import java.util.*;

public class weeklyTemperature {
	public static void main(String [] args) { 
	      Scanner scnr = new Scanner(System.in);
	      // instantiate variables
	      String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	      double[] temperatures = {78.9, 75.6, 73.4, 68.9, 72.4, 74.5, 73.4};
	      String sentinel = "n";
	      
	      int i;
	      double dailyTemperature;
	      
	      // output instructions to user
	      System.out.println("--Welcome to the Weather App--");
	      System.out.println("         Intructions:         ");
	      System.out.println("Either enter the day of the week ");
	      System.out.println("you would like to see temp data for ");
	      System.out.println("OR enter 'Week' and see the whole week. ");
	      
	      
	      while (sentinel.toLowerCase() != "y") {
	    	  System.out.println("What would you like to do? ");
	          String answer = scnr.nextLine();
	          // if week is entered, display each day of the week
	          // and the temperature entered as well as the average
	          if (answer.toLowerCase() == "week") {
	        	  double sum = 0;
	        	  for (i=0; i <= days.length; i ++) {
	        		  System.out.println(days[i] + ": " + temperatures[i] + " degrees farenheit. ");
	        		  sum = temperatures[i] + sum;
	        		  }
	        	  double averageTemperature = sum / temperatures.length;
	        	  System.out.println("Average temperature: " + sum + " degrees farenheit. ");
	        	  }
	          else if (answer.toLowerCase() == "monday") {
	        	  System.out.println("The temperature on " + answer +" was " + temperatures[1]);
	          }
//	          else if (answer.toLowerCase() == "tuesday") {
//	        	  System.out.println("Enter the temperature on " + answer +": ");
//	        	  dailyTemperature = scnr.nextDouble();
//	        	  temperatures[2] = dailyTemperature;
//	          }
//	          else if (answer.toLowerCase() == "wednesday") {
//	        	  System.out.println("Enter the temperature on " + answer +": ");
//	        	  dailyTemperature = scnr.nextDouble();
//	        	  temperatures[3] = dailyTemperature;
//	          }
//	          else if (answer.toLowerCase() == "thursday") {
//	        	  System.out.println("Enter the temperature on " + answer +": ");
//	        	  dailyTemperature = scnr.nextDouble();
//	        	  temperatures[4] = dailyTemperature;
//	          }
//	          else if (answer.toLowerCase() == "friday") {
//	        	  System.out.println("Enter the temperature on " + answer +": ");
//	        	  dailyTemperature = scnr.nextDouble();
//	        	  temperatures[5] = dailyTemperature;
//	          }
//	          else if (answer.toLowerCase() == "saturday") {
//	        	  System.out.println("Enter the temperature on " + answer +": ");
//	        	  dailyTemperature = scnr.nextDouble();
//	        	  temperatures[6] = dailyTemperature;
//	          }
//	          else if (answer.toLowerCase() == "sunday") {
//	        	  System.out.println("Enter the temperature on " + answer +": ");
//	        	  dailyTemperature = scnr.nextDouble();
//	        	  temperatures[0] = dailyTemperature;
//	        	  System.out.println("The temperature on " + answer +" was " + dailyTemperature);
//	          }
//	          else {
//	        	  // error message upon receiving erroneous input
//	        	  System.out.println("Uh oh!  You entered something unexpected!");
//	        	  System.out.println("You can try again, just make sure to enter ");
//	        	  System.out.println("either the day of the week you want to see ");
//	        	  System.out.println("weather for OR just 'week' for data from the ");
//	        	  System.out.println("entire week! ");
//	          }
//	          System.out.println("Would you like to enter something else? (y or n) ");
//	          sentinel = scnr.nextLine();
	}
}
}
