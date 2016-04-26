package pos;
import java.util.*;
public class TestPOS
{

	public static void main(String [] args)
	{
		Customer customer = new Customer(1, "Dave");
		boolean transactionCompleted;
		ArrayList<Transaction> transactions = new ArrayList<Transaction>();
		
/*		InventoryItem constructor:
		public InventoryItem(int sku, String description, String color, boolean used, String vendor,
		int amountOnHand, int amountOnOrder, double unitPurchaseCost, int minPurchaseQuantity,
		double unitSalesPrice, int minSalesQuantity, double maxPercentDiscount)
*/

//		Transaction 1
		InventoryItem item1 = new InventoryItem(1, "Fender Strat", "Fiesta Red", false, "Fender", 2, 0, 350.00, 1, 500.00, 1, 15);
		int amount1 = 1;
		double price1 = 500.0;
		Transaction t1 = new Sale(customer, item1, amount1, price1);
		t1.makeTransaction();
		transactions.add(t1);
		
//		Transaction 2
		InventoryItem item2 = new InventoryItem(2, "Ernie Ball Regular Slinkies", "Yellow", false, "Ernie Ball", 20, 24, 3.00, 12, 5.00, 1, 15);
		int amount2 = 3;
		double price2 = 4.5;
		Transaction t2 = new Sale(customer, item2, amount2, price2);
		t2.makeTransaction();
		transactions.add(t2);

//		Transaction 3
		InventoryItem item3 = new InventoryItem(3, "Levy's Strap", "Black", false, "Levy's Leathers", 3, 0, 12.00, 12, 15.0, 1, 15.0);
		int amount3 = 1;
		double price3 = 15.00;
		Transaction t3 = new Return(customer, item3, amount3, price3);
		t3.makeTransaction();
		transactions.add(t3);

//		Take payment, make order, and write receipt		
		Money payment = new Money(600, 0, 0, 0);
		Date date = new Date();
		Order order1 = new Order(date, customer, transactions, payment);
		order1.writeReceipt();
	}

}