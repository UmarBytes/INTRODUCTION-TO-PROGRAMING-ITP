import java.util.Scanner;
public class WhileLoops1Lab8{
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int i = 1 , evenSum = 0 , oddSum = 0;

            while( i <= 10 ){

                System.out.print("Enter the Number " + i + " :    ");
                int num = read.nextInt() ;

                    if (num%2==0) {
                        evenSum += num;
                    }
                    else{
                        oddSum += num;
                    }
                i++;
            }
        System.out.println("\n\tSum of the Even numbers is: " + evenSum);
        System.out.println("\tSum of the Odd numbers is:  " + oddSum + "\n");
            read.close();


    }


}