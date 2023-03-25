import java.util.Scanner;
public class Task1{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the size of array : ");
		int size = input.nextInt();
	System.out.print("Enter a number to check in array for greater then : ");
		int number = input.nextInt();
		int[] array = new int[size];

		ArrayMethods.largerThanNumber(array, number);
	}//main
}//class