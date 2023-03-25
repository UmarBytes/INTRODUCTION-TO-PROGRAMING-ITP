import java.util.Scanner;
public class WhileLoops1Lab9{
     public static void main(String[] Umar) {

                final int LOOP =10;
                Scanner input = new Scanner(System.in);
                int SumOFEven = 0;
                int sumOFOdd = 0;
                 int i = 0;
                 while (i<LOOP){
                     System.out.print("Enter 10 number in one after one  "+(i+1)+ ":");
                     int number = input.nextInt();
                     if(number %2==0){
                     SumOFEven += number;
                     }
                     else{
                         sumOFOdd += number;

                     }
                     i++;
                 }
	        System.out.println("Sum of all Even Number is  :"+SumOFEven);
	        System.out.println("Sum of all odd number is :" +sumOFOdd);

	    }//mai
}//class
