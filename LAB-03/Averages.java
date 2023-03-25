public class Averages{

	public static void main(String[] args){

//Integer Sum & Averages

		int number1=12387, number2=2211,  number3=32121, number4=42121,  number5=52121 ;

		int sumIntegers = number1+number2+number3+number4+number5;
		int averageIntegers=sumIntegers/5;

		System.out.println("Number 1 is " + number1);
		System.out.println("Number 2 is " + number2);
		System.out.println("Number 3 is " + number3);
		System.out.println("Number 4 is " + number4);
		System.out.println("Number 5 is " + number5 + "\n");
		
		System.out.println("Sum of the given integer numbers is " + sumIntegers);		
		System.out.println("Average of the given integer numbers is " + averageIntegers + "\n");

//Double Sum & Averages

		double number6=12387.252, number7=2211.5225, number8=3212.2241, number9=42121.5875, number10=52121.5988 ;
		
		double sumDouble = number6+number7+number8+number9+number10;
		double averageDouble=sumDouble/5;

		System.out.println("Number 6 is " + number6);
		System.out.println("Number 7 is " + number7);
		System.out.println("Number 8 is " + number8);
		System.out.println("Number 9 is " + number9);
		System.out.println("Number 10 is " + number10 + "\n");
		
		System.out.println("Sum of the given double numbers is " + sumDouble);		
		System.out.println("Average of the given double numbers is " + averageDouble);

	}
}