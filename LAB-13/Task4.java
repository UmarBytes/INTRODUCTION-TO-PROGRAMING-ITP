import java.util.Scanner;
public class Task4{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);      

       	 System.out.print("Enter the Size for the Array :        ");
       	 int lengthOfTheArrayForSmallLarge = read.nextInt();
       	 int[] arrayForSmallestAndLargest = new int[lengthOfTheArrayForSmallLarge];
       	 arrayForSmallestAndLargest = ArrayMethodsLab13.populateArray(arrayForSmallestAndLargest);
       	 System.out.print("\nType -- S for Smallest && L for Largest --- :        ");
       		 char typeOfValue = read.next().charAt(0);
       			 String type = "";
       			 if (typeOfValue == 'L') {
       		                  type = "Largest";
  			      } else {
  		          type = "Smallest";
        }//if
        	System.out.println("Index of the " + type + 
	" Value in the Entered Array is at Index " + ArrayMethodsLab13.getSLIndex(arrayForSmallestAndLargest, typeOfValue));

	}//main
}//class