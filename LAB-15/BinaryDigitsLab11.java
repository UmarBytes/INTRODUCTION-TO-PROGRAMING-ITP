import java.util.Scanner;
public class BinaryDigitsLab11{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int number = input.nextInt();
		String binarry = "";
		while(number >0){
			int remainder = number % 2;
			binarry = remainder + binarry;
			number /= 2;
		}//while
		if(binarry.equals("")){
			binarry = "0";
		}//if
		System.out.println(binarry);	

	}//main
}//class