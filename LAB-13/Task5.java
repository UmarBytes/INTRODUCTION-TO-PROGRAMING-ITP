import java.util.Scanner;
public class Task5{
	    public static void main(String[] args) {
        	Scanner read = new Scanner(System.in);	

	System.out.print("Enter the Size for Array  :         ");
                 int lengthOfTheArrayToCountEvenOdd = read.nextInt();
                 int[] arrForCountEvenOdd = new int[lengthOfTheArrayToCountEvenOdd];
                 arrForCountEvenOdd = ArrayMethodsLab13.populateArray(arrForCountEvenOdd);
               ArrayMethodsLab13.countEvenOddIntegers(arrForCountEvenOdd);

	}//main
 }//class       