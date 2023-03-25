import java.util.Scanner;
public class Array2{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			System.out.print("Enter the size of array : ");
				int size = input.nextInt();
			System.out.print("Enter 'S' or 's' to find smallest & 'L' or 'l' to find largest : ");
				char ch = input.next().charAt(0);
				int[] array = new int[size];

				int index = ArrayMethods1.getSLIndex(array, ch);

		if(index < 0){
			System.out.println("Error! type of value is invalid!");
			System.out.println("index : " + index);		
		}
		else
			System.out.println(ch + " value in array is : " + index);
		
	
			System.out.println("\n\n\t____Question # 2_______________\n");

			System.out.print("Enter the size of array : ");
				int size2 = input.nextInt();
				int[] array2 = new int[size2];

				ArrayMethods1.populateArray(array2);
				ArrayMethods1.countEvenOddIntegers(array2);
		
	
			System.out.println("\n\n\t____Question # 3_______________\n");

			System.out.print("Enter the size of array : ");
				int size3 = input.nextInt();
				int[] fArray = new int[size3];
				int[] sArray = new int[fArray.length];

			System.out.print("\n\t---Array before reverse---\n");
				ArrayMethods1.populateArray(fArray);
				sArray = ArrayMethods1.copyReverseArrays( fArray, sArray);

			System.out.print("\n\t---Array after reverse---\n\n ");
		for(int i = 0 ; i < fArray.length ; i++){

        	System.out.println("\tindex[" + i + "] : " + sArray[i]);

        }//loop
    

	}//main
	
}//class				