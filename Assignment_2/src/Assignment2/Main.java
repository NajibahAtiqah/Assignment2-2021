package Assignment2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int loginOption;
		char event;
		
		 System.out.println("                 _______________________________________________");
		 System.out.println("                      xx CAHAYA CANCER ASSOCIATION xx");
		 System.out.println("                                 EST 2009");
		 System.out.println("                 _______________________________________________");
		 System.out.println();
		 
		    System.out.println("     ==============================");
			System.out.println("     |                            |");
			System.out.println("     |          ABOUT US          |");
			System.out.println("     ==============================");
			System.out.println("Name: Cahaya Cancer Association ");
			System.out.println("Address: PT 195, Taman Manis, 17500, Tanah Merah, Kelantan");
			System.out.println("Contact Number: \n"+"(1) 09-9555875 (Office)"
					+ "\n"+"(2) 09-9551613 (Fax)");
			System.out.println("Email: cahaya.association@gmail.com");
			System.out.println("Website: www.cahayacancerassociationtm.com.my");
			System.out.println("What We Do: We want to raise public awareness about cancer through education ");
			
			System.out.println("Choose Option: \n(1) Participant Registration"
			 		+ " \n(2) Admin \n");
			
			do {
				System.out.println("Enter your option: ");
				int loginOption1 = s.nextInt(); 
				 if(loginOption1 == 1) {
					 System.out.print("Which action would you like to proceed:"
								+ "\nA) Pink Ribbon Charity Dinner Registeration"
								+ "\nB) Run For Pink Ribbon Registeration"
								+ "\nC) Let's Defeat Breast Cancer Together"
								+ "\nEnter option: ");
						event = s.next().charAt(0);
						
			Adsvertisement ads = new Adsvertisement("Cahaya Cancer Association",  event, 15);
			Event E1 = new Event("Cahaya Cancer Association", event);
			E1.printInfo();
			System.out.println();
			
			ParticipantRegistration PR = new ParticipantRegistration("Cahaya Cancer Association", event);
			PR.printDetails();
			System.out.println();
			PR.donationCollected();
		
			   }
				 else {
					 System.out.println("Hi, Admin!");
					 System.out.println("Here is our financial statement.");
					 Finance F = new Finance("Cahaya Cancer Association", 30, 2345.90, 9875.65, 10000.00, 80);
					 F.printInfo();
			   }
			   System.out.println("Continue? 1) Yes 2) No") ;
			   loginOption = s.nextInt();
			}while(loginOption == 1);
	}
}
	
	 
			

