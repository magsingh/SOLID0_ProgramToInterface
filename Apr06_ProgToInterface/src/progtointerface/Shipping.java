package progtointerface;

abstract class Shipping {

	protected String destination;
	protected double weight;
	
	public Shipping() {
		destination = "Unknown";
		weight = 0.0;
		
	}
	public Shipping(String d, double wt) {
		this.destination = d;
		this.weight = wt;
	}
	
	public abstract double calculateShippingCost();
	
	public abstract String getShipmentDetails();

}
