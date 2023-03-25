import java.util.Scanner;

public class WhileLoops3Lab8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("\n\t\t *** First Number  must be less than Second Number ***");
        System.out.print("\nEnter the First Integer: ");
        int firstNum = read.nextInt();
        System.out.print("Enter the Second Integer:  ");
        int secondtNum = read.nextInt();

        int evenSum = 0, oddSum = 0, i = 1, oddSum1 = 0, oddSumSquare = 0;
        while (firstNum <= secondtNum) {
            if (firstNum % 2 == 0) {
                evenSum += firstNum;
            } else {
                oddSum += firstNum;
            }
            System.out.println("\t\tNumber " + i + " is " + firstNum + " \t\t Square of the Number " + firstNum + " is "
                    + firstNum * firstNum);
            if (firstNum % 2 != 0) {
                oddSum1 += firstNum * firstNum;
                oddSumSquare = oddSum1;
            }

            firstNum++;
            i++;

        }

        System.out.println("\nSum of Even Numbers is: " + evenSum);
        System.out.println("Sum of Odd Numbers is: " + oddSum);
        System.out.println("Sum of the Squares of the Odd Numbers is: " + oddSumSquare + "\n");
        read.close();
    }
}
