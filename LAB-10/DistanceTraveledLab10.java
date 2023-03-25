import java.util.Scanner;
public class DistanceTraveledLab10{
    public static void main(String[] Umar) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed of your vehicle : ");
        int speed = input.nextInt();

        while(speed <= 0){
            System.out.print("The speed might br positive ");

            System.out.print("Enter the speed for vehicle again : ");
            speed = input.nextInt();

        }//while
        System.out.print("Please enter the number of hours that vehacle takes : ");
        int Time = input.nextInt();

        while (Time < 1){
            System.out.print("Please enter a positive number for time : ");
            System.out.print("Please enter the time that takes vehicale takes Again:");
            Time = input.nextInt();

        }//while

        int Distance = speed * Time;
        int Hours = 1;
        int distancetraveled = speed;

        System.out.println("Hours \t\tDistance Traveled");
        System.out.println("-------+-------------------");

        while(Hours <= Time){
            System.out.println(Hours+"\t\t"+distancetraveled);
            Hours += 1;
            distancetraveled +=speed;
        }//while

            }//main
}//class