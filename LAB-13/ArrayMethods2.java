import java.util.Scanner;
public class ArrayMethods2{
	public static void populateArray(int[] array){

		Scanner input = new Scanner(System.in);

			System.out.print("\n");
		for(int i=0 ; i < array.length ; i++){

			System.out.print("\tEnter a value at index " + i + " : ");
				array[i] = input.nextInt();

		}//loop

	}//method
	public static void ElementsAtEvenIndex(int[] array){

			System.out.print("\n\tPrint all elements that are at even index :\n\n\t");

		for(int i = 0 ; i < array.length ; i++){
			if(i % 2 == 0)
				System.out.print(array[i] + " ");
		}//loop	


		}//method
	public static void EvenElements(int[] array){

			System.out.print("\n\n\tPrint all elements that are even in array :\n\n\t");

		for(int i = 0 ; i < array.length ; i++){
			if(array[i] % 2 == 0)
				System.out.print(array[i] + " ");


		}//loop


	}//method	
	public static void ReversePrint(int[] array , int[] reverseArray){

			System.out.print("\n\n\tPrint the array in reverse order :\n\n");

		for(int i = 0 , j = array.length-1 ; i < array.length && j >= 0 ; i++ , j--){
			
				reverseArray[j] = array[i];

		}//loop
		for(int i = 0 ; i < array.length ; i++){

        	System.out.println("\tindex[" + i + "] : " + reverseArray[i]);

        }//loop

	
	}//method

}//class	