import java.util.Scanner;
public class Array3{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			System.out.print("Enter the size of array : ");
				int size = input.nextInt();
				int[] array = new int[size];
				int[] reverseArray = new int[array.length];

		ArrayMethods2.populateArray(array);
		ArrayMethods2.ElementsAtEvenIndex(array);		
		ArrayMethods2.EvenElements(array);		
		ArrayMethods2.ReversePrint(array , reverseArray);		

	}//main

	
}//method		