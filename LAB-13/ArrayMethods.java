import java.util.Scanner;
public class ArrayMethods{
	public static void largerThanNumber(int[] array, int number){

		Scanner input = new Scanner(System.in);

			System.out.print("\n");
		for (int i=0 ; i < array.length ; i++){

			System.out.print("\tEnter a value at index " + i + " : ");
				array[i] = input.nextInt();

		}//loop

			System.out.print("\n\tNumber that are greater than " + number + " in array are :\n\t ");
		for (int i=0 ; i < array.length ; i++){

			if(array[i] > number)
				System.out.print(array[i] + " ");

		}//loop

	}//method
		public static int getSecondIndex(int[] array, int value){

		Scanner input = new Scanner(System.in);

			System.out.print("\n");
		for (int i=0 ; i < array.length ; i++){

			System.out.print("\tEnter a value at index " + i + " : ");
				array[i] = input.nextInt();

		}//loop

			int count = 0;
		for (int i = 0 ; i < array.length ; i++){

			if(array[i] == value)
				count++;
			if(count > 1){
				return i;
			}

		}//loop
			
				return -1;

	}//method
		public static int getNthIndex(int[] array, int occurrence, int value){

		if(occurrence < 1){

			System.out.print("occurrence is invalid!");
				int index = -1;
				return index;
		}

		Scanner input = new Scanner(System.in);

			System.out.print("\n");
		for (int index = 0 ; index < array.length ; index++){

			System.out.print("\tEnter a value at index " + index + " : ");
				array[index] = input.nextInt();

		}//loop

			int count = 0;
		for (int index = 0 ; index < array.length ; index++){

			if(array[index] == value)
				count++;
			if(count == occurrence){
				
				return index;
			}

		}//loop
			
				return -1;

	}//method


}//class