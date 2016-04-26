package pos;
import java.util.*;
import java.io.*;
public class Order
{
	Date orderDate;
	int orderNumber;
	Customer customer;
	ArrayList<Transaction> transactions;
	double subTotal;
	double salesTax;
	double grandTotal;
	String paymentType;
	Money payment;
	double salesTaxRate;
	
	public Order(Date orderDate, Customer customer, ArrayList<Transaction> transactions, Money payment)
	{
		this.orderDate = orderDate;
		this.orderNumber = getNewOrderNumber();
		this.customer = customer;
		this.transactions = transactions;
		this.payment = payment;
		this.salesTaxRate = 0.06;
	}
	
//	Accessors
	public Date getOrderDate()
	{
		return this.orderDate;
	}
	
	public int getOrderNumber()
	{
		return this.orderNumber;
	}
	
	public Customer getCustomer()
	{
		return this.customer;
	}
	
	public ArrayList<Transaction> getTransactions()
	{
		return this.transactions;
	}
	
	public double getSubTotal()
	{
		return this.subTotal;
	}
	
	public double getSalesTax()
	{
		return this.salesTax;
	}
	
	public double getGrandTotal()
	{
		return this.grandTotal;
	}
	
	public String getPaymentType()
	{
		return this.paymentType;
	}
	
	public Money getPayment()
	{
		return this.payment;
	}
	
	public void setOrderDate(Date value)
	{
		this.orderDate = value;
	}
	
	public void setOrderNumber(int value)
	{
		this.orderNumber = value;
	}
	
	public void setCustomer(Customer value)
	{
		this.customer = value;
	}
	
	public void setTransactions(ArrayList<Transaction> value)
	{
		this.transactions = value;
	}
	
	public void setSubTotal(double value)
	{
		this.subTotal = value;
	}
	
	public void setSalesTax(double value)
	{
		this.salesTax = value;
	}
	
	public void setGrandTotal(double value)
	{
		this.grandTotal = value;
	}
	
	public int getNewOrderNumber()
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("orderNumber.txt"));
			String line = "";
			
//			Writerest of code here to get new order number and return it
			return 0;  // In general, you're not going to return 0
		}
		catch(IOException e)
		{
			System.out.println("IOException reading/writing order number file");
			return -1;
		}
	}
	
	public void writeReceipt()
	{
//		Little piece of code to print order number and date/time in two different formats
		System.out.println("\n" + "Order Number: " + orderNumber);
		System.out.println("Order Date: " + orderDate);
		long msOrderDate = orderDate.getTime();
		System.out.println("Order Date in milliseconds from January 1, 1970: " + msOrderDate);
		
//		Write rest of code to write receipt

	}
}


	
	
	