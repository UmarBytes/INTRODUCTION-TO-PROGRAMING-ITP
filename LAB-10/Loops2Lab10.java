//This is the First portion of second task to of Lab 10 

import java.util.Scanner;
public class Loops2Lab10{
    public static void main(String[] Umar) {
        Scanner input = new Scanner(System.in);
    
        double sum = 0.0;
        char choice = 'Y';
        for(;choice == 'Y' || choice == 'y';){
            System.out.print("please enter a number : ");
            int number = input.nextInt();

            sum += number;
            System.out.print("Press Y or y to close the program : ");
            choice = input.next().charAt(0);
        }//for
        System.out.print("The Sum of Total running number is : " + sum);
    
    }//main
}//class