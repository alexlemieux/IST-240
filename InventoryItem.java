package pos;
public class InventoryItem
{
//	fields in the InventoryItem class
	private int sku;
	private String description;
	private String color;
	private boolean used;
	private String vendor;
	private int amountOnHand;
	private int amountOnOrder;
	private double unitPurchaseCost;
	private int minPurchaseQuantity;
	private double unitSalesPrice;
	private int minSalesQuantity;
	private double maxPercentDiscount;

	
	public InventoryItem(int sku, String description, String color, boolean used, String vendor,
	int amountOnHand, int amountOnOrder, double unitPurchaseCost, int minPurchaseQuantity,
	double unitSalesPrice, int minSalesQuantity, double maxPercentDiscount)
	{
		this.sku = sku;
		this.description = description;
		this.color = color;
		this.used = used;
		this.vendor = vendor;
		this.amountOnHand = amountOnHand;
		this.amountOnOrder = amountOnOrder;
		this.unitPurchaseCost = unitPurchaseCost;
		this.minPurchaseQuantity = minPurchaseQuantity;
		this.unitSalesPrice = unitSalesPrice;
		this.minSalesQuantity = minSalesQuantity;
		this.maxPercentDiscount = maxPercentDiscount;
	}

//	Accessors
	public int getSku()
	{
		return this.sku;
	}

	public String getDescription()
	{
		return this.description;
	}

	public String getColor()
	{
		return this.color;
	}
	
	public boolean getUsed()
	{
		return this.used;
	}
	
	public String getVendor()
	{
		return this.vendor;
	}

	public int getAmountOnHand()
	{
		return this.amountOnHand;
	}
	
	public double getUnitPurchaseCost()
	{
		return this.unitPurchaseCost;
	}
	
	public int getMinPurchaseQuantity()
	{
		return this.minPurchaseQuantity;
	}

	public double getUnitSalesPrice()
	{
		return this.unitSalesPrice;
	}

	public int getMinSalesQuantity()
	{
		return this.minSalesQuantity;
	}	

	public double getMaxPercentDiscount()
	{
		return this.maxPercentDiscount;
	}	
	
//. Mutators
	public void setSku(int value)
	{
		sku = value;
	}

	public void setDescription(String value)
	{
		description = value;
	}
	
	public void setColor(String value)
	{
		color = value;
	}
	
	public void setUsed(boolean value)
	{
		used = value;
	}
	
	public void setVendor(String value)
	{
		vendor = value;
	}
	
	public void setAmountOnHand(int value)
	{
		this.amountOnHand = value;
	}

	public void setAmountOnOrder(int value)
	{
		this.amountOnOrder = value;
	}
	
	public void setUnitPurchaseCost(double value)
	{
		this.unitPurchaseCost = value;
	}
	
	public void setMinPurchaseQuantity(int value)
	{
		this.minPurchaseQuantity = value;
	}
	
	public void setUnitSalesPrice(double value)
	{
		this.unitSalesPrice = value;
	}
	
	public void setMinSalesQuantity(int value)
	{
		this.minSalesQuantity = value;
	}
	
	public void setMaxPercentDiscount(int value)
	{
		this. maxPercentDiscount = maxPercentDiscount;
	}
	
}

	
	