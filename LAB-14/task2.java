import java.util.Scanner;
public class task2{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the size of the length; ");
int size = input.nextInt();

int [] a = new int[size];
for(int i = 0 ; i <a.length ; i++){
System.out.println("enter the value of index " + i + " ; ");
a[i] = input .nextInt();
 }
System.out.println("Enter the num");
int num = input.nextInt();


boolean numb = library.getindex(a , num);
if(numb)
System.out.println("yes the number " + num + " is at second position") ;
else 
System.out.println("No the number " + num + " is not  at second position") ;
}}