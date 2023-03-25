import java.util.Scanner;
public class WhileLoops2Lab8{
	public static void main(String[] args){
	
		Scanner read = new Scanner(System.in);
		System.out.print("\nEnter number to add the even numbers.   ");
		int a = read.nextInt();
		System.out.print("Enter the second number to add the even numbers between them.   ");
		int b = read.nextInt();
		int sum = 0, sum1 = 0 ;
		
		 System.out.print("Sum of all the even numbers between " + a +" and " +  b + " is" ); // a-part
	
			while( a <= b ){
					if(a % 2 == 0){
						sum += a ;
					}
				a++;
			}
			System.out.print(" "+sum+".");
		System.out.println("\n---------------------------------");
		
		System.out.print("\nEnter number to add the odd numbers.   ");  // b-part
		int c = read.nextInt();
		System.out.print("Enter second number to add the odd numbers between them.   ");
		int d = read.nextInt();
			System.out.print("Sum of all the odd numbers between " + c +" and " +  d + " is" );
			while( c<=d ){
					if( c % 2 == 1 ){
						sum1 += c;
					}
				c++;			
			}
			System.out.print(" "+sum1+".");
		System.out.println("\n---------------------------------\n");
	}


}
