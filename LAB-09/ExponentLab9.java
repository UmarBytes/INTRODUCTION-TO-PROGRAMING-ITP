import java.util.Scanner;
public class ExponentLab9{
	public static void main(String[] umar){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter the Base : ");
	int Base = input.nextInt();

	System.out.print("PLease enter the 'power' of the Base number : ");
	int exponent = input.nextInt();
	
	if(Base >= 0 && exponent >=0){
	int power = 1, i = exponent;

	while(i>0){
	     power *= Base;
	--i;

	}//while
		System.out.println(Base+ "^"+ exponent+ "=" +power);
	}//if

	}//main
}//class