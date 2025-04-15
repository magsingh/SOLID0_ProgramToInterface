package progtointerface;

public class StandardShipping extends Shipping{

	public StandardShipping() {
		super();
		
	}
	
	public StandardShipping(String d, double wt) {
		super(d, wt);
	}
	
	@Override
	public double calculateShippingCost() {
		return weight * 15;
	}
	
	@Override
	public String getShipmentDetails() {
		return "Standard Shipping: Destination = " + destination + " for weight = " + weight;
	}
}
