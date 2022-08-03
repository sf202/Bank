import java.util.Scanner;
import java.util.LinkedList;
public class BankTest
{
	// static scanner means that money is shared between all instances of that class it belongs
	static Scanner money = new Scanner(System.in);

	public static void main(String[] args)

	{
		// Instance Variables
		char options;

		// constructs the linked list by instatiating the variable data type expected, flag an error

		LinkedList<Bank> files = new LinkedList<Bank>();
		Bank thisCase = null; // nothing there 0
		System.out.print("Hello, please choose an option from the following.:");

		// This will allow you to choose from the following options through a do while loop that returns a
		// options onces the user matches the character. Then the character will match with what you typed in.
		do 
		{
			// will allow menu options
			options = getLinkedListRecords(); 
			if (options == 'a') {//
				 if (files.size() != 0)
					{
						System.out.println( "First Name      " + "    Last Name" +"             Current Balance");
						System.out.println("------------------------------------------------------------------------------");
						for(int i = 0; i < files.size(); i++) // prints all files for size
						{
							System.out.println(files.get(i)); // prints out all the linked list
						}
					}
			else if(files.size() == 0){
					System.out.println("No current files Exist try again.");
					
				}			
				 }
			
			
			
			else if ( options == 'r') {//
				{
					 if (files.size() !=0){
						for(int i = 0; i < files.size(); i++)
						{// ignore case upper lower
							// Removes First and last name of the list.
							if(files.get(i).getprimerNombre().equalsIgnoreCase(thisCase.getprimerNombre()) && files.get(i).getfinalNombre().equalsIgnoreCase(thisCase.getfinalNombre()))
							{                  
								Bank gone = files.remove(i);
								System.out.println("You Have Decided To Delete : " + gone.getprimerNombre() + " " + gone.getfinalNombre());                  
								thisCase = null;   // it is now empty               
								break;
							}
						}
					}
					 else	 if(files.size() == 0){
							System.out.println("No files exist.");
							
					 }					sortfiles(files);

				}		
				
				
				
				
				
				
			}
			else if (options == 'f') {//

				 if(files.size() != 0)
				{
					for(int i = 0; i < files.size(); i++)
					{
						if(files.get(i).getprimerNombre().equalsIgnoreCase(thisCase.getprimerNombre()) && files.get(i).getfinalNombre().equalsIgnoreCase(thisCase.getfinalNombre()))
						{
							String primer;
							System.out.print("Input a new first name: ");
							primer = money.next();
							files.get(i).setprimerNombre(primer);                  
							System.out.println("The current file is:       " + files.get(i).getprimerNombre()+ "     " + files.get(i).getfinalNombre());                  

							break;
						}
					}
				}
				 else	 if(files.size() == 0){
						System.out.println("No files exist.");
						
				 }			
				 }
			
			
			else	if (options == 'l') {//
				String end;
				 if(files.size() != 0){
					for(int i = 0; i < files.size(); i++)
					{
						if(files.get(i).getprimerNombre().equalsIgnoreCase(thisCase.getprimerNombre()) && files.get(i).getfinalNombre().equalsIgnoreCase(thisCase.getfinalNombre()))
						{
							System.out.print("Input a new last name: ");
							end = money.next();
							files.get(i).setfinalNombre(end);                  
							System.out.println("Current record is:    " + files.get(i).getprimerNombre() +"   " + files.get(i).getfinalNombre());                  

							break;
						}
					}
				}      
				else if (files.size() == 0){
						System.out.println("Does not exist.");
					
				}				sortfiles(files);
				
			}
			else	if (options == 'n') {//
				String begin;
				String end;
				double baldur;
				System.out.print("\nInput the person's first name: ");
				begin = money.next();
				System.out.print("Input the person's  last name: ");
				end = money.next();
				System.out.print("Input the  persn's total balance: ");
				baldur = money.nextDouble();
				// creates an account object that stores first name last name and balance.
				Bank stipend = new Bank(begin, end, baldur);
			files.add(stipend);  // stores the account 		
			
			thisCase = files.get(files.size() - 1); // the last index of that index number print out all of them even the last one subtract last index -1
			printFile(thisCase); // output related to last element
			sortfiles(files); // sorting
				
			}
			else	if (options == 'd') {//
				// instance variables
				double give;
				 if (files.size() != 0) {
				{
					for(int i = 0; i < files.size(); i++)
					{
						if(files.get(i).getprimerNombre().equalsIgnoreCase(thisCase.getprimerNombre()) && files.get(i).getfinalNombre().equalsIgnoreCase(thisCase.getfinalNombre()))
						{
							System.out.print("How much do you want to Deposit: ");
							give = money.nextDouble();
							files.get(i).deposit(give);                  
							System.out.println("The current file is: " + files.get(i).getprimerNombre() + "    " + files.get(i).getfinalNombre() + " with  " + String.format("%.2f", give) + " add to your deposit");  
							break; // new balance
						}
					}
				}
			}
				 if(files.size() == 0){
						System.out.println("No files exist.");
					
					 }			
				 }
			
			
			
			else		if (options == 'w') {//
				if  ( files.size() != 0){
					
					for(int i = 0; i < files.size(); i++)
					{
						if(files.get(i).getprimerNombre().equalsIgnoreCase(thisCase.getprimerNombre()) && files.get(i).getfinalNombre().equalsIgnoreCase(thisCase.getfinalNombre()))
						{
							double take;
							System.out.print("How much do you want to withdraw :");
							take = money.nextDouble();
							files.get(i).withdraw(take);                  
							System.out.println("The Current file is: " + files.get(i).getprimerNombre() + "   " + files.get(i).getfinalNombre() + " with   " + String.format("%.2f", take) + " removed from your deposit");  
							break;
						}
					}
				}
				else if(files.size() == 0){
						System.out.println("No files exist.....");
						
					 }		
				}
			
			
			
			else	if (options == 'q') {//
				System.out.println("Goodbye, Have Nice Day");
			}
			
			
			
			else  if (options == 's') {//
				boolean righto;
				String first;
				String last;
				// asks perons name
				System.out.print("Input the persons first name: ");
				first = money.next();
				System.out.print("Input the persons last name: ");
				last = money.next();
				righto = false;

				for(int i = 0; i < files.size(); i++)
				{
					if(files.get(i).getprimerNombre().equalsIgnoreCase(first) && files.get(i).getfinalNombre().equalsIgnoreCase(last))
					{
						righto = true;
						thisCase = files.get(i); // making current record
						System.out.println("The current file is : " + thisCase.getprimerNombre() + "   " + thisCase.getfinalNombre());
						break;
					}
				}

				if(righto=!righto) // not righto
				{
					System.out.println("There is no file of that name..");
					
				}			
				}
			
			
			
			// if choice is not correct
			else {
				System.out.println("Invalid command");
			}
			
		}while(options != 'q');
	}
	
	
	
	
	
	
	public static void sortfiles(LinkedList<Bank> files)
	{
		int leastOp;
		for(int r = 0 ; r< files.size() - 1; r++)
		{
			leastOp = r;

			for (int z = r + 1 ; z < files.size() ; z++ )
			{
				if (files.get(z).getfinalNombre().compareToIgnoreCase(files.get(leastOp).getfinalNombre()) < 0)
					leastOp = z;
			} // sorting list in alphabetical order from all the list

			if(leastOp != r)
			{// skips the same index numbers
				Bank purchase =files.get(r);
				files.set(r, files.get(leastOp));
				files.set(leastOp, purchase);
			}
		}

	}
	
	public static void printFile(Bank thisCase)
	{
		System.out.println("The current file is: " + thisCase.getprimerNombre() + "  " + thisCase.getfinalNombre() + "  " + String.format("$%.2f", thisCase.getTotalBalance()));
	}
	

	public  static char getLinkedListRecords()
	{  
		char options;
		System.out.println();
		System.out.println("Please Enter a command from the following(q to Exit,quit): ");
		System.out.println("a. Show all records");
		System.out.println("r. Remove the current record");
		System.out.println("f. Change the first name in the current record");
		System.out.println("l. Change the last name in the current record");
		System.out.println("n. Add a new record");
		System.out.println("d. Add a deposit to the current record");
		System.out.println("w. Make a withdrawal from the current record");
		System.out.println("q. Exit,Quit");
		System.out.println("s. Select a record from the record list to become the current record");
		options= money.next().charAt(0);      
		return options; // return's one character
	}
}