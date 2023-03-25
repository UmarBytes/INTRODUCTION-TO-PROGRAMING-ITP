import java.util.Scanner;
public class DiscountCouponLab6
{
	public static void main(String[] args)
	{
	
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the cost of the groceries: ");
		double cost = read.nextDouble() , discount = 0;
		
			if( cost > 0 && cost < 10 )
			{
				discount = 0;
			}
			else if( cost >= 10 && cost < 60 )
			{
				discount = cost * 8 / 100;
			}
			else if( cost > 60 && cost < 150 )
			{
				discount = cost * 10 / 100;
			}
			else if( cost > 150 && cost < 210 )
			{
				discount = cost * 12 / 100;
			}
			else if( cost > 210 )
			{
				discount = cost * 14 / 100;
			}else
			{
				System.out.println("\tERROR: Purchasing can't be negative.");
			}
		
		if( cost < 10 && cost >=0 )
		{
			System.out.println("\tSORRY: We don't offer any Discount coupons for purchases less than $10 at the moment.");
		}
		else if ( cost >= 10 )
		{
			System.out.println("You've won discount coupon of $" + discount + " on your purchase of $" + cost +" .");
		}
		
	}	

}
