import java.util.Scanner;

	public class library{
	public static void length(int [] a){
		int length = 0 ;
		for(int i = 0 ; i<a.length ; i++){
		if(a[i] >length){
		length = a[i];
		}}
		System.out.println("the number " + length + " is large");
		}
		public static boolean getindex(int [] a , int b){
		boolean flag  ;
		if(a[1] == b){

		flag = true;
		}else 
		flag = false;
		return flag;
		}
	
		public static int getNthIndex(int[] array, int occurrence, int value){

		int o = 0, d = 0;
		for(int i = 0; i <array.length; i++){
		if(value == array[i]){
		o = o + 1;
		}
		if(o == occurrence){
		d = i;
		break;
		}else{
		d = -1;
		}
		}
		return d;
		}
		public static int getSLIndex(int[] array, char typeOfValue){
		int ex = 0, s = 0, l = 0;
		if(typeOfValue != 'S' && typeOfValue != 'L'){
		ex = -1;
		}else{ for(int i = 1; i < array.length; i++){
		if(typeOfValue == 'S'){
		if(array[s] > array[i]){
		s = i;
		ex = s;
		}
		}
		if(typeOfValue == 'L'){
		if(array[l] < array[i]){
		l = i;
		ex = l;
		}
		}	
		}
		}
		return ex;
		}
		public static void countEvenOddIntegers(int[] array){
		int e = 0, o = 0;
		for(int i = 0; i < array.length; i++){
		if(array[i] % 2 == 0){
		e = e + 1;
		}else{
		o = o + 1;
		}
		}	
		System.out.println("EVEN: " + e);
		System.out.println("ODD: " + o);
		}
		public static void checkNames(String[] str){
	                Scanner input = new Scanner(System.in);
	                for (int i = 0;i < str.length ;i++ ) {
                  	System.out.println("Enter Names" + i);
           		str[i] = input.nextLine();
                  
            		}
      		for (int i = 0;i < str.length ;i++ ) {
     
     	 	 if (str[i].charAt(0)>= 'A' && str[i].charAt(0)<= 'Z') {
      	 	
      		 }else{
      	 	System.out.println("Invalid ");
      	 	}
      	 	if (str[i].length()>=3 && str[i].length() <= 32) {
      	 	
      	 	}else{
      	 	System.out.println("Invalid");
      		 }
      		 for (int j = 0;j < str[i].length();j++ ) {
      	 	if (str[i].charAt(j) >= '0' && str[i].charAt(j)<='9') {
      	 		System.out.println("Invalid");
      	 	}
      		 }
      		 System.out.println("Your Name is..... " + str[i]);
      		}
  
		}
		public static void seperateNames(String[] str ){
		Scanner input = new Scanner(System.in);
		for (int i = 0;i < str.length ;i++ ) {
		System.out.println("Enter Names" + i);
	                 str[i] = input.nextLine();
		}
		System.out.println("Enter Character You Want To Find");
		char ab = input.next().charAt(0);
		for (int i = 0;i < str.length ;i++  ) {
		for (int j = 0;j < str[i].length();j++ ) {
		if (str[i].charAt(j) ==ab ) {
			System.out.println("Your word is "+str[i]);
			System.out.println("Your Character Index is " + j);
	}
	}}
	}
		public static void reverse1(int[] a){
		System.out.println("Ur value \n");
		for (int i = 0;i < a.length ;i++ ) {
			System.out.print(a[i] + " ");
				}
		System.out.print("\nUr reverse value \n");
		int[] c = new int[a.length];
		for (int i = 0;i < a.length ;i++ ) {
		c[i] = a[a.length-i-1];
		System.out.print(c[i] + " ");
		}
		
		}


		public static void evenPrnt(int[] a ){
		for (int i = 0;i < a.length ;i++ ) {
			if (a[i] % 2 == 0 ){
				System.out.print("Your Even value is \n");
			System.out.print(a[i] + "\n");
			}
		}

		}
		public static void evenIndex(int[] a ){
		for (int i = 0;i < a.length ;i++ ) {
			if (a[i] % 2 == 0 ){
				System.out.print("Your Even index " + (i+1) +"\n");
				
			}
		}
		}
		public static void reverse(int[] a){
		System.out.println("Ur value \n");
		for (int i = 0;i < a.length ;i++ ) {
			System.out.print(a[i] + " ");
				}
		System.out.print("\nUr reverse value \n");
		int[] c = new int[a.length];
		for (int i = 0;i < a.length ;i++ ) {
		c[i] = a[a.length-i-1];
		System.out.print(c[i] + " ");
		}
		
		}
	

	
		}
