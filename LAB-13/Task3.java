import java.util.Scanner;
public class Task3{
	public static void main(String[] args){

	Scanner read = new Scanner(System.in);
        	System.out.print("Enter a Number  :         ");
        	int numToFindTheNthOccurence = read.nextInt();
        	System.out.print("Enter the Occurrence  :         ");
        	int occurence = read.nextInt();
        	System.out.print("Enter the Size for Array  :         ");
        	int lengthOfTheArrayToFindTheNthIndex = read.nextInt();
        	int[] arrForNthIndex = new int[lengthOfTheArrayToFindTheNthIndex];
        	arrForNthIndex = ArrayMethodsLab13.populateArray(arrForNthIndex);
        	System.out.println("\nOccurence " + occurence + " of the Value " + numToFindTheNthOccurence + 
	" in the entered Array is at Index Number " + ArrayMethodsLab13.getNthIndex(arrForNthIndex, occurence, numToFindTheNthOccurence));		

	}//main

}//class