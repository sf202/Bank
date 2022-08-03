/**
 * Santiago Fleiderman CSC 3410 Java Linked List
 * 
 * 1. The purpose of this program is to create a linked list that maintains a
 * list of records of names and balance of customers. The user will then be
 * asked a series of choices from a linked list the user can Remove current
 * Record, Change the first name, change last name add a new record, deposit a
 * current record, withdrawal from current record, Exit Quit, or make a new
 * record the current record.
 * 
 * 2. The first problem that I encountered was how to set the first and last
 * name in the program. I did this by creating a Bank class. Then I created a
 * string variable finalNombre and primerNombre. I then constructed a
 * constructor. Which then I set totalbalance to 0. I then assigned the instance
 * variables to the variables set in the constructor. I then made another
 * constructor which I set my variables assigned to those constructor variables.
 * I then had to decide how I was going to make bank account. I decided to make
 * setters and getters. For the last name, the first name, and the balance. In
 * order to do the withdraw method I had to use an if statement that would not
 * allow one to withdraw negative values. Otherwise it would decrease the
 * current balance. I then made a deposit method which also did not allow one to
 * deposit negative values. If the balance was greater than 0 than the amount of
 * money would increase. Finally I used the String to String method which
 * returns a string consisting of the name of the class of which the object is
 * an instance at sign character. Moreover I restricted the amount of characters
 * given to 20 characters and made the totalBalance a decimal number for the
 * original balance. I then made another class called BankTest. This class will
 * test the constructors and setters and getters of the Bank class. I then made
 * a doubly linked list which would create a empty list but instantiated the
 * Bank class. If it is empty then the bank class is null. Afterword’s, I
 * decided to use an if else statement to allow the user to enter in the right
 * keywords given. This will allow you to choose from the following options
 * (characters) through a do while loop that returns options once the user
 * matches the character. Then the character will match with what you typed in.
 * The key you type in will match with what the character you typed in. If the
 * character matches the given options then the character will lead you to the
 * following methods a,r,f,l,n,d,w,q,s. If you type in ‘a’ it will say that
 * there are no records. But if there is a record it will show all records. The
 * program runs by checking if the value is not 0. Then it will run and print
 * out all of the linked list by using the size of the linked list. ‘r’ will
 * remove the current record in the linked list. If there is one. It will remove
 * the current record on file ignoring upper lowercase then it will say it is
 * empty if it is. It will then sort files. If one inputs ‘f’ this will take the
 * current record and change the first name and display the new one. For the
 * size on the loop. This works the same for the ‘l’ command. If one inputs n it
 * will allow one to enter in the persons first name,last name and total
 * balance. It will then create an object and instantiate that object and store
 * it in thisCase which it will sort alphabetically. If one types in ‘d’ this
 * will take the current case and deposit cash into the bank account by using
 * the getters and setters from the bank class. It will then display your
 * balance. The withdraw ‘w’ works the same way except it subtracts the balance.
 * ‘q’ will terminate the program. ‘S’ will ask the user to enter a new current
 * from the list of records if there are no records then it will say non exist.
 * One must match the string correctly or else you will not get a return value.
 * Any character that is not from the list above will result in an invalid
 * command! This program will run until the do while condition has been met with
 * q. The sort files method will sort the files alphabetically by storing the
 * files from first to last. The print file command prints out the first name
 * last name and balance. The getLinked Record is responsible for all the
 * commands.
 * 
 * 3. The data structure used in this program is the linked list.
 * 
 * 4. The program begins by greeting the user and asking him or her to choose an
 * option from the following list. If the user selects something like display or
 * records for displaying all record the program will give the user an message
 * that will say the linked list is empty. What the user should do first is add
 * a new record which will ask the user for the first name the last name and the
 * balance in the account. The user then can change the first name last name and
 * withdraw and deposit to the current user that was last imputed same thing for
 * the first and last names. You can also remove from a list. Pressing ‘s’ will
 * Select a record from the list to become the current record. Q will exit the
 * program by telling the user goodbye. Each time the user select a character
 * from the chosen except ‘a’, and ‘q’ it will ask the user for input like
 * changing the current balance or changing the first and last name. Or add
 * first last name and balance.
 * 
 * 5. The bank class contains the getters and setters and constructors which
 * allow the testBank to access it so that it can change the first name and last
 * name and the balance.It also contains the String to String method which
 * prints out the original balance. The testBank class is the main class which
 * prints out all the output. It prints out the first name, last name, it adds a
 * new record, deposits,withdraws, and selects a record from the list to become
 * current and it also removes a record.
 */

public class Bank
{
	// Instance Variables
	String finalNombre;
	String primerNombre;
	double totalbalance; // handles as 15 characters

	// Constructor
	public Bank()

	{
		totalbalance = 0.0;
		primerNombre = "";
		finalNombre = "";
	}
	// Instantating the constructor
	public Bank(String primero, String last)

	{
		primerNombre = primero;
		finalNombre = last;
		totalbalance = 0;
	}
	// Instanitating the constructor
	public Bank(String a, String z, double total)

	{
		primerNombre = a;
		finalNombre = z;
		totalbalance = total;
	}  
	// Setters, Mutator 
	public void totalbalancesetting(double baldur)

	{
		totalbalance = baldur;
	}
	public void setprimerNombre(String a)

	{
		primerNombre = a;
	}

	public void setfinalNombre(String z)

	{
		finalNombre = z;
	}
	// Getters, Accessors
	public double getTotalBalance()

	{
		return totalbalance;
	}
	public String getfinalNombre()

	{
		return finalNombre;
	}
	public String getprimerNombre()

	{
		return primerNombre;
	}


	// This is withdraw method
	public void withdraw(double given)

	{
		if(given < 0)
			System.out.println("You cannot deposit a negative value Please try again!");
		else if(totalbalance - given < 0)
			System.out.println("The Balance is not sufficent.");
		else
			totalbalance  -= given;
	}

	// This is the deposit method when you are given the total 
	public void deposit(double given)

	{
		if(given < 0)
			System.out.println("You cannot deposit a negative value Please try again.");
		else
			totalbalance += given;      
	}
	// this will print out what is the string
	// formatting
	// returns a string consisting of the name of the class of which the object is an instance th at sign character 
	public String toString() 

	{
		return String.format("%-20s%-20s%20s", primerNombre, finalNombre, String.format("$%.2f", totalbalance));
		
	}

}

