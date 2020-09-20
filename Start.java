import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;

public class Start
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        FileReadWriteDemo frwd = new FileReadWriteDemo();
		Market m = new Market();
		Shop s = new Shop();

        System.out.println("-----------------------------------");
		System.out.println("****   Welcome To Octal Shop   ****");
        System.out.println("-----------------------------------\n");
        
        boolean operation = true;

        while(operation)
        {
            System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Shop Management");
			System.out.println("\t3. Shop Product Management");
			System.out.println("\t4. Product Quentity add-sell");
			System.out.println("\t5. Exit");
            System.out.println("-----------------------------------\n");
            
            System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
            System.out.println("-----------------------------------");
            
            switch(choice)
            {
                case 1:
				{
					
					System.out.println("-----------------------------------");
					System.out.println("   You choise Employee management   ");
					System.out.println("-----------------------------------\n");

					System.out.println("What do you want to do?");
					System.out.println("\t1. Insert new employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Show All Employees");
					System.out.println("\t4. Search an Employee");
					System.out.println("\t5. Go Back");
					System.out.println("-----------------------------------\n");

					System.out.print("Enter Your Choice: ");
					int choice1 = sc.nextInt();
					System.out.println("-----------------------------------");
					
					switch(choice1)
					{
						case 1:
						{
							System.out.println("You Choose to insert an Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employe Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(m.insertEmployee(e1)){ System.out.println("Employee Inserted with ID: "+e1.getEmpId());}
							else{System.out.println("Employee Can Not be Insertd......");}

							
							break;
						}
						
						case 2:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = m.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(m.removeEmployee(e2)){ System.out.println("Employee Removed with ID: "+e2.getEmpId());}
								else{System.out.println("Employee Can Not be Removed......");}
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
							break;
						}
						
						case 3:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Employees");
							System.out.println("---------------------------------");
							
							m.showAllEmployees();
							break;
						}
						
						case 4:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Search: ");
							String empId3 = sc.next();
							
							Employee e3 = m.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
							break;
						}
						
						case 5:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							break;
						}
					}
					
				
                

					break;
				}
                case 2:
				{
					System.out.println("-----------------------------------");
					System.out.println("   You choise Shop management   ");
					System.out.println("-----------------------------------\n");
					
					System.out.println("What do you want to do?");
					System.out.println("\t1. Insert new Shop");
					System.out.println("\t2. Remove Existing Shop");
					System.out.println("\t3. Show All Shop");
					System.out.println("\t4. Search a Shop");
					System.out.println("\t5. Go Back");
					System.out.println("-----------------------------------\n");
					
					System.out.print("Enter Your Choice: ");
					int choice2 = sc.nextInt();
					System.out.println("-----------------------------------");
					
					switch(choice2)
					{
						case 1:
						{
							System.out.println("You Choose to insert a new Shop");
							
							System.out.print("Enter Shop ID: ");
							String shopId1 = sc.next();
							System.out.print("Enter Shop Name: ");
							String shopName1 = sc.next();
							
							Shop s1 = new Shop();
							
							s1.setSid(shopId1);
							s1.setName(shopName1);
							
							if(m.insertShop(s1)){ System.out.println("Shop Inserted with ID: "+s1.getSid());}
							else{System.out.println("Shop Can Not be Insertd......");}
							
							break;
						}
						
						case 2:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove A Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter a Shop ID to Remove: ");
							String shopId2 = sc.next();
							
							Shop s2 = m.searchShop(shopId2);
							
							if(s2 != null)
							{
								if(m.removeShop(s2)){ System.out.println("Shop Removed with ID: "+s2.getSid());}
								else{System.out.println("Shop Can Not be Removed......");}
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}
							
							break;
						}
						
						case 3:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Shops");
							System.out.println("---------------------------------");
							
							m.showAllShops();
							
							break;
						}
						
						case 4:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search An Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Shop ID to Search: ");
							String shopId3 = sc.next();
							
							Shop s3 = m.searchShop(shopId3);
							
							if(s3 != null)
							{
								System.out.println("Shop Found");
								System.out.println("Shop ID: "+s3.getSid());
								System.out.println("Shop Name: "+s3.getName());
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}
							
							break;
						}
						
						case 5:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							break;
						}
					}
					
					

					break;
				}
				case 3:
				{
					System.out.println("-----------------------------------");
					System.out.println("   You choise Shop Product management ");
					System.out.println("-----------------------------------\n");
					
					System.out.println("What do you want to do?");
					System.out.println("\t1. Insert new Product");
					System.out.println("\t2. Remove Existing Product");
					System.out.println("\t3. Show All Product");
					System.out.println("\t4. Search a Product");
					System.out.println("\t5. Go Back");
					System.out.println("-----------------------------------\n");
					
					System.out.print("Enter Your Choice: ");
					int choice3 = sc.nextInt();
					System.out.println("-----------------------------------");
					
					switch(choice3)
					{
						case 1:
						{
							System.out.println("You Choose to insert a new product");
							
							System.out.println("\tWhat type of Product do you want to insert?");
							System.out.println("\t1. Imported Product");
							System.out.println("\t2. Local Product");
							System.out.println("\t3. Go Back");
							
							System.out.print("Enter Shop ID: ");
							String sid1 = sc.next();
							
							if(m.searchShop(sid1) != null)
						{

							System.out.print("Enter Product Type: ");
							int pType = sc.nextInt();
							
							switch(pType)
							{
								case 1:
								{	
									System.out.print("Enter Country Name : ");
									String cName = sc.next();
									System.out.print("Enter Product ID: ");
									String pId1 = sc.next();
									System.out.print("Enter Product Name: ");
									String pName1 = sc.next();
									System.out.print("Enter available Quantity: ");
									int pQuantity1 = sc.nextInt();
									System.out.print("Enter Product price: ");
									double price1 = sc.nextDouble();
							
									ImportedProduct im = new ImportedProduct();
									
									im.setCountryName(cName);
									im.setPid(pId1);
									im.setName(pName1);
									im.setAvailableQuantity(pQuantity1);
									im.setPrice(price1);
							
									if(s.insertProduct(im)){ System.out.println("Product Inserted with ID: "+im.getPid());}
									else{System.out.println("Product Can Not be Insertd......");}
									
									break;
								}
								
								case 2:
								{
									System.out.print("Enter Discount Rate : ");
									double dRate = sc.nextDouble();
									System.out.print("Enter Product ID: ");
									String pId1 = sc.next();
									System.out.print("Enter Product Name: ");
									String pName1 = sc.next();
									System.out.print("Enter available Quantity: ");
									int pQuantity1 = sc.nextInt();
									System.out.print("Enter Product price: ");
									double price1 = sc.nextDouble();
							
									LocalProduct lp = new LocalProduct();
									
									lp.setDiscountRate(dRate);
									lp.setPid(pId1);
									lp.setName(pName1);
									lp.setAvailableQuantity(pQuantity1);
									lp.setPrice(price1);
							
									if(s.insertProduct(lp)){ System.out.println("Product Inserted with ID: "+lp.getPid());}
									else{System.out.println("Product Can Not be Insertd......");}
									
									break;
								}
								
								case 3:
								{
									System.out.println("---------------------------------");
									System.out.println("You Choose to Go Back.......");
									System.out.println("---------------------------------");
									break;
								}
							}
						}
						else
						{
							System.out.println("Shop not found!");
						}
							break;
						}
						
						case 2:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove A Product");
							System.out.println("---------------------------------");
							
							System.out.print("Enter a Product ID to Remove: ");
							String pId2 = sc.next();
							
							Product p3 = s.searchProduct(pId2);
							
							if(p3 != null)
							{
								if(s.removeProduct(p3)){ System.out.println("Product Removed with ID: "+p3.getPid());}
								else{System.out.println("Product Can Not be Removed......");}
							}
							else
							{
								System.out.println("Product Does Not Exist");
							}
							
							break;
						}
						
						case 3:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Products");
							System.out.println("---------------------------------");
							
							s.showAllProducts();
							
							break;
						}
						
						case 4:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search An Product");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Product ID to Search: ");
							String pId3 = sc.next();
							
							Product p4 = s.searchProduct(pId3);
							
							if(p4 != null)
							{
								System.out.println("Product ID: "+p4.getPid());
								System.out.println("Product Name: "+p4.getName());
								System.out.println("available Quantity: "+p4.getAvailableQuantity());
								System.out.println("Product price: "+p4.getPrice());
							}
							else
							{
								System.out.println("Product Does Not Exist");
							}
							
							break;
						}
						
						case 5:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							break;
						}
					}
					

					break;
				}
                case 4:
				{
					System.out.println("-----------------------------------");
					System.out.println("   You choise Product Quantity Add-Sell   ");
					System.out.println("-----------------------------------\n");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add Product");
					System.out.println("\t2. Sell Product");
					System.out.println("\t3. Show Add Sell History");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter You Option: ");
					int choice4 = sc.nextInt();
					
					switch(choice4)
					{
						case 1:
						{
							System.out.println("You choose to Add Product");
							
							System.out.print("Enter Shop ID: ");
							String sId1 = sc.next();
							
							if(m.searchShop(sId1) != null)
							{
								System.out.print("Enter Product Id : ");
								String pId4 = sc.next();
								
								if(m.searchShop(sId1).searchProduct(pId4) !=null)
								{
									System.out.print("Enter Amount to ADD: ");
									int am = sc.nextInt();
									
									if(m.searchShop(sId1).searchProduct(pId4).addQuantity(am))
									{
										System.out.println("Added Successfully");
										frwd.writeInFile("Product with ID "+pId4+" added to the shop with ID "+sId1);
									}
									else
									{
										System.out.println("Can Not Add");
									}
								}
								else
								{
									System.out.println("Invalid Product ID");
								}
							}
							else
							{
								System.out.println("Invalid Shop ID");
							}
							
							break;
						}
						
						case 2:
						{
							
							break;
						}
						
						case 3:
						{
							
							break;
						}
						
						case 4:
						{
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							break;
						}
					}

					break;
				}
                case 5:
				{
					System.out.println("-----------------------------------");
					System.out.println("   You choise to Exit   ");
					System.out.println("-----------------------------------\n");

					System.out.println("   Exited!!   ");
					operation = false;

					break;
				}
                default:
				{
					System.out.println(" You input wrong keyword !!   ");

					break;
				}
            }

        }
		
    }
}