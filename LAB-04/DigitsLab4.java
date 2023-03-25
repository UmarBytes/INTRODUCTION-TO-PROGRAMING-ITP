import java.util.Scanner;
public class DigitsLab4{
	public static void main(String[] args){
//Taking Input
		Scanner digit = new Scanner(System.in);
		System.out.println("Enter any 5 Digit Number : ");
		int num = digit.nextInt();
		System.out.println("Entered Digit is: "+ num);

//Performing Calculations

		int div1 = num/10, lastDigit1 = num%10;
		int div2 = div1/10, lastDigit2=div1%10;
		int div3 = div2/10, lastDigit3 = div2%10;
		int div4 = div3/10, lastDigit4 = div3%10;
		int div5 = div4/10, lastDigit5 = div4%10;

		System.out.println("First Digit is: " +lastDigit5);
		System.out.println("Second Digit is: " +lastDigit4);
		System.out.println("Third Digit is: " +lastDigit3);
		System.out.println("Second last Digit is: " +lastDigit2);
		System.out.println("Last Digit is: " +lastDigit1);		




	}

}