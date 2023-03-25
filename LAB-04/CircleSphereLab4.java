import java.util.Scanner;
public class CircleSphereLab4{
	public static void main(String[] args){
//Input		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double inputRadius = userInput.nextDouble();
		System.out.println("Entered radius of the circle is: " + inputRadius);
	
		double area = Math.PI*inputRadius;
		double circum = 2*Math.PI*Math.pow(inputRadius,2);
		double volume = (4/3)*Math.PI*Math.pow(inputRadius,3);
		double surface = 4*Math.PI*Math.pow(inputRadius,2);


		System.out.println("Area of the circle with given radius is: " + area);
		System.out.println("Circumference of the circle with given radius is: " + circum);
		System.out.println("Volume of the Sphere with given radius is: " + volume);
		System.out.println("Surface Area of the Sphere with given radius is: " + surface);
	}

}

