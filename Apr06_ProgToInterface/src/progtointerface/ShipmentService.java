package progtointerface;

import java.util.ArrayList;
import java.util.List;

public class ShipmentService {
	List<Shipping> shipments; 

	public ShipmentService() {
		shipments = new ArrayList<>();
	}
	
	public void addShipment(Shipping shipment) {
		shipments.add(shipment);
	}
	
	public void displayAllShipments() {
		for (Shipping s : shipments) {
			System.out.println(s.getShipmentDetails());
		}
	}
	
	public void calculateTotalShipmentCost() {
		double totalCost = 0.0;
		for (Shipping s: shipments) totalCost += s.calculateShippingCost();
		System.out.println("Total cost = " + totalCost);
	}
}
