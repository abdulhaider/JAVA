package interfaces;
import classes.*;
public interface RestuarantOperations
{
	void insertRestuarant(Restuarant r);
	void removeRestuarant(Restuarant r);
	Restuarant getRestuarant(String rid);
	void showAllRestuarants();
}