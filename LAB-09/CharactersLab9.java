public class CharactersLab9{
	    public static void main(String[] Umar) {
	        System.out.println("All Uper case Letters : ");
	        char C = 'A';
	        while (C<='Z') {
	            System.out.println(C);
	            C++;
	        }//while
	        System.out.println("All Lower letters : ");
	        C = 'a';
	                while(C <= 'z'){
	                    System.out.println(C);
	                C++;
	                }
	        System.out.println("The lower case letters are start from 'a' and Skipping two letters");
	                C = 'a';
	                while(C<= 'z'){
	                    System.out.println(C);
	                    C += 3;

	                }
	        System.out.println("All uper case letters Z to K");
	                C = 'Z';
	                while(C >='K'){
	                    System.out.println(C);
	                    C--;
	                }
	        }
	    }//main
