public class NestedLoopsLab11{
	public static void main(String [] args){
		for(int i = 1;  i <= 10; i++){
			
		for(int j = i; j <= i * 10; j +=i){
			System.out.print("\t"+j+ " ");
		}//inner for loop
			System.out.println();
		}//outer for loop
	}//main
}//class