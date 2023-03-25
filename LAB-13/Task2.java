import java.util.Scanner;
public class Task2{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

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

	}//main
}//class