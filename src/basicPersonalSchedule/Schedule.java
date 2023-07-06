package basicPersonalSchedule;

import java.util.Scanner;

public class Schedule {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String [] [] appointments = new String [31] [24];
		
		boolean finish = false;
		boolean validDay = false;
		boolean validHour = false;
		int menu;
		int day = 0;
		int hour = 0;
		
		while(finish=false) {
			System.out.println("Press 1 to add a new appointment:");
			System.out.println("Press 2  to check your appointments:");
			System.out.println("Press O to close this program:\n");
			
			menu = scan.nextInt();
			
			if ( menu==0) {
				finish = true;
				System.out.println("Thanks for you visit. Bye!");
			
			} else if ( menu==1) {
				// add appointment
				while (validDay=false) {
					System.out.println("What day you want to edit?");
					day = scan.nextInt();
					
					day--; // because the position in memory is -1 then the day.
					if (day>0 || day<=31) {
						validDay = true;
					}else {
						System.out.println("Invalid day. Write again.");
					}
				} 
				
				while (validHour = false) {
					System.out.println("What hour you want to edit?");
					hour = scan.nextInt();
					
					if (hour>=0 || hour<=24) {
						validDay = true;
					}else {
						System.out.println("Invalid hour. Write again.");
					}
				}
				
				System.out.println("Write here your appointment for day: "+ day+ " and hour: "+ hour);
				appointments [day] [hour] = scan.next();
				
				
				
			} else if (menu == 2) { //check appointment
				
				while (validDay=false) {
					System.out.println("What day you want to check");
					day = scan.nextInt();
					
					day--; // because the position in memory is -1 then the day.
					if (day>0 || day<=31) {
						validDay = true;
					}else {
						System.out.println("Invalid day. Write again.");
					}
				} 
				
				while (validHour = false) {
					System.out.println("What hour you want to check?");
					hour = scan.nextInt();
					
					if (hour>=0 || hour<=24) {
						validDay = true;
					}else {
						System.out.println("Invalid hour. Write again.");
					}
				}
				
				System.out.println("Your appointment is= "+ appointments[day][hour]);
				
				
			} else {
				System.out.println("Write again, 1 for add, 2 for check ou 0 to close");	
			}
		}
		
		
	}
}
