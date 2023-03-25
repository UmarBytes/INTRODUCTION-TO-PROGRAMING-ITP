import java.util.Scanner;
public class WhileLoops2Lab8 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int i = 1 , evenSum = 0 , oddSum = 0;
        System.out.print("\n");
        while (i<=20) {
            
            System.out.print("Enter the Number " + i + " :  ");
            int num = read.nextInt();
                if (num%2==0) {
                    evenSum++; 
                }
                else{
                    oddSum++;
                }                    
            i++;
        }
        System.out.println("\n\t Number of the Even numbers entered: " + evenSum);
        System.out.println("\t Number of the Odd numbers entered: " + oddSum + "\n");

        read.close();
        
        

    }
}
