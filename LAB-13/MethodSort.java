import java.util.Scanner;
import java.util.Arrays;
public class MethodSort{
	public static void populateIArray(int[] array){

		Scanner input = new Scanner(System.in);

			System.out.print("\n");
		for(int i=0 ; i < array.length ; i++){

			System.out.print("\tEnter a value at index " + i + " : ");
				array[i] = input.nextInt();

		}//loop

	}//method
	public static void populateDArray(double[] array){

		Scanner input = new Scanner(System.in);

			System.out.print("\n");
		for(int i=0 ; i < array.length ; i++){

			System.out.print("\tEnter a value at index " + i + " : ");
				array[i] = input.nextDouble();

		}//loop

	}//method
	public static void populateSArray(String[] array){

		Scanner input = new Scanner(System.in);

			System.out.print("\n");
		for(int i=0 ; i < array.length ; i++){

			System.out.print("\tEnter a value at index " + i + " : ");
				array[i] = input.nextLine();

		}//loop

	}//method
	public static void sortIArray(int[] array){

				Arrays.sort(array);
			System.out.print("\n");
		for(int i = 0 ; i < array.length ; i++){

        	System.out.println("\tindex[" + i + "] : " + array[i]);

        }//loop

	}//method
	public static void sortDArray(double[] array){

				Arrays.sort(array);
			System.out.print("\n");	
		for(int i = 0 ; i < array.length ; i++){

        	System.out.println("\tindex[" + i + "] : " + array[i]);

        }//loop

	}//method
	public static void sortSArray(String[] array){

				Arrays.sort(array);
			System.out.print("\n");	
		for(int i = 0 ; i < array.length ; i++){

        	System.out.println("\tindex[" + i + "] : " + array[i]);

        }//loop

	}//Method

}//class