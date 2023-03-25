import java.util.Scanner;
public class PrimeNumber1Lab9{
	    public static void main(String[] Umar) {
	    Scanner input = new Scanner(System.in);

	        System.out.print("Please enter a number to check it that was prime number or not ?  ");
                         int number = input.nextInt();
                         int sqrt = (int)Math.sqrt(number);
                         boolean isprime = true;
                         int i =2;
                        
                       while(i<sqrt){
                       if(number %2 == 0){
                                  isprime =false;
                        }//if
                        ++i;
                        }//while
       
                        if(isprime){
                        System.out.println("The number "+number+" is prime number");
                        }//if
                        else
                        System.out.println("The is not a prime number please try again");

	}//main
}//class