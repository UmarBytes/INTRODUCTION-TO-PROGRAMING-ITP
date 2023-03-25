package com.company;
import java.util.Scanner;
public class Loops3BLab100{
	public static void main(String[] Umar) {
                 Scanner input = new Scanner(System.in);

   	 char choice = 'Y';
        while(choice == 'Y' || choice == 'y'){
                  System.out.print("Please enter the First number :");
                 int FirstNumber = input.nextInt();

       System.out.print("Please enter the Second number : ");
               int SecondNumber = input.nextInt();

               int sum = FirstNumber + SecondNumber;
       System.out.println("The sum of number first and number second number is : " +sum);
       System.out.println("Press Y or y to stop the program >>>");
        
	}//while

	}//main
}//class