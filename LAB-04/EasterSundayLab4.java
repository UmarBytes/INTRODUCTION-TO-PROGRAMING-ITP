import java.util.Scanner;
public class EasterSundayLab4{
	public static void main(String[] args){
//Taking Input
		Scanner yearInput = new Scanner(System.in);
		System.out.println("Enter the Year you want to discover the date of the Easter: ");
		int y = yearInput.nextInt();
		System.out.println("Entered Year is " + y);
	
//Algorithm
		int a = y%19;			//2
		int b = y/100, c = y%100;	//3	
		int d = b/4 , e =b%4;		//4
		int g = (8*b+13) / 25;		//5
		int h = (19*a+b-d-g+15)%30;	//6
		int j = c /4, k = c%4;		//7
		int m = (a+11*h)/319;		//8
		int r = (2*e+2*j-k-h+m+32)%7;	//9
		int n = (h-m+r+90)/25;		//10	
		int p = (h-m+r+n+19)%32;	//11

		System.out.println("Easter will fall on Day " +p+" of Month "+n);
		

	}


}	
