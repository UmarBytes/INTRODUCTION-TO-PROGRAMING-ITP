import java.util.Scanner;
public class PrimeNumber2Lab9{
    public static void main(String[] Umar) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Please enter a number to check that the number is prime or not ? : ");
	        int number = input.nextInt();
	        boolean isPrime = true;
	        int i = 2;
	        while(i<number/2){
	            if(number %2 == 0){
	                isPrime = false;
	            }//if
	            i++;
	        }//while
	        if(isPrime){
            System.out.println("The number you have entered "+ number+ "is prime number");
	        }//if
	        else{
            System.out.println("The number you have entered "+ number + " is Not a prime number");
	
	        }//else
    }//main
}//class