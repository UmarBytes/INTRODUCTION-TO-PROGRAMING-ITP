import java.util.Scanner;
public class Task10{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);

	        System.out.print("\nEnter the Size for String Array  :         ");
	        int lengthOfTheStringName = read.nextInt();
	        String[] names = new String[lengthOfTheStringName];
	        names = ArrayMethodsLab13.populateStringArray(names);
	        System.out.print("Valid Names in the Entered String Arrays are these :       ");
	        ArrayMethodsLab13.printValidNames(names);

	}//main
}//class