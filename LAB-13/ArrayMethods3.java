import java.util.Scanner;
public class ArrayMethods3{
	public static void populateArray(String[] array){

		Scanner input = new Scanner(System.in);

			System.out.print("\n");
		for(int i=0 ; i < array.length ; i++){

			System.out.print("\tEnter a value at index " + i + " : ");
				array[i] = input.nextLine();

		}//loop

	}//method
	public static void findStringsByCharacter(String[] array , char ch){

			System.out.print("\n");
		for(int i = 0 ; i < array.length ; i++){

			for(int position = 0 ; position < array[i].length() ; position++){
				if(ch == array[i].charAt(position)){

					System.out.print("\n" + array[i]);
					break;

				}//if	

			}//inner-loop

		}//outer-loop	

	}//method
	public static void printValidNames(String[] array){

				
			System.out.print("\n");
		for(int i=0 ; i < array.length ; i++){

					int letterCount = 0;
					boolean isvalid = true;

			if(Character.isUpperCase (array[i].charAt(0))){

						letterCount++;

				for(int index = 1 ; index < array[i].length() ; index++){

					if(Character.isLetter (array[i].charAt(index))){

						letterCount++;
						isvalid = true;
						
					}
					else
						isvalid = false;
				}//inner-loop

			}//outer-if
			if((letterCount >=3 && letterCount <= 32) && isvalid)
					System.out.print("___________" +array[i] +"______________\n");
		
		}//outer-loop

	}//method

}//class