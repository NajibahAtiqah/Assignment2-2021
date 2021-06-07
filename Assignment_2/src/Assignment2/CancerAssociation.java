package Assignment2;

public abstract class CancerAssociation {//define superclass as abstract
	protected String name;
	
	public CancerAssociation(String n) {
		this.name = n;
		
	}
	
	public abstract void printInfo();
}
