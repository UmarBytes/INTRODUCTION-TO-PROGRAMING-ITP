import java.util.Scanner;
public class WhileLoops1Lab8{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the number to find square less than the number.   ");
		int num = read.nextInt();
		int i = 0 , j = 10 , k = 0, result;
		
			System.out.print("Squares less than " + num + " are: ");		// a-part
				while( (i*i) < num ){
					System.out.print( (i*i) + " ") ; 
					i++;
				} // 1st while loop ended
			System.out.println("\n-----------------------------------");
				
			System.out.print("Enter number to print numbers divisible by 10.  ");		// b-part
			int num1 = read.nextInt();
			System.out.print("Numbers divisible by 10 and less than " + num1 + " are: ");
					while( j < num1){
						System.out.print(j + " ");
						j += 10;
					}
			System.out.println("\n-----------------------------------");
			
			System.out.print("Enter number to calculate all powers of 2 less than that number.   ");	// c-part
			int num2 = read.nextInt();
			System.out.print("Powers of 2 less than the number " + num2 +" are: ");
				while( (Math.pow(2,k) ) < num2 ){
					System.out.print( ( Math.pow(2,k) ) + "  ") ;
					k++;	
				}
				System.out.println("\n-----------------------------------");
			
			
	}

}
