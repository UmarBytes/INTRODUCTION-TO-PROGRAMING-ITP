import java.util.Scanner;

public class ExponentLab8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter Base:   ");
        long baseNum = read.nextLong();
        System.out.print("Enter Exponent:   ");
        long exponentNum = read.nextLong(), i = 0, result = 1;

        while (i < exponentNum) {
            result *= baseNum;
            i++;
        }
        System.out.println("\n\t\t" + baseNum + " ^ " + exponentNum + " = " + result + "\n");
        read.close();
    }
}
