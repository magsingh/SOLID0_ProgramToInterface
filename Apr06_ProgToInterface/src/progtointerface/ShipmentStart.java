package progtointerface;

public class ShipmentStart {

	public static void main(String[] args) {
		StandardShipping s1  = new StandardShipping("Delhi", 10);
		ExpressShipping s2  = new ExpressShipping("Mumbai", 7.5);
		StandardShipping s3  = new StandardShipping("Kolkata", 20.5);
		ExpressShipping s4  = new ExpressShipping("Chennai", 5.1);
		ShipmentService s = new ShipmentService();
		s.addShipment(s1);
		s.addShipment(s2);
		s.addShipment(s3);
		s.addShipment(s4);
		s.displayAllShipments();
		s.calculateTotalShipmentCost();

	}

}
