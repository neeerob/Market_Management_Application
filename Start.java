import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;

public class Start
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        FileReadWriteDemo frwd = new FileReadWriteDemo();

        System.out.println("-----------------------------------");
		System.out.println("****   Welcome To Octal Shop   ****");
        System.out.println("-----------------------------------\n");
        
        boolean operation = true;

        while(operation)
        {
            System.out.println();
            System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Shop Management");
			System.out.println("\t3. Shop Product Management");
			System.out.println("\t4. Product Quentity add-sell");
			System.out.println("\t5. Exit");
            System.out.println("-----------------------------------\n");
            
            System.out.print("Enter Your Choice: ");
			int choice = scan.nextInt();
            System.out.println("-----------------------------------");
            
            switch(choice)
            {
                case 1:

                System.out.println("-----------------------------------");
		        System.out.println("   You choise Employee management   ");
                System.out.println("-----------------------------------\n");

                System.out.println("What do you want to do?");
			    System.out.println("\t1. Insert new imployee");
			    System.out.println("\t2. Remove Existing Employee");
			    System.out.println("\t3. Show All Employees");
			    System.out.println("\t4. Search an Employee");
			    System.out.println("\t5. Go Back");
                System.out.println("-----------------------------------\n");

                System.out.print("Enter Your Choice: ");
			    int choice1 = scan.nextInt();
                System.out.println("-----------------------------------");

                

                break;

                case 2:

                System.out.println("-----------------------------------");
		        System.out.println("   You choise Shop management   ");
                System.out.println("-----------------------------------\n");

                break;

                case 3:

                System.out.println("-----------------------------------");
		        System.out.println("   You choise Shop Product management ");
                System.out.println("-----------------------------------\n");

                break;

                case 4:

                System.out.println("-----------------------------------");
		        System.out.println("   You choise Product Quantity Add-Sell   ");
                System.out.println("-----------------------------------\n");

                break;

                case 5:

                System.out.println("-----------------------------------");
		        System.out.println("   You choise to Exit   ");
                System.out.println("-----------------------------------\n");

                System.out.println("   Exited!!   ");
                operation = false;

                break;

                default:

                System.out.println(" You input wrong keyword !!   ");

                break;

            }

        }
		
    }
}
