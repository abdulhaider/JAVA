package interfaces;
import java.lang.*;
import classes.FoodItem;

public interface IQuantity
{
	public abstract void addQuantity(int amount);
	void sellQuantity(int amount);
}