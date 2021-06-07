package Assignment2;

public class Finance extends CancerAssociation {
	String name;
	int participant;
	private double otherExpenses, eventExpenses, sponsorShip, eventFee;
	private double totalDonation;
	private double totalFundCollected;
	private double totalExpenditure;
	
	public Finance(String n, int participant, double otherExpenses, double eventExpenses, double sponsorShip, double eventFee) {
		super(n);
		this.otherExpenses = otherExpenses;
		this.eventExpenses = eventExpenses;
		this.sponsorShip = sponsorShip;
		this.eventFee = eventFee;
		this.participant = participant;
		
		Payment totalExpenditure = new GetPaymentFinance();	//Interface
		this.totalExpenditure = totalExpenditure.getPayment(eventExpenses, otherExpenses);
	}
	
	public double calTotalDonation(double fee, int participant, double sponsorShip) {//3 arguments
		totalDonation = (fee*participant)+sponsorShip;
		return totalDonation;
	}
	public double calTotalFundCollected(double eventFee, int participant) {//2 argument
		totalFundCollected = eventFee*participant;
		return totalFundCollected;
	}
	
	public double calTotalBalance() {
		return calTotalDonation(eventFee, participant, sponsorShip)-totalExpenditure;
	}
	
	public void printInfo() {
		System.out.println("-----------------------CAHAYA CANCER ASSOCIATION FINANCIAL STATEMENT---------------------");
		System.out.printf("%-20s       : RM%.2f%n", "Total Fund Collected from Event", calTotalFundCollected(eventFee, participant));
		System.out.printf("%-20s                  : RM%.2f%n", "Total Sponsorship", sponsorShip);
		System.out.printf("%-20s: RM%.2f%n", "Total Other Expense (bill, food, ads) ", otherExpenses);
		System.out.printf("%-20s                  : RM%.2f%n", "Total Event Expense", eventExpenses);
		System.out.printf("%-20s                  : RM%.2f%n", "Total Expenditure", totalExpenditure);
		System.out.printf("%-20s              : RM%.2f%n", "Total Donation Collected", calTotalDonation(eventFee, participant, sponsorShip));
		System.out.printf("%-20s                  : RM%.2f%n%n", "Total Balance", calTotalBalance());
		
	}

}
