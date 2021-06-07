package Assignment2;
import java.util.*;
public class ParticipantRegistration extends Event{//PR inherit Events interface Payment
	
	private String name;
	private char gender;
	private String email;
	private String phoneNum;
	private int donation;
	
	Scanner s = new Scanner(System.in);
	
	public ParticipantRegistration(String name, char event){ 
		super(name, event);
	
		System.out.println(super.getEventName()+"'s Registration");
		System.out.println("-------------------------------------------------");
		System.out.println("Please enter the needed information in order to join the event.");
		System.out.print("\n1. Name        : ");
		this.name = s.next() + s.nextLine();
		System.out.print("\n2. Gender      : ");
		this.gender = s.next().charAt(0);
		System.out.print("\n3. Email       : ");
		this.email = s.next() + s.nextLine();
		System.out.print("\n4. Phone Number: ");
		this.phoneNum = s.next() + s.nextLine();
		printInfo();
		
}
	
	public void donationCollected() {
		System.out.println("Donation is not about giving. It's making a difference. Any donation?");
		System.out.println("Enter amount: RM ");
		this.donation = s.nextInt();
		System.out.println("Thankyou for your generous gift to Cahaya Cancer Association");
	}
	
	public void printDetails() {
		System.out.println("............................................................."); 
		System.out.println("              Participant Registration Details"               );
		System.out.println(".............................................................");
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender); 
	    System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNum);
		System.out.println(".............................................................");
	}
	public void confirmRegistration() {
		System.out.print("\nPlease check again your details. \nIf correct please press 1, otherwise please press 2.");
		System.out.print("\n>>>>>>>>>> ");
		int registerOption = s.nextInt();
		
		if(registerOption == 1) {
			System.out.println("\nYou're done! You had been registered to our system! And here is the summary of your details.");
			
		}
		if(registerOption == 2) {
			System.out.println("Please register again!");
	
	}
}
	
	public void printInfo() {
		confirmRegistration();
		
		
	}
}
