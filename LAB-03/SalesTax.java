public class SalesTax{

	public static void main(String[] args){

		double amountOfPurchase = 1000;
		double stateSalesTax = amountOfPurchase*4/100, countrySalesTax = amountOfPurchase*2/100, totalSalesTax= stateSalesTax+countrySalesTax;
		double totalSale = amountOfPurchase+totalSalesTax;	

		System.out.println("Amount of the Purchase = "+amountOfPurchase);
		System.out.println("State Sales Tax = " +stateSalesTax);
		System.out.println("Country Sales Tax = " +countrySalesTax);
		System.out.println("Total Sales Tax = " + totalSalesTax);
		System.out.println("Total of the Sales = " + totalSale);
	

	}

}