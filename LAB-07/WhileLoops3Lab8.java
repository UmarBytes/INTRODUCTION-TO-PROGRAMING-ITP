import java.util.Scanner;
public class WhileLoops3Lab8{
	public static void main(String[] args){

		Scanner read = new Scanner(System.in);
		int num , i =1, sum = 0;
	
		while( i <= 10 ){
			System.out.print("Enter a number:");
			num = read.nextInt();
			sum += num  ;
			i++;
		}

		System.out.println("Sum of the entered numbers is: " +sum);


	}


}