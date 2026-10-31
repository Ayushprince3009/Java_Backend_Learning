package finance.oneloan;

import java.sql.SQLException;

public class Driver {
	public static void main(String[] args)  {
		OrderHistory order = new OrderHistory();
		
			try {
				order.getOrderHistory();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
