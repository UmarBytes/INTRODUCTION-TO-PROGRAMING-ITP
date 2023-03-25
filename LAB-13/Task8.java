import java.util.Scanner;
public class Task8{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);

	   System.out.print("Enter the Size for Integer Array  :         ");
	        int lengthOfTheIntegerArrayToSort = read.nextInt();
	        int[] intArrToSort = new int[lengthOfTheIntegerArrayToSort];
	        intArrToSort = ArrayMethodsLab13.populateArray(intArrToSort);
	        ArrayMethodsLab13.sortIArray(intArrToSort);

	        System.out.print("\nEnter the Size for String Array  :         ");
	        int lengthOfTheStringArrayToSort = read.nextInt();
	        String[] strArrToSort = new String[lengthOfTheStringArrayToSort];
	        strArrToSort = ArrayMethodsLab13.populateStringArray(strArrToSort);

	        ArrayMethodsLab13.sortSArray(strArrToSort);
	        System.out.print("\nEnter the Size for Double Array  :         ");
	        int lengthOfTheDoubleArrayToSort = read.nextInt();
	        double[] doubleArrToSort = new double[lengthOfTheDoubleArrayToSort];
	        ArrayMethodsLab13.populateDoubleArray(doubleArrToSort);
	        ArrayMethodsLab13.sortDArray(doubleArrToSort);
	
	}//main
}//class
