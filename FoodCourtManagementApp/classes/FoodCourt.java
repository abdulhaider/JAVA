package classes;
import java.lang.*;
import interfaces.*;

public class FoodCourt implements RestuarantOperations, EmployeeOperations
{
	private Restuarant restuarants[] = new Restuarant[800];
	private Employee employees[] = new Employee[100];
	
	public void insertRestuarant(Restuarant r)
	{
		int flag = 0;
		
		for(int i=0; i<restuarants.length; i++)
		{
			if(restuarants[i] == null)
			{
				restuarants[i] = r;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Restuarant Inserted");}
		else{System.out.println("Restuarant can Not be Inserted");}
	}
	
	public void removeRestuarant(Restuarant r)
	{
		int flag = 0;
		for(int i=0; i<restuarants.length; i++)
		{
			if(restuarants[i] == r)
			{
				restuarants[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Restuarant Removed");}
		else{System.out.println("Restuarant can Not be Removed");}
	}
	
	public Restuarnt getRestuarant(String rid)
	{
		Restuarant r = null;
		
		for(int i=0; i<restuarants.length; i++)
		{
			if(restuarants[i] != null)
			{
				if(restuarants[i].getRid() == rid)
				{
					r = restuarants[i];
					break;
				}
			}
		}
		return c;
	}
	
	public void showAllRestuarants()
	{
		for(Restuarant r : restuarants)
		{
			if(c!= null)
			{
				System.out.println("**********************************");
				System.out.println("Restuarant Name: "+ r.getName());
				System.out.println("Restuarant Rid: "+ r.getRid());
				System.out.println("----------------------------------");
				r.showAllRestuarants();
				System.out.println("----------------------------------");
				System.out.println();
			}
		}
	}
	public void insertEmployee(Employee e)
	{
		int flag = 0;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Employee Inserted");}
		else{System.out.println("Employee can Not be Inserted");}
	}
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Employee Removed");}
		else{System.out.println("Employee can Not be Removed");}
	}
	public void showAllEmployees()
	{
		System.out.println("/////////////////////////////////");
		for(Employee e : employees)
		{
			if(e!= null)
			{
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee Id: "+ e.getEmpId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
		System.out.println("/////////////////////////////////");
	}
	
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
}