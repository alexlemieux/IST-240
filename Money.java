package pos;
public class Money
{
	double cashAmount;
	double checkAmount;
	double creditAmount;
	double debitAmount;

	public Money(double cashAmount, double checkAmount, double creditAmount, double debitAmount)
	{
		this.cashAmount = cashAmount;
		this.checkAmount = checkAmount;
		this.creditAmount = creditAmount;
		this.debitAmount = debitAmount;
	}

	public double getCashAmount()
	{
		return this.cashAmount;
	}
	
	public double getCheckAmount()
	{
		return this.checkAmount;
	}
	
	public double getCreditAmount()
	{
		return this.creditAmount;
	}
	
	public double getDebitAmount()
	{
		return this.debitAmount;
	}
	
	public void setCashAmount(double value)
	{
		this.cashAmount = value;
	}
	
	public void setCheckAmount(double value)
	{
		this.checkAmount = value;
	}
	
	public void setCreditAmount(double value)
	{
		this.creditAmount = value;
	}
	
	public void setDebitAmount(double value)
	{
		this.debitAmount = value;
	}
}