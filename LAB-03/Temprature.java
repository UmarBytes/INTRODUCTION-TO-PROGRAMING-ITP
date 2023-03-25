public class Temprature{

	public static void main(String[] args){

		double tempCentigrade = -273.15 ;
		double tempFahrenheit = 68.5;

//Conversion:

		double centigrade = (tempFahrenheit - 32) * 5/9;
		double fahrenheit = (tempCentigrade * 9/5) + 32;

		System.out.println("Temprature " + tempFahrenheit +"°F in Centigrades is " +centigrade +"°C");
		System.out.println("Temprature " + tempCentigrade +"°C in Fahrenheit is "+ fahrenheit +"°F");
	
	}

}