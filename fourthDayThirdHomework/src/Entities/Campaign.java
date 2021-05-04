package Entities;

public class Campaign
{
	private int id;
	private String name;
	private int discountAmount;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getDiscountAmount()
	{
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount)
	{
		this.discountAmount = discountAmount;
	}
}
