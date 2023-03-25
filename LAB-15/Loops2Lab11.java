import java.util.Scanner;
public class Loops2Lab11{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		int length = word.length();
		for (int i = 0; i < length; ++i){
		System.out.println(word.charAt(i));
		}//for
		
		//Prints the word in reverse order
		for (int i = length-1; i >= 0; --i){
		System.out.print(word.charAt(i));
		}//for
		System.out.println();

		int vowels = 0;
		String str = word.toLowerCase();
		for (int i = 0; i < length; ++i){
		char c = str.charAt(i);
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
			vowels++;
		}//if
		}//for
		System.out.println(vowels + " vowels");

		//Print captial letter in the word
		for (int i = 0; i < length; ++i){
		char c = word.charAt(i);
		if(Character.isUpperCase(c))
		{
		System.out.print(c);
		}//if
		}//for

		//Print lowercase letter in the word
		for (int i = 0; i < length; ++i){
		char c = word.charAt(i);
		if(Character.isLowerCase(c))
		{
		System.out.print(c);
		}//if
		}//for
	}//main
}//class