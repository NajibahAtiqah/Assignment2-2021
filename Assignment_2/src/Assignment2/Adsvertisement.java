package Assignment2;

public class Adsvertisement extends Event {
	private int voucher;
	
	public Adsvertisement(String n, char event, int voucher) {
		super(n, event);
		System.out.println("__________________________________________________________________");
		System.out.println("             Join us now and be part of our story!");
		this.voucher = voucher;
		printInfo();
	}
	public void printInfo() {
		System.out.println("We are going to held: "+ super.getEventName());
		System.out.println("The fee is RM" + super.getEventFee() +" per person");
		System.out.println("For those that joining this, going to get Shoppee's voucher, RM"+ voucher+ " OFF!");
		eventLink();
		System.out.println();
	}
	public void eventLink() {
		System.out.println("For more details, you can browse the link that we provided below.");
		System.out.println("        https://www.cahayacancerassociation.com/event");
		System.out.println("__________________________________________________________________");
	}

}