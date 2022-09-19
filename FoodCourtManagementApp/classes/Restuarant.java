package classes;
import java.lang.*;
import interfaces.*;

public class Restuarant implements FoodItemOperations
{
	private String rid;
	private int name;
	private FoodItem fooditems[] = new FoodItem [10];
	
	
	public void setName(String name){this.name = name;}
	public void setRid(int rid){this.rid = rid;}
	
	
	public String getName(){return name;}
	public int getRid(){return rid;}
	
	public void insertFooditem(FoodItem f)
	{
		int flag = 0;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == null)
			{
				fooditems[i] = f;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Food Item Inserted");
		}
		else
		{
			System.out.println("Can Not Insert Food Item");
		}
	}
	
	public void removeFoodItem(FoodItem f)
	{
		int flag = 0;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == f)
			{
				fooditems[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Food Item Removed");}
		else{System.out.println("Can Not Remove Food Item");}
	}
	
	public void showAllFoodItems()
	{
		for(FoodItem f: fooditems)
		{
			if(f != null)
			{
				f.showInfo();
			}
		}
	}
	public FoodItem getFoodItem(String fid)
	{
		FoodItem f = null;
		
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] != null)
			{
				if(fooditems[i].getFoodItem() == fid)
				{
					f = fooditems[i];
					break;
				}
			}
		}
		return f;
	}
	
}