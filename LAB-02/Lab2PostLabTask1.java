/*
#QUESTION
1.Use appropriate variables to store data and swap values.
2. Indent your code.
3. Print the output with an appropriate message.
*/
public class Lab2PostLabTask1{
	public static void main(String[] args){
		
		int a = 5;
		int b = 2;

		System.out.println("Value of variable a before swapping = "+ a);
		System.out.println("Value of variable b before swapping = " + b);

		int z = a ;
		a=b;
		b=z;
		
		System.out.println("Value of variable a after swapping = " + a);
		System.out.println("Value of variable b after swapping = " + b);
	}
}