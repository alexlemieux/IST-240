package pos;
public class Transaction
{
	protected int transactionNumber;
	protected boolean isValid;
	public Transaction()
	{
		this.transactionNumber = getLastTransactionNumber() + 1;
		this.isValid = false;
	}

	public void makeTransaction() {}
	
	public LineItem getLineItem()
	{
		LineItem lineItem = new LineItem();
		return lineItem;
	}

	public int getLastTransactionNumber()
	{
		return 0;
	}
}