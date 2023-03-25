import java.util.Scanner;
public class Arraysort{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			System.out.print("Enter the size of integer array : ");
				int intSize = input.nextInt();
				int[] intArray = new int[intSize];
				
		MethodSort.populateIArray(intArray);
		MethodSort.sortIArray(intArray);


			System.out.print("\nEnter the size of double array : ");
				int doubleSize = input.nextInt();
				double[] doubleArray = new double[doubleSize];

		MethodSort.populateDArray(doubleArray);
		MethodSort.sortDArray(doubleArray);


			System.out.print("\nEnter the size of String array : ");
				int stringSize = input.nextInt();
				String[] stringArray = new String[stringSize];

		MethodSort.populateSArray(stringArray);
		MethodSort.sortSArray(stringArray);
				

	}//main

	
}//method