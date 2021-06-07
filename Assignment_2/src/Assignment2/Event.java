package Assignment2;
import java.util.Scanner;
public class Event extends CancerAssociation {//event inherit C.A
	
	private String name, eventName, eventLocation, eventDate, eventTime, eventDuration;
	char event;
	private double eventFee;

	public Event(String n, char event ) {
		super(n);
		this.event = event;
		
		if(this.event == 'A') {
			this.eventName = "Pink Ribbon Charity Dinner";
			this.eventLocation = "Shangri-La Hotel";
			this.eventDate="19 May 2021";
			this.eventTime="8.45 P.M";
			this.eventDuration = "2 Hours and 30 Minutes";
			this.eventFee = 80.00;
			
	}
		else if(this.event == 'B') {
			this.eventName = "Run For Pink Ribbon  ";
			this.eventLocation = "Recreational Forest,Malacca";
			this.eventDate="5 September 2021";
			this.eventTime="8.45 A.M";
			this.eventDuration = "2 Hours and 30 Minutes";
			this.eventFee = 50.00;	
			
	}
		else {
			this.eventName = "Let's Defeat Breast Cancer Together";
			this.eventLocation = "Hospital KPJ Ampang";
			this.eventDate="9 February 2021";
			this.eventTime="10.30 A.M";
			this.eventDuration = "2 Hours and 30 Minutes";
			this.eventFee = 15.00;	
		}
		}
		// Create Getter Method		
		  public String getEventName() {
			  return eventName;
			  
		  }
		  public String getLocation() {
			  return eventLocation;
			  
		  }
		  public String getEventDate() {
			  return eventDate;
		  }
		  
		  public String getEventTime() {
		 	  return eventTime;
		  }
		  
		  public String getEventDuration() {
			  return eventDuration;
		  }
		  public double getEventFee() {
			  return eventFee;
		  }
		
			public void printInfo() {
				System.out.println(
						 "\n ----------------------------------------"+
					     "\n        DETAILS ABOUT THE EVENT          "+             
						 "\n ----------------------------------------"+
						 "\n   Event   : "+eventName+"              "+
						 "\n   Venue   : "+eventLocation+"          "+
						 "\n   Date    : "+eventDate+"              "+
						 "\n   Time    : "+eventTime+"              "+
						 "\n   Duration: "+eventDuration+"          "+
						 "\n   Fee     : "+"RM "+eventFee+"         "+
						 "\n ----------------------------------------");
			}
}

