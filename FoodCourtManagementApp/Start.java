import java.lang.*;
import classes.*;
import interfaces.*;
import fileio.*;
import java.util.*;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Restaurant r = new Restaurant();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		boolean choice = true;
		
		while(choice)
		{
			System.out.println("Choose from the Following Options: ");
			System.out.println("--------------------------------------");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant FoodItem Management");
			System.out.println("4. FoodItem Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println("--------------------------------------\n");
			
			System.out.print("You have chosen:  ");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
				
					System.out.println("********************");
					System.out.println("Employee Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove an Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search an Employee");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input1 = sc.nextInt();
					
					switch(input1)
					{
						case 1:
							
							System.out.println("#####################");
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							
							System.out.print("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary);
							
							r.insertEmployee(e1);
							
							System.out.println("#####################");
							break;
							
						

						case 2:
							
							System.out.println("#####################");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = r.getEmployee(empId2);
							r.removeEmployee(e2);
							
							
							System.out.println("#####################");
							break;	

						case 3:
							
							System.out.println("#####################");
							System.out.println("Show All Employees");
							
							r.showAllEmployees();
							System.out.println("#####################");
							break;	
							
						case 4: 
							
							System.out.println("#####################");
							System.out.println("Search An Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId4 = sc.next();
							
							Employee e4 = r.getEmployee(empId4);
							
							if(e4 !=null)
							{
								System.out.println("Employee ID: "+e4.getEmpId());
								System.out.println("Employee Name: "+e4.getName());
								System.out.println("Employee Salary: "+e4.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exists");
							}
							System.out.println("#####################");
							break;	

						case 5:
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
				
				case 2:
				
					System.out.println("********************");
					System.out.println("Restaurant Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Restaurant");
	                System.out.println("2. Remove an Existing Restaurant");
					System.out.println("3. Show All Restaurant");
					System.out.println("4. Search Restaurant");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input2 = sc.nextInt();
					
					switch(input2)
					{
						case 1:
							
							System.out.println("#####################");
							System.out.println("Insert New Restaurant");
							
							System.out.print("Enter Restaurant Rid: ");
							String Rid1 = sc.next();
							
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();
							
							
		
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
				
							r.insertResaurant(r1);
							
							System.out.println("#####################");
							break;
							
						

						case 2:
							
							System.out.println("#####################");
							System.out.println("Remove Existing Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid2 = sc.next();
							
							Restaurent r2 = r.getRestaurant(rid2);
							r.removeRestaurant(r2);
							
							
							System.out.println("#####################");
							break;	

						case 3:
							
							System.out.println("#####################");
							System.out.println("Show All Restaurants");
							
							r.showAllRestaurants();
							System.out.println("#####################");
							break;	
							
						case 4:
							
							System.out.println("#####################");
							System.out.println("Search a Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid4 = sc.next();
							
							Restaurant r4 = r.getRestaurant(rid4);
							
							if(r4 !=null)
							{
								System.out.println("Restaurant RID: "+r4.getRid());
								System.out.println("Restaurant Name: "+r4.getName());
								r4.showAllFoodItems();
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							System.out.println("#####################");
							break;	

						case 5:
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
					
				case 3:
				
					System.out.println("********************");
					System.out.println("Restaurant FoodItem Management");
					
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert a New FoodItem");
					System.out.println("2. Remove an Existing FoodItem");
					System.out.println("3. Show All FoodItem");
					System.out.println("4. Search a FoodItem");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input3 = sc.nextInt();
					
					switch(input3)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Insert New FoodItem\n");
							
							System.out.println("Which Type of FoodItem Do you Want to Create?");
							System.out.println("1. MainDish");
							System.out.println("2. Appitizers");
							System.out.println("3. Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							FoodItem f = null;
							
							if(type == 1)
							{
								System.out.print("Enter FoodItem FID: ");
								String fid1 = sc.next();
								System.out.print("Enter Food Name: ");
								String name1 = sc.next();
								System.out.print("Enter Available Quantity: ");
								int quantity1 = sc.nextInt();
								System.out.print("Enter Price: ");
								double price1 = sc.nextDouble();
								System.out.print("Enter Food Category: ");
								String category1 = sc.next();
								
								MainDish m1 = new MainDish();
								
								m1.setFoodItem(fid1);
								m1.setName(name1);
								m1.setAvailableQuantity(quantity1);
								m1.setPrice(price1);
								m1.setCategory(category1);
								
								f = m1;
							}
							else if(type == 2)
							{
								System.out.print("Enter FoodItem FID: ");
								String fid1 = sc.next();
								System.out.print("Enter Food Name: ");
								String name1 = sc.next();
								System.out.print("Enter Available Quantity: ");
								int quantity1 = sc.nextInt();
								System.out.print("Enter Price: ");
								double price1 = sc.nextDouble();
								System.out.print("Enter Food Size: ");
								String size1 = sc.next();
								
								Appitizers a1 = new Appitizers();
								
								a1.setFoodItem(fid1);
								a1.setName(name1);
								a1.setAvailableQuantity(quantity1);
								a1.setPrice(price1);
								a1.setSize(size1);
								
								f = a1;
							}
							else if(type == 3)
							{
								System.out.println("Going Back....");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							
							if(f != null)
							{
								System.out.print("Enter FoodItem FID: ");
								String fid1 = sc.next();
								
								r.getFid(fid1).insertFoodItem(f1);
								
								
							}
							
							System.out.println("#####################");
							break;
							
						
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Remove an Existing FoodItem");
							
							System.out.print("Enter FoodItem FID: ");
							String fid2 = sc.next();
							System.out.print("Enter Food Name: ");
							String name2 = sc.next();
							System.out.print("Enter Available Quantity: ");
							int quantity2 = sc.nextInt();
							System.out.print("Enter Price: ");
							double price2 = sc.nextDouble();
							
							r.getFid(fid2).removeFoodItem(r.getFid(fid2).getFid(fid2));
							
							
							System.out.println("#####################");
							break;
							
						case 3:
						
							System.out.println("#####################");
							System.out.println("Show All FoodItem");
							System.out.print("Enter FoodItem FID ");
							String fid3 = sc.next();
							
							r.getFid(fid3).showAllFoodItems();
							
							System.out.println("#####################");
							break;
							
							case 4:
						
							System.out.println("#####################");
							System.out.println("Search a FoodItem");
							
							System.out.print("Enter FoodItem: ");
							String fid4 = sc.next();
							System.out.print("Enter FoodItem Name: ");
							String name4 = sc.next();
							
							
							FoodItem f = r.getFoodItem(fid4).getName(name4);
							
							
							
							if(f != null)
							{
								f.showInfo();
							}
							
							System.out.println("#####################");
							break;
						
						case 5:
						
							System.out.println("#####################");
							System.out.println("Going Back ....");
							System.out.println("#####################");
							break;
							
						default:

							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
						
					}
					
					System.out.println("********************");
					break;
								
				case 4:
				
					System.out.println("********************");
					System.out.println("FoodItem Quantity Add-Sell");
					
					
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Add FoodItem");
					System.out.println("2. Sell FoodItem");
					System.out.println("3. Show Add-Sell History ");
					System.out.println("4. Go Back");
					System.out.println("--------------------------------------\n");
					
					System.out.print("Enter your option: ");
					int input4 = sc.nextInt();
					
					switch(input4)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Add FoodItem\n");
							
							System.out.print("Enter FoodItems FID: ");
							String fid1 = sc.next();
							System.out.print("Enter FoodItem Name");
							String name1 = sc.next ();
							System.out.print("Enter Available Quantity: ");
							int quantity1 = sc.nextInt();
							System.out.print("Enter Price: ");
							double price1 = sc.nextDouble();
							System.out.print("Enter Quantity To Be Added: ");
							int amount1 = sc.nextInt();
							
							if(quantity1>0)
							{
								r.getFid(fid1).getName(name1).addQuantity(amount1);
								
								
								frwd.writeInFile("Add	: "+ amount1+" in "+ fid1);
							}
							
							System.out.println("#####################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Sell FoodItem");
							
							System.out.print("Enter FoodItems FID: ");
							String fid2 = sc.next();
							System.out.print("Enter FoodItem Name");
							String name2 = sc.next();
							System.out.print("Enter Available Quantity: ");
							int quantity2 = sc.nextInt();
							System.out.print("Enter Price: ");
							double price2 = sc.nextDouble();
							System.out.print("Enter Quantity To Be Sold: ");
							int amount2 = sc.nextInt();
							
							if(quantity2>0 && quantity2 <= r.getFid(fid2).getName(name2).sellQuantity(amount))
							{
								r.getFid(fid2).getName(name2).sellQuantity(amount2);
								
								
								
								frwd.writeInFile("SellQuantity	: "+ amount2+" from "+ fid2);
							}
							
							System.out.println("#####################");
							break;
							
						
							
						case 3:
						
							System.out.println("#####################");
							System.out.println("Show Add-Sell History");
							frwd.readFromFile();
							
							System.out.println("#####################");
							break;
							
						case 4:
						
							System.out.println("#####################");
							System.out.println("Going Back..");
							System.out.println("#####################");
							break;
							
						default:
						
							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
					}
					
					System.out.println("********************");
					break;
								
				case 5:
				
					System.out.println("********************");
					System.out.println("Exit");
					choice = false;
					System.out.println("********************");
					break;
					
				default:
				
					System.out.println("********************");
					System.out.println("Invalid Option");
					System.out.println("********************");
					break;
			}
			
		}
		
		
	}
}
