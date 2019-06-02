//---------------------------------------------------------------------------------------------------------
// ElevatorTest2.java					Author: Debra Ragland 				CPSC 50100
//
// This is what I consider to be a "simplified" version of my original elevator program.
// 
// The program is designed to interactively "pick up a passenger" from their location and bring 
//	and them to their desired destination. The elevator is resting in the elevator at the start of
// 		of the program and is designed to pick one passenger up and and take them to a different location.
//----------------------------------------------------------------------------------------------------------




import java.util.Scanner;

public class ElevatorTest2 {
	
	static int[] bldg = {0, 1, 2};
	static int zone1, zone2;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
// Alert the user that the elevator is resting in the basement and prompts them indicate what floor they are on. 
		
		System.out.print("The elevator is currently in the basement (B...).");
		System.out.println();
		System.out.print("On which floor are you waiting for the elevator? " +
		"Please select 0 for basement, 1 for 1st floor, or 2 for second floor: ");
		zone1 = scan.nextInt();
		
// Once the "button is pushed" the elevator "goes up" to pick up the passenger. 
	
		if(zone1 == bldg[0]) {
			System.out.println("The elevator doors are open. Please enter.");
			System.out.println(); 
		} else if(zone1 == bldg[1]) {
			System.out.println("The button has been pushed at 1");
			ElevatorInitial();
	    } else if (zone1 == bldg[2]) {
	    	System.out.println("The button has been pushed at 2");
	    	ElevatorInitial();
	    }
// After picking up the passenger, program prompts the user to indicate the floor they want to go to. 
		
	 System.out.println();	
	 System.out.print("Where would you like the elevator to take you?");
	 zone2 = scan.nextInt();
	 System.out.println("The elevator doors are now closed.");
	 System.out.println();
	 
		if(zone2 < zone1) {
				ElevatorDown(zone1);
			}
		else 
			if(zone2 > zone1) {
				ElevatorUp(zone1);
			}
		scan.close();
	}
	

// These methods are used to clean up the repeated activities in the above code. 
	
	private static void ElevatorInitial() {
		System.out.println("The elevator is going up.");
		for (int i = 0; i <= zone1; i++) {
			System.out.println("The elevator is at " + i);
			if (i == zone1) {
				System.out.println("The elevator doors are now open at " + i);
			}
		}
	}


	private static void ElevatorUp(int elevatorposition) {
	System.out.println("The elevator is going up.");
	for (int i = elevatorposition; i <= zone2; i++)
		System.out.println("The elevator is at "+ i);
	System.out.println("The doors of the elevator are now open. Please exit the elevator.");
	System.out.println("The elevator doors are now closed.");
	
    }
	private static void ElevatorDown(int elevatorposition) {
		System.out.println("The elevator is going down.");
		for (int i = elevatorposition; i >= zone2; i--)
			System.out.println("The elevator is  at "+ i);
		System.out.println("The doors of the elevator are now open. Please exit the elevator.");
		System.out.println("The elevator doors are now closed.");
	}

}
	