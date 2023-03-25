import java.util.Scanner;
public class Array4{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			System.out.print("Enter the size of String type array : ");
				int stringSize = input.nextInt();
				String[] words = new String[stringSize];

			System.out.print("\nEnter the Character to find array : ");
				char character = input.next().charAt(0);
	

		ArrayMethods3.populateArray(words);
		ArrayMethods3.findStringsByCharacter(words, character);	


			System.out.print("\n\t---Question # 2---\n");
			System.out.print("Enter the size of array contain names : ");
				int size = input.nextInt();
				String[] names = new String[size];


		ArrayMethods3.populateArray(names);
		ArrayMethods3.printValidNames(names);

	}//main

	
}//method