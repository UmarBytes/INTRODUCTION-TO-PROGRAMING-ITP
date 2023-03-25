import java.util.Scanner;
public class task3{
public static void main(String[]args){
  Scanner in = new Scanner(System.in);
System.out.print("Enter Size");
int size = in.nextInt();
int [] b = new int[size];
for(int i = 0; i < b.length; i++){
System.out.print("Enter value at " + i + ": ");
b [i] = in.nextInt();
}
System.out.println("Enter a Value: ");
int i = in.nextInt();
System.out.print("Enter Number: ");
int a = in.nextInt();
while(a < 2){
System.out.println("Enter the number Greater than 0: ");
a = in.nextInt();
}
int num = library.getNthIndex(b,i,a);
if(num == -1){
System.out.println("Invalid! " + num); 
} else{
System.out.println("Index of nth value " + a + " is: " + num);
}


}
}