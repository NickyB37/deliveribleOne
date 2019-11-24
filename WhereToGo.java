package deliveribleOne;

import java.util.Scanner;

public class WhereToGo {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String vacationSuggestion = null;
		String travelSuggestion = null;
		String result = null;
		
		System.out.println("What type of vacation do you want to go on 'Musical', 'Tropical, or Adventurous?");
		String vacationType = scnr.nextLine();
 
		if (vacationType.contentEquals("Tropical")) {
			vacationSuggestion = "Beach Vacation in Mexico";
		
		} else if (vacationType.contentEquals("Musical")) {
			vacationSuggestion = "New Orleans";
		
		} else if (vacationType.contentEquals("Adventurous")) {
			vacationSuggestion = "Whitewater Rafting the Grand Canyon";
		}
		

		System.out.println("What is the size of your group?");
		int groupSize = scnr.nextInt();
		// scnr.nextLine();
		
		if (groupSize >= 1 && groupSize <= 2) {
			travelSuggestion = "First Class";
		
		} else if (groupSize >=3 && groupSize <= 5) {
			travelSuggestion = " Helicopter ";
		}
		else if (groupSize >= 6) {
			travelSuggestion = " Charter Flight";
		}
		
		result = ("Since you're a group of " + groupSize + " going on a " + vacationType + " vacation , " + "you should take a "+ travelSuggestion + " to the " + vacationSuggestion);
		System.out.println(result);
		
	}
}
