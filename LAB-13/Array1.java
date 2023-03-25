import java.util.Scanner;
public class Array1{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			System.out.print("Enter the size of array : ");
				int size = input.nextInt();
			System.out.print("Enter a number to check in array for greater then : ");
				int number = input.nextInt();
				int[] array = new int[size];

				ArrayMethods.largerThanNumber(array, number);
		
	
			System.out.println("\n\n\t____Question # 2_______________\n");

			System.out.print("Enter the size of array : ");
				int size2 = input.nextInt();
			System.out.print("Enter a value to check in array for repeat 2 time : ");
				int value = input.nextInt();
				int[] array2 = new int[size2];

				int index = ArrayMethods.getSecondIndex(array2, value);
		if(index > 0)		
			System.out.print("\n" + value + " value repeat at index : " + index);
		else
			System.out.print("\n" + value + " value dose not repeat! " + index);


			System.out.println("\n\n\t____Question # 3_______________\n");


			System.out.print("Enter the size of array : ");
				int size3 = input.nextInt();
			System.out.print("Enter a value to check in array : ");
				int valueOccurrence = input.nextInt();
			System.out.print("Enter a occurrence to check in array : ");
				int occurrence = input.nextInt();
				int[] array3 = new int[size3];

				int indexOccurrence = ArrayMethods2.getNthIndex(array3, occurrence, valueOccurrence);
		if(indexOccurrence >= 0)		
			System.out.print(valueOccurrence + " value repeat " + occurrence + " times at index : " + indexOccurrence);
		else
			System.out.print(valueOccurrence + " value dose not repeat! " + indexOccurrence);
		
	}//main

}//class