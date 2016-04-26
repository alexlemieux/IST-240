package pos;
public class Customer
{
	private int customerID;
	private String name;

	public Customer(int customerID, String name)
	{
		this.customerID = customerID;
		this.name = name;
	}

	public Customer()
	{
		this(0, "");
	}

	public int getCustomerID()
	{
		return this.customerID;
	}

	public String getName()
	{
		return this.name;
	}

	public void setCustomerID(int value)
	{
		this.customerID = value;
	}

	public void setName(String value)
	{
		this.name = value;
	}

}