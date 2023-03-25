import java.util.Scanner;

public class WhileLoopSeriesLab8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num = 0, num1 = 100, num2 = 0, num3 = 0;
		System.out.println("\t\t##  This section will print numbers from 1 upto 100 in ascending order.  ##\n");
		while (num <= 100) {

			System.out.println("Number is : " + num);
			num++;
		}

		System.out.println("\n\t\t##  This section will print numbers from 100 to 1 in descending order.  ##\n");

		while (num1 >= 1) {

			System.out.println("Number is : " + num1);
			num1--;

		}

		System.out.println(
				"\n\t\t##  This section prints number from 0 to 50 with an increment of 5 i.e. 0 - 5 - 10 .... 50.  ##\n");

		while (num2 >= 0 && num2 <= 50) {
			System.out.println("Numbers are: " + num2);
			num2 += 5;
		}

		System.out.println("\n\t\t##  This section prints my name 5 times.  ##\n");
		while (num3 <= 5) {
			System.out.println("My Name is Muhammad Umar Farooq. ");
			num3++;

		}

	}

}