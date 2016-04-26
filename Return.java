package pos;
import java.util.*;
public class Return extends Transaction	
{
	Customer customer;
	InventoryItem item;
	int amount;
	double price;
	LineItem lineItem;

	public Return(Customer customer, InventoryItem item, int amount, double price)
	{
		super();
		this.customer = customer;
		this.item = item;
		this.amount = amount;
		this.price = price;
	}

//	Accessors

	public Customer getCustomer()
	{
		return this.customer;
	}
	
	public InventoryItem getItem()
	{
		return this.item;
	}
	
	public int getAmount()
	{
		return this.amount;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public LineItem getLineItem()
	{
		return lineItem;
	}
	
	
	public void setCustomer(Customer value)
	{
		this.customer = value;
	}
	
	public void setItem(InventoryItem value)
	{
		this.item = value;
	}
	
	public void setAmount(int value)
	{
		this.amount = value;
	}
	
	public void setPrice(double value)
	{
		this.price = value;
	}
	
	public void setLineItem(LineItem value)
	{
		this.lineItem = value;
	}
	
	public void makeTransaction()
	{
// 		Do the things needed to make your transaction

//		Check to make sure price isn't higher than the item's unitSalesPrice
//		If it's too high, return a false to alert calling method that sale can't be made, 
//		declare it void, but still fill in other return details (amount + the fields of the LineItem class)
		double highestPrice = item.getUnitSalesPrice();
		
//		*Fill in code here*

//		Otherwise, make return - you need to again fill in all return details (amount + fields of the LineItem class)

//		*Fill in code here*
	
	}
}