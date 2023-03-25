import java.util.Scanner;

public class CelsiusToFahrenheirLab8 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Starting range of Celsius:   ");
        int celsiusStartingInput = read.nextInt();
        System.out.print("Enter the Ending range of Celsius:   ");
        int celsiusEndingInput = read.nextInt();
        int tempInFahrenheit = 0;
        System.out.println("\n\t\t Celsius | Fahrenheit \n\t\t --------+------------");
        while (celsiusStartingInput <= celsiusEndingInput) {
            tempInFahrenheit = celsiusStartingInput * 9 / 5 + 32;
            System.out.println("\t\t " + celsiusStartingInput + " \t | \t" + tempInFahrenheit);
            celsiusStartingInput += 10;
        }
        read.close();
    }
}
