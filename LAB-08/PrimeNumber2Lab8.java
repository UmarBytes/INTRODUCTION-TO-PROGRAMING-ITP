import java.util.Scanner;

public class PrimeNumber2Lab8 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter a Positive Integer:  ");
        int num = read.nextInt();
        int halfnum = num / 2, i = 2;
        boolean result = true;

        while (i <= halfnum) {
            if (num % i == 0) {
                result = false;
            }
            i++;
        }
        System.out.println("\tIs Number " + num + " a prime??\n\t\t" + result);
        read.close();
    }
}
