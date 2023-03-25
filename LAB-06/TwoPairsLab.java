import java.util.Scanner;
public class TwoPairsLab{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a = read.nextInt();
		System.out.print("Enter the second number:"); 
		int b = read.nextInt();		
		System.out.print("Enter the third number:");  
		int c = read.nextInt();
		System.out.print("Enter the fourth number:");  
		int d = read.nextInt();
		 boolean first = a == c && b ==d , second = c == b && a == d;
		
		System.out.println("\n\nEntered numbers are: \t" + a + "\t" + b + "\t" + c + "\t" + d);		
			if( first || second )
			{
				System.out.println("Numbers are two pairs.");
			}
			else
			{
				System.out.println("Numbers are not two pairs.");
			
			}	
	
	}


}
