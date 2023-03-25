import java.util.Scanner;
public class ArrayMethods1{
	public static void populateArray(int[] array){

		Scanner input = new Scanner(System.in);

			System.out.print("\n");
		for (int i=0 ; i < array.length ; i++){

			System.out.print("\tEnter a value at index " + i + " : ");
				array[i] = input.nextInt();

		}//loop
	}//method
		public static int getSLIndex(int[] array, char typeOfValue){

				int index = -1;

		if(typeOfValue != 'L' && typeOfValue != 'l' && typeOfValue != 'S' && typeOfValue != 's')
				return index;

		Scanner input = new Scanner(System.in);

			System.out.print("\n");
		for (int i=0 ; i < array.length ; i++){

			System.out.print("\tEnter a value at index " + i + " : ");
				array[i] = input.nextInt();

		}//loop		

		// 	declare a condition to find Largest	
		if(typeOfValue == 'L' || typeOfValue == 'l'){
				int largest = array[0];

			for(int i = 0 ; i < array.length ; i++){

				if(largest < array[i])
					largest = array [i];
			}//loop

					return largest;	
		}
			//declare a condition to find smallest
		if(typeOfValue == 'S' || typeOfValue == 's'){
				int smallest = array[0];

			for(int i = 0 ; i < array.length ; i++){

				if(smallest > array[i])
					smallest = array [i];
			}//loop

					return smallest;	
		}

					return index;

	}//method
	public static void countEvenOddIntegers(int[] array){

				int countEven = 0;
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] % 2 == 0)
				countEven ++;	

		}

			System.out.println("\n\tEven digits in array are : " + countEven);
			System.out.println("\tOdd digits in array are : " + (array.length-countEven));

	}//method
	public static int[] copyReverseArrays(int[] fArray, int[] sArray){

		for(int i = 0 , j = fArray.length-1 ; i < fArray.length && j >= 0 ; i++ , j--){
                sArray[j] = fArray[i];

        }//for
        
        		return sArray;   		
	}//method

}//class	