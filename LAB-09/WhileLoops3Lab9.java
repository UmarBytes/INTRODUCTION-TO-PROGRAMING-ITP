import java.util.Scanner;
public class WhileLoops3Lab9{
	    public static void main(String[] Umar) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int firstNum = input.nextInt();
	        System.out.print("Enter second number: ");
	        int secondNum = input.nextInt();
	        if (firstNum < secondNum){
	            System.out.println("\nAll odd numbers between " +
	                    firstNum + " and " + secondNum);
	            int i = firstNum;

	            if (i % 2 == 0){
	                ++i;
	            }//if
	            while (i <= secondNum){
	                System.out.println(i);
	                i += 2;
	            }//while
	            int sumEven = 0;
	            int sumOddSquare = 0;
	            i = firstNum;
	            System.out.println("\nAll numbers and their squares between " + firstNum + " and " + secondNum);
	                    System.out.println("Number\t\tSquare");
	            while (i <= secondNum){
	                int square = (int)Math.pow(i,2);
	                System.out.println(i + "\t\t" + square);
	                if (i % 2 == 0){
	                    sumEven += i;
	                }
	                else{
	                    sumOddSquare += square;
	                }//if
	                ++i;
	            }//while
	            System.out.println("\nSum of all even numbers between " + firstNum + " and " + secondNum + ": " + sumEven);
	            System.out.println("Sum of the square of all odd numbers between " + firstNum + " and " + secondNum + ": " +
	            sumOddSquare);

	        }
	        else{
	            System.out.println("The first number should be less than second number.");
	        }//if

	    }//main
}//class