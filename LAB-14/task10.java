import java.util.Scanner;
public class task10{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number of Names You Want to enter");
		int number = input.nextInt();
		String[] str = new String[number];
		
		library.checkNames(str);
	}
	
}