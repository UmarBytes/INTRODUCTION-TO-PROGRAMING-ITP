import java.util.Scanner;
public class Task7{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);

        System.out.print("Enter the Size for Array  :         ");
        int lengthOfTheArrayToManiuplate = read.nextInt();
        int[] arrToBeManiuplate = new int[lengthOfTheArrayToManiuplate];
        arrToBeManiuplate = ArrayMethodsLab13.populateArray(arrToBeManiuplate);
        System.out.print("\nElements at the Even Index of the Entered Arrays are these :  ");
        ArrayMethodsLab13.printElementsAtEvenIndex(arrToBeManiuplate);
        System.out.print("\nElements that are Even in the Entered Arrays are these :  ");
        ArrayMethodsLab13.printEvenElements(arrToBeManiuplate);
        System.out.print("\nPrinting Elements of the Entered Arrays in Reverse Order :  ");
        ArrayMethodsLab13.reversePrint(arrToBeManiuplate);

	}//main
}//class