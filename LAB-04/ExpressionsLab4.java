public class ExpressionsLab4{
	public static void main(String[] args){

		int m =18, n =17;
		int exp1 = n/10+n%10;
		int exp2 = n%2+m%2;
		int exp3 = (m+n) / 2;
		double exp4 = (m+n) / 2.0;
		int exp5 = (int)(0.5*(m+n));
		int exp6 = (int)Math.round(0.5*(m+n));

		System.out.println("Value of Expression 1: " + exp1);
		System.out.println("Value of Expression 2: " + exp2);
		System.out.println("Value of Expression 3: " + exp3);
		System.out.println("Value of Expression 4: " + exp4);
		System.out.println("Value of Expression 5: " + exp5);
		System.out.println("Value of Expression 6: " + exp6);
	




	}


}