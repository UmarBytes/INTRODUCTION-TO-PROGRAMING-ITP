import java.util.Scanner;
public class task5{
public static void main(String[]args){
Scanner  in = new Scanner(System.in);
System.out.print("Enter Size: ");
int size = in.nextInt();
int [] ar = new int[size];
for(int i = 0; i < ar.length; i++){
System.out.print("Enter value " + i + ": ");
ar [i] = in.nextInt();
}
library.countEvenOddIntegers(ar);
}}