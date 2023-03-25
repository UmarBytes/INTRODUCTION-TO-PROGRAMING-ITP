public class JavaExpressionsLab4{

	public static void main(String[] args){

//1st Expression
		double s0 = 5, v0 = 10, t =5, g = 10 ;
		double s = s0 + v0 * t +(g*Math.pow(t,2))/2;
		System.out.println("Value of S = " +s);

//2nd Expression
		double v = 10, P = 2110, I = 254 , N = 258 , T =254 , Y =0.64, R=0.005,S=0.14;
		double rhs = P*v*(Math.pow(1+(I*N*T/100),Y*R*S));
		System.out.println("Value of FV = " +rhs);
		
//3rd Expression
		
		double con = 4*Math.pow(Math.PI,2), a = 10, p =5, m1=25,m2=5;
		double gValue = con*Math.pow(a,3) / (Math.pow(p,2)*(m1+m2));
		System.out.println("Value of G = " +gValue);
//4th Expression
		
		double a1 = 25,b=22.15,gamma=1.025;
		double sol=  Math.sqrt(Math.pow(a1,2)+Math.pow(b,2)-2*a1*b*Math.cos(gamma));
		System.out.println("Value of c = " + sol);

	}


}