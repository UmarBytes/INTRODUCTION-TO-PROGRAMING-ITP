import java.util.Scanner;
public class Task9{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);

	        System.out.print("\nEnter the Size for String Array  :         ");
	        int lengthOfTheStringWord = read.nextInt();
	        String[] word = new String[lengthOfTheStringWord];
	        word = ArrayMethodsLab13.populateStringArray(word);
	        System.out.print("Enter the Character you want to Find in the String :      ");
	        char character = read.next().charAt(0);
	        ArrayMethodsLab13.findStringByCharacter(word, character);

	}//main
}//class