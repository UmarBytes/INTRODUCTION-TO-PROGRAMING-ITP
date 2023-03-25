// This is the second part of task 2 
// *while loop portion 
import java.util.Scanner;
public class Loops2BLab10{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double sum = 0.0;
                 char choice = 'Y';
        while (choice == 'Y' || choice == 'y'){
            System.out.print("Please enter a number : ");
            int number = input.nextInt();
            sum += number;
            System.out.print("Press Y or y to repeate :");
            choice = input.next().charAt(0);
        
	}//while
	System.out.print("The sum of rupeetive number is : "+sum);	
        
              }//main
}//class