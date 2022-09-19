package classes;
import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity
{
	protected String fid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	
	public void setFid(String fid){this.fid = fid;}
	public void setName(String name){this.name = name;}
public void setAvailableQuantity(int quantity){this.quantity = quantity;}
}
	public void setPrice(double price){this.price = price;}
	
	public String getFid(){return fid;}
	public String getName(){return name;}
	public int getAvailableQuantity(){return quantity;}
	public double getPrice(){return price;}
	
	public abstract void showInfo();
	
	public void addQuantity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Stock Quantity: "+ quantity);
			System.out.println("Added Quantity: "+ amount);
			quantity += amount;
			System.out.println("Current Quantity: "+ quantity);
		}
		else
		{
			System.out.println("Can Not Add!");
		}
	}
	public void sellQuantity(int amount)
	{
		if(amount>0 && amount<=quantity)
		{
			System.out.println("Stock Quantity :	"+ quantity);
			System.out.println("Sold Quantity:	"+ amount);
			quantity -= amount;
			System.out.println("Current Quantity:	"+ quantity);
		}
		else
		{
			System.out.println("Can Not Sell!");
		}
	}
}