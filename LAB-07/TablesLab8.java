import java.util.Scanner;
public class TablesLab8{
	public static void main(String[] args){

		Scanner read = new Scanner(System.in);
		System.out.print("Enter a number:   ");
		int num = read.nextInt();
		System.out.print("Enter the starting number:   ");
		int numStart = read.nextInt();
		System.out.print("Enter an ending number:   ");
		int numEnding = read.nextInt();
			int multiplication = 0;
	
		if( num > 1 && numStart > 1 && numEnding > 1){
			while( numStart <= numEnding ){
				multiplication = num * numStart;
				System.out.println(num + " * " + numStart + " = " + multiplication);
					numStart++;
			}
	
		}else{
			System.out.println("\n\tPlease enter a positive numbers");
					
		}
		
		System.out.println("  ");


	}


}