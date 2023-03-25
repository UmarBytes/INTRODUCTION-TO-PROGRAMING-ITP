import java.util.Scanner;
public class task4{
public static void main(String[]args){
Scanner in  = new Scanner(System.in);
System.out.print("Enter Size: ");
int Size = in.nextInt();
int [] l = new int[Size];
for(int y = 0; y < l.length; y++){
System.out.print("Enter value " + y + ": ");
l [y] = in.nextInt();
}
System.out.print("Enter S to Smallest or L to Largest:");
char c = in.next().charAt(0);

int e = library.getSLIndex(l,c);
if(e == -1){
System.out.println("invalid! " + e);
} else 
if(c == 'L'){
System.out.println("Larges Value: " + e);
} else { if(c == 'S'){
System.out.println("Smalles Value: " + e);
}}
}}