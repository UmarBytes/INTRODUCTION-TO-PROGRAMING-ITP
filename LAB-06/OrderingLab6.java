import java.util.Scanner;
public class OrderingLab6{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a = read.nextInt();
		System.out.print("Enter the second number:"); 
		int b = read.nextInt();		
		System.out.print("Enter the third number:");  
		int c = read.nextInt();
		 boolean first = a < b && b < c , second = a > b && b > c;
		
		System.out.println("\n\nEntered numbers are: \t" + a + "\t" + b + "\t" + c);		
		//	if( ( a < b && b < c ) || ( a > b && b > c  ) )
			if( first || second )
			{
				System.out.println("Numbers are in order.");
			}
			else
			{
				System.out.println("Numbers are not in order.");
			
			}	
	
	}


}
