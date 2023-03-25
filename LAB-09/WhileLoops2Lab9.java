import java.util.Scanner;
public class WhileLoops2Lab9{
    public static void main(String[] Umar) {
        final int LOOP = 20;
        Scanner input = new Scanner(System.in);
	        int Counteven = 0;
	        int Countodd = 0;
	        int i = 0;
        
	while (i<LOOP){
            	System.out.print("please enter numbers and check how many are the evens or how many odds"+(i+1)+":");
                 int number = input.nextInt();
            if(number %2==0){
                Counteven++;
            }//if
            else{
                Countodd++;
            }//else
            i++;
        }//while
        System.out.println("number of even numbers are :"+Counteven);
        System.out.println("numbver of odd numbers are :" +Countodd);
    }//main
}//class