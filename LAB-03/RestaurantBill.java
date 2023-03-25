public class RestaurantBill{

	public static void main(String[] args){

		int mealCharge=3000;
		double tax = mealCharge*6.75/100;
		double totalCharge = mealCharge+tax;
		double tip = totalCharge*20/100;
	
		System.out.println("Meal Charge = " +mealCharge);
		System.out.println("Tax on the Meal = " +tax);
		System.out.println("Total Charge = " +totalCharge);
		System.out.println("Tip on Meal = " +tip);

	
		
	}

}