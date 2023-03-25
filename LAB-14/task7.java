import java.util.Scanner;
public class task7{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("how many value u want enter");
		int a = in.nextInt();
		int[] b = new int[a];
		
		for (int i = 0;i < b.length ;i++ ) {
			System.out.println("enter ur " + i + " value");
			b[i] = in.nextInt();
			
		}
library.evenIndex(b);
library.evenPrnt(b);
library.reverse1(b);
	}
	
}