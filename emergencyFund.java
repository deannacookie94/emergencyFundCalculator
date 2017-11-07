import java.util.Scanner;

public class emergencyFund
{
	public static void main (String[] args)
	{

// welcome message
		System.out.println("Have you ever wondered if you need an emergency fund? Wonder no longer! The answer is yes you do need an emergency fund. Your next questions is probably, How much money should I have in my emergency fund? That's where the GYFLT Emergency Fund Calculator can help! After answering a few simply questing the GYFLT Emergency Fund Calculator will tell you the amount of money you should have in your emergency fund. The calculation is based on the emergency fund goals that are outlined by Erin Lowry, a financial guru and the author of the Broke Millenial. Let's begin!");

// scanner to capture user input	
		Scanner input = new Scanner(System.in);	

// prompt user to enter debt in dollars		
		System.out.println("Enter your total amount of debt. Ex: 1000, 5000, 1000, etc");
		
		int debt = input.nextInt();

//input validation
		while(debt < 0)
		{
			System.out.println("You didn't enter a valid number. Enter your total amount of debt. Ex: 1000, 5000, 1000, etc");
		
			debt = input.nextInt();
		}


// prompt user to enter dollars in emergency fund	
		System.out.println("Enter the current balance of your emergency fund. Ex. 1000, 5000, 10000, etc. If you do not have an emergency fund enter 0");
	
		int emergencyFund = input.nextInt();

// input validation
		while(emergencyFund < 0)
		{
			System.out.println("You didn't enter a valid number. Enter the current balance of your emergency fund. Ex. 1000, 5000, 10000, etc. If you do not have an emergency fund enter 0");
		
			emergencyFund = input.nextInt();
		}
// prompt user to enter total monthly expenses			
		System.out.println("Enter your total monthly expenses. Ex. 1000, 5000, 10000");
		
		int totalMonthlyExpenses = input.nextInt();

// input validation	
		while(totalMonthlyExpenses < 0)
		{
			System.out.println("You didn't enter a valid number.Enter your total monthly expenses. Ex. 1000, 5000, 10000");
		
			totalMonthlyExpenses = input.nextInt();
		}

// prompt user to enter insurance deductible		
		System.out.println("Enter your insurance deductible. Ex. 1000, 5000, 10000");
		
		int insuranceDeductible = input.nextInt();

// input validation	
		while(insuranceDeductible < 0)
		{
			System.out.println("You didn't enter a valid number.Enter your insurance deductible. Ex. 1000, 5000, 10000. ");
		
			insuranceDeductible = input.nextInt();
		}

// calcualte users expenses for three months		
		int threeMonthsOfExpenses = totalMonthlyExpenses * 3;

// reccomended emergency fund if user has no debt and current emergency fund is less than three months living expenses		
		
		if (debt == 0 && emergencyFund < threeMonthsOfExpenses)
		{
			System.out.println("Your reccomended emergency fund is $"  + threeMonthsOfExpenses + "Goodbye!");
		}

// reccomended emergency fund if user has no debt and current emergency fund is greater than three months living expenses	
		else if (debt == 0 && emergencyFund >= threeMonthsOfExpenses)
		{
			int reccomendedEmergencyFund = threeMonthsOfExpenses + insuranceDeductible + 1000;

			System.out.println("Your reccomended emergency fund is $" +reccomendedEmergencyFund + "Goodbye!");
		}

// reccomended emergency fund if user has debt
		else
		{

			System.out.println("Your reccomended emergency fund is $" + threeMonthsOfExpenses + "Goodbye!");
		}
	
	}

}
		