import java.util.Scanner;
public class LetterGradelab6{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter your Grades:");
		String inputChar = read.nextLine();
		
		double grade ;
		
		if(inputChar.charAt(0) == 'a' || inputChar.charAt(0) == 'A')
		{
			grade = 4.0;
			    if( (inputChar.length()==2) && inputChar.charAt(1)== '-')
			     {
			     		grade -= 0.3;
			     }
			System.out.println("Your Numeric Grades are " + grade);
		}
		else if(inputChar.charAt(0) == 'b' || inputChar.charAt(0) == 'B') 
		{
			grade=3.0;
			     if( (inputChar.length()==2) && inputChar.charAt(1) == '+')
			     {
			     		grade += 0.3;
			     }else if( (inputChar.length()==2) && inputChar.charAt(1) == '-' )
			     {
			     		grade-=0.3;
			     }
			System.out.println("Your Numeric Grades are " + grade);
		}
		else if(inputChar.charAt(0) == 'c' || inputChar.charAt(0) == 'C') 
		{
			grade=2.0;
				if( (inputChar.length()==2) && inputChar.charAt(1) == '+')
				{
					grade += 0.3; 
				}else if( (inputChar.length()==2) && inputChar.charAt(1) == '-' )
				{
					grade -= 0.3;
				}
				System.out.println("Your Numeric Grades are " + grade);
		}
		else if(inputChar.charAt(0) == 'd' || inputChar.charAt(0) == 'D') 
		{
			grade=1.0;
				if( (inputChar.length()==2) && inputChar.charAt(1) == '+')
				{
					grade += 0.3; 
				}else if( (inputChar.length()==2) && inputChar.charAt(1) == '-' )
				{
					grade -= 0.3;
				}	
				System.out.println("Your Numeric Grades are " + grade);
		}
		else if(inputChar.charAt(0) == 'f' || inputChar.charAt(0) == 'F') 
		{ 
			grade = 0.0;
				if( (inputChar.length()==2) && (inputChar.charAt(1) == '+' || inputChar.charAt(1) == '-' ) ){
					System.out.println("ERROR: 'F' Grade can't have '+' or '-' values. Please correct this.");
				}else 
				{
					System.out.println("Your Numeric Grades are " + grade);	
				}
		}
		else{
				System.out.println("ERROR: Please enter the correct Grades");
		}
	}
}
