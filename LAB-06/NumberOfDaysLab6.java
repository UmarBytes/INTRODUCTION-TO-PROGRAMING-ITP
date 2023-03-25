import java.util.Scanner;
public class NumberOfDaysLab6
{
	public static void main(String[] args)
	{
	
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the Month number to check number of days: ");
		int input = read.nextInt();
		int days = 0;
		
			if(input == 1 || input == 3 || input == 5 || input == 7 || input == 8 || input == 10 || input == 12)
			{
					days = 31;
			}
			else if( input == 4 || input == 6 || input == 9 || input == 11 )
			{
					days = 30;
			}
			else if( input == 2 )
			{
					days=  28 ;
			}
			else
			{
				 System.out.println("ERROR: Please enter the number between 1 - 12." );
			}
		
		if(days>0) 
		{
			System.out.println("Number of Days in the Month " + input + " are " + days +"." );		
		}
	}	


}
