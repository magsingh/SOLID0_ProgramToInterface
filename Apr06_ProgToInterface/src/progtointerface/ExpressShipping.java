package progtointerface;

public class ExpressShipping extends Shipping{

	public ExpressShipping() {
		super();
		
	}
	public ExpressShipping(String d, double wt) {
		super(d,wt);
	}
	
	public double calculateShippingCost() {
		return weight * 30;
	}
	
	public String getShipmentDetails() {
		return "Express Shipping: Destination = " + destination + " for weight = " + weight;
	}

}
