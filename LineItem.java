package pos;
public class LineItem
{
	private String transactionType;
	private int amount;
	private int sku;
	private String description;
	private boolean used;
	private double unitPrice;
	private double extendedPrice;
	private String message;

//	Accessors
	public String getTransactionType()
	{
		return this.transactionType;
	}
	
	public int getAmount()
	{
		return this.amount;
	}
	
	public int getSku()
	{
		return this.sku;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public boolean getUsed()
	{
		return this.used;
	}
	
	public double getUnitPrice()
	{
		return this.unitPrice;
	}
	
	public double getExtendedPrice()
	{
		return this.extendedPrice;
	}
	
	public String getMessage()
	{
		return this.message;
	}

//	Mutators	
	public void setTransactionType(String value)
	{
		this.transactionType = value;
	}
	
	public void setAmount(int value)
	{
		this.amount = value;
	}
	
	public void setSku(int value)
	{
		this.sku = value;
	}
	
	public void setDescription(String value)
	{
		this.description = value;
	}
	
	public void setUsed(boolean value)
	{
		this.used = value;
	}
	
	public void setUnitPrice(double value)
	{
		this.unitPrice = value;
	}
	
	public void setExtendedPrice(double value)
	{
		this.extendedPrice = value;
	}
	
	public void setMessage(String value)
	{
		this.message = value;
	}


}