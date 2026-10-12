package ecom.order.mgmt;

public class DiscountCalculator {
	public int calculateDisscount(int amount, String type, int discount) {
		int finalAmount = 0;
		
		switch(type) {
		
		case "REGULAR":
			finalAmount = amount - (amount * discount)/ 100;
			break;
			
		case "GOLD":
			finalAmount = amount - (amount * discount)/100 - 100;
			break;
			
		default:
			finalAmount = amount;
			break;
		}
		
		return finalAmount;
	}
}
