import java.util.Scanner;
public class Task6{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);	

	System.out.print("Enter the Size for Array  :         ");
        	int lengthOfTheArrayToReverse = read.nextInt();
       	 int[] arrToBeReversed = new int[lengthOfTheArrayToReverse];
       	 arrToBeReversed = ArrayMethodsLab13.populateArray(arrToBeReversed);
       	 System.out.println("Printing the Reverse of the Entered Array...");
       	 ArrayMethodsLab13.copyReverseArray(arrToBeReversed, lengthOfTheArrayToReverse);

	}//main
}//class        