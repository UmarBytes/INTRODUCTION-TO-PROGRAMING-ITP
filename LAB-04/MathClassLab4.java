import java.util.Scanner;
public class MathClassLab4{

	public static void main(String[] args){
	

		Scanner number11 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int input = number11.nextInt();
		System.out.println("Entered Number: " + input);

// 1st Digit
		int numOfZeroes = (int)Math.log10(input);
		int number12 = (int)Math.pow(10,numOfZeroes);
		int firstDigit = (int)input / number12;
		System.out.println("First digit is: " + firstDigit);

//2nd Digit
		
		int lastDigit  = input % 10;
		System.out.println("Last digit is: " + lastDigit);

		
	}

}