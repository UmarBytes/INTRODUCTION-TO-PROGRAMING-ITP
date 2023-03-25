import java.util.Scanner;
public class SumOfDigitsLab8{
	public static void main(String[] args){

		Scanner read = new Scanner(System.in);
		System.out.print("Enter a number    ");
		int num = read.nextInt() , i = 0 , result = 0 , sum =0 ;
		
		while( i <= num ){	
			result = num % 10;
			sum += result ;
			num /=10;
			i++;

		}
		System.out.println("Sum of the numbers is: " + sum);

	}


}