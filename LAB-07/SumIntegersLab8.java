import  java.util.Scanner;
public class SumIntegersLab8{
	public static void main(String[] args){
		
		Scanner read = new Scanner(System.in);
		System.out.print("Enter positive non-zero integer    ");
		int num = read.nextInt() , i = 1, sum =0 ;

		while( i <= num ){
			sum += i;
			i++;
		}
		
		System.out.println("Sum of the numbers from 1 to " + num +" is " + sum);
		


	}

}